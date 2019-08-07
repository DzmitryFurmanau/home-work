package com.autoPartsStore.app.util;

import java.util.Collection;

public interface Reader<T> {
    Collection<Object> read(T source);
}