package com.autoPartsStore.app.util.impl;

import com.autoPartsStore.app.util.Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;


public class FileWriterImpl<T> implements Writer<T> {

    @Override
    public void write(String path, Collection<T> collection) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
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