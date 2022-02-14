package com.geekbrains;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        OwnLinkedList<Integer> integerOwnLinkedList = new OwnLinkedList<>();
        integerOwnLinkedList.addNode(150);
        integerOwnLinkedList.addNode(347);
        integerOwnLinkedList.addNode(111);
        integerOwnLinkedList.addNode(789);
        integerOwnLinkedList.addNode(222);
        integerOwnLinkedList.addNode(345);

        System.out.println("Изначальный список");
        integerOwnLinkedList.display();

        System.out.println("\nВставляем данные по индексу 0");
        integerOwnLinkedList.insertNode(999, 0);
        integerOwnLinkedList.display();
        System.out.println("Новые данные по индексу 0:");
        integerOwnLinkedList.display(0);
        System.out.println("\nВставляем данные по индексу 3");
        integerOwnLinkedList.insertNode(333, 3);
        integerOwnLinkedList.display();
        System.out.println("Новые данные по индексу 3:");
        integerOwnLinkedList.display(3);
        System.out.println("\nВставляем данные по индексу 13");
        integerOwnLinkedList.insertNode(1000, 13);

        System.out.println("\nУдаляем данные по индексу 7");
        integerOwnLinkedList.deleteNode(7);
        integerOwnLinkedList.display();
        System.out.println("Удаляем данные по индексу 2");
        integerOwnLinkedList.deleteNode(2);
        integerOwnLinkedList.display();
        System.out.println("Удаляем данные по индексу 0");
        integerOwnLinkedList.deleteNode(0);
        integerOwnLinkedList.display();
        System.out.println("Удаляем данные по индексу -2");
        integerOwnLinkedList.deleteNode(-2);

        System.out.println("\nМеняем данные по индексу 0");
        integerOwnLinkedList.changeNode(777, 0);
        integerOwnLinkedList.display();
        System.out.println("Новые данные по индексу 0:");
        integerOwnLinkedList.display(0);
        System.out.println("\nМеняем данные по индексу 4");
        integerOwnLinkedList.changeNode(444, 4);
        integerOwnLinkedList.display();
        System.out.println("Новые данные по индексу 4:");
        integerOwnLinkedList.display(4);
    }
}