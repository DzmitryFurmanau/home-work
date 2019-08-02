package com.autoPartsStore.app.util;

import java.util.Collection;
import java.util.function.Function;

public interface Reader<T> {
    Collection<T> read(String path, Function<Object, T> objectTFunction);
}