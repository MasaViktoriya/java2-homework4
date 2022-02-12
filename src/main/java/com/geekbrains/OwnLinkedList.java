package com.geekbrains;

public class OwnLinkedList<T> {
    private long size;
    private Node head;
    private Node tail;

    public OwnLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    public  void insertNode(T data, int index){
        try {
            if (index > size || index < 0) {
                System.out.println("Введенный индекс за пределами списка");
                return;
            }
            Node newNode = new Node(data);
            Node current = head;
            if (head == null || index == size - 1) {
                addNode(data);
            } else {
                if (index == 0) {
                    newNode.next = head;
                    head = newNode;
                    size++;
                } else {
                    for (int i = 1; i < index; i++) {
                        current = current.next;
                    }
                    newNode.next = current.next;
                    current.next = newNode;
                    size++;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void deleteNode(int index) {
        try {
            if (index > size || index < 0) {
                System.out.println("Введенный индекс за пределами списка");
                return;
            }
            Node current = head;
            if (index == 0) {
                for (int j = 0; j < size - 2; j++) {
                    current.data = current.next.data;
                    current = current.next;
                }
                current.data = current.next.data;
                current.next = null;
                size--;
            } else if (index == size - 1) {
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.next = null;
                size--;
            } else {
                for (int i = 1; i <= index; i++) {
                    current = current.next;
                }
                for (int j = index; j < size - 2; j++) {
                    current.data = current.next.data;
                    current = current.next;
                }
                current.data = current.next.data;
                current.next = null;
                size--;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void changeNode(T data, int index) {
        try {
            if (index > size || index < 0) {
                System.out.println("Введенный индекс за пределами списка");
                return;
            }
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                if (index == 0) {
                    head.data = newNode.data;
                } else {
                    Node current = head;
                    for (int i = 1; i <= index; i++) {
                        current = current.next;
                    }
                    current.data = newNode.data;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("Односвязный список пуст");
            return;
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void display(int index) {
        if (index > size || index < 0) {
            System.out.println("Введенный индекс - за пределами списка");
            return;
        }

        Node current = head;

        for (int i = 1; i <= index; i++) {
            current = current.next;
        }

        System.out.println(current.data);
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
