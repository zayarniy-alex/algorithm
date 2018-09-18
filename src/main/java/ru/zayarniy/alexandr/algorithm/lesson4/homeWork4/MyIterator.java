package ru.zayarniy.alexandr.algorithm.lesson4.homeWork4;

import java.util.Iterator;

public interface MyIterator<T> extends Iterator {
    void reset();
    boolean atEnd();
    boolean atBegin();
    T deleteCurrent();
    void insertAfter(T c);
    void insertBefore(T c);
    T getCurrent();
}