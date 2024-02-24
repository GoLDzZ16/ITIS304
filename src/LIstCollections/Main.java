package LIstCollections;

import draft.EmptyElementException;

public class Main {
    public static void main(String[] args)throws EmptyElementException {
        Stack <String> test = new Stack<>();
        test.push(new Node<>("kEBAB"));
        test.push(new Node<>("kBAB"));
        test.push(new Node<>("kEAB"));
        test.tstr();
        Set <String> tst = new Set<>();
        tst.add("kEBAB");
        tst.add("kBAB");
        tst.add("kEAB");
        tst.add("kEAB");
        tst.next();
    }
}