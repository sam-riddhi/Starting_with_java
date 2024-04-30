package com.LinkedList;

class Nodee {
    int data;
    Node_ next;
    Node_ back;

    Nodee(int data1, Node_ next1, Node_ back1)
    {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Nodee(int data1)
    {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DoublyLinkedList {
    public static void print(Node_ head)
    {
        while(head != null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node_ convertArr2Dll(int[] arr)
    {
        Node_ head = new Node_(arr[0]);
        Node_ prev = head;
        for(int i = 1; i < arr.length; i++)
        {
            Node_ temp = new Node_(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node_ head = convertArr2Dll(arr);
        print(head);

    }

}
