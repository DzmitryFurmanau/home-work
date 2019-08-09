package com.autoPartsStore.app.util.impl;

import com.autoPartsStore.app.util.Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class TextFileWriterImpl implements Writer<String> {
    private static TextFileWriterImpl instance;

    private TextFileWriterImpl() {

    }

    public static TextFileWriterImpl getInstance() {
        if (instance == null) instance = new TextFileWriterImpl();
        return instance;
    }

    @Override
    public void write(String source, Collection<?> collection) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(source)))) {
            collection.forEach((t) -> {
                try {
                    objectOutputStream.writeObject(t);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}