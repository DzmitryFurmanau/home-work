package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.annotation.processor.FileStoragePathProcessor;
import com.autoPartsStore.app.dao.GenericDao;
import com.autoPartsStore.app.domain.BaseEntity;
import com.autoPartsStore.app.util.Reader;
import com.autoPartsStore.app.util.Writer;
import com.autoPartsStore.app.util.impl.TextFileReaderImpl;
import com.autoPartsStore.app.util.impl.TextFileWriterImpl;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public abstract class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    private final Writer<String> writer;
    private final Reader<String> reader;
    private final Function<Object, T> mapper;
    private final String path;

    GenericDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
        this.writer = TextFileWriterImpl.getInstance();
        this.reader = TextFileReaderImpl.getInstance();
        this.mapper = mapper;
        this.path = FileStoragePathProcessor.getInstance().getPath(typeParameterClass);
    }

    @Override
    public Optional<T> save(T t) {
        final Collection<T> collection = getCollection();
        t.setId(generateId(collection));
        collection.add(t);
        writer.write(path, collection);
        return Optional.of(t);
    }

    private Collection<T> getCollection() {
        return reader.read(path).stream()
                .map(mapper)
                .collect(toList());
    }

    @Override
    public Optional<T> update(T t) {
        final Collection<T> collection = getCollection();
        final List<T> list = getUpdatedList(t, collection);
        writer.write(path, list);
        return Optional.of(t);
    }

    @Override
    public Collection<T> getAll() {
        return getCollection();
    }

    @Override
    public Optional<T> getById(Long id) {
        return getCollection().stream()
                .filter((o) -> o.getId().equals(id))
                .findFirst();
    }

    @Override
    public void delete(T t) {
        final Collection<T> collection = getCollection();
        final List<T> list = collection.stream()
                .filter((o) -> !(o.getId().equals(t.getId())))
                .collect(toList());
        writer.write(path, list);
    }

    @Override
    public void deleteAll() {
        writer.write(path, new ArrayList<>());
    }

    @Override
    public void deleteById(Long id) {
        final Collection<T> collection = getCollection();
        final List<T> list = collection.stream()
                .filter((o) -> !(o.getId().equals(id)))
                .collect(toList());
        writer.write(path, list);
    }

    private Long generateId(Collection<T> collection) {
        final Optional<Long> longOptional = collection.stream()
                .map(BaseEntity::getId)
                .max(Comparator.naturalOrder());
        return longOptional.orElse(0L) + 1L;
    }

    private List<T> getUpdatedList(T t, Collection<T> collection) {
        final Optional<T> elementOptional = collection.stream()
                .filter((o) -> o.getId().equals(t.getId()))
                .findFirst();
        final T element = elementOptional.orElseThrow(() -> new RuntimeException("Cannot update a non-existing object!"));
        return collection.stream()
                .map(o -> o.getId().equals(element.getId()) ? element : o)
                .collect(toList());
    }
}