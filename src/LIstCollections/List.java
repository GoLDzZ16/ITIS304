package LIstCollections;

import draft.EmptyElementException;

public interface List <T> {
    void add(T e) throws EmptyElementException;
    Object get(int index) throws IndexOutOfBoundsException;
    int size();
    void delete(int index) throws IndexOutOfBoundsException;
    Object pop(); //возвращаем последний элемент и удаляем его

}
