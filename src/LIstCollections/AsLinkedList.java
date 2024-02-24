package LIstCollections;

import draft.EmptyElementException;

public class AsLinkedList <T> implements List <T>{
    Node <T> head;
    Node<T> current = new Node <>(null);
    int size = 0;
    @Override
    public void add(T e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (head == null) {
            head = new Node <>(e);
            current.setNext(head);
            size = 1;
        } else {
            Node <T> current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.getNext();
            }
            current.setNext(new Node<>(e));
            size += 1;
        }
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T>res = head;
        for (int i = 0;i<index; i++) {
            res = res.getNext();
            counter += 1;
        }
        return res.getValue();
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T> res = head;
        for (int i = 0;i < index - 1;i++) { // знаем колличество
            res = res.getNext();
            counter += 1;
        }
        res.setNext(res.getNext().getNext());
        size--;
    }
    @Override
    public T pop(){
        int counter = 1;
        Node<T> res = head;
        while (counter < size - 1) {
            res = res.getNext();
            counter += 1;
        }
        size--;
        T p = res.getValue();
        return p;
    }
    @Override
    public int size(){
        return size;
    }
    public void tstr(){
        int counter = 0;
        Node <T> track = head;
        while (counter < size){
            System.out.print(track.getValue());
            System.out.print(" ");
            track = track.getNext();
            counter += 1;
        }
    }
}
