package com.autoPartsStore.app.util;

import java.util.Collection;

public interface Writer<T> {
    void write(T source, Collection<?> collection);
}