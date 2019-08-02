package com.autoPartsStore.app.util;

import java.util.Collection;

public interface Writer<T> {
    void write(String path, Collection<T> collection);
}