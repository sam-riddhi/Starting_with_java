package com.LinkedList;

class Nodee {
    int data;
    Nodee_ next;
    Nodee_ back;

    Nodee(int data1, Nodee_ next1, Nodee_ back1)
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
    public static void print(Nodee_ head)
    {
        while(head != null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    private static Nodee_ convertArr2Dll(int[] arr)
    {
        Nodee_ head = new Nodee_(arr[0]);
        Nodee_ prev = head;
        for(int i = 1; i < arr.length; i++)
        {
            Nodee_ temp = new Nodee_(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Nodee_ head = convertArr2Dll(arr);
        print(head);

    }

}
