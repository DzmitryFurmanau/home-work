package main.java.autoPartsStore.util.impl;

import main.java.autoPartsStore.util.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class TextFileReaderImpl implements Reader<String> {

    private static TextFileReaderImpl instance;

    private TextFileReaderImpl() {

    }

    public static TextFileReaderImpl getInstance() {
        if (instance == null) {
            instance = new TextFileReaderImpl();
        }
        return instance;
    }

    @Override
    public Collection<Object> read(String source) {
        final ArrayList<Object> list = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(source)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                list.add(o);
            }
        } catch (EOFException e) {
            //empty
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}