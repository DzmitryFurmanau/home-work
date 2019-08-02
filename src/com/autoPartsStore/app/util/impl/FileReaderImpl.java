package com.autoPartsStore.app.util.impl;

import com.autoPartsStore.app.util.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class FileReaderImpl<T> implements Reader<T> {

    @Override
    public Collection<T> read(String path, Function<Object, T> objectTFunction) {
        final ArrayList<T> list = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                final T t = objectTFunction.apply(o);
                list.add(t);
            }
        } catch (EOFException e) {
            //empty
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}