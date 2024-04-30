package com.LinkedList;

class Nodee {
    int data;
    Nodee next;
    Nodee back;

    Nodee(int data1, Nodee next1, Nodee back1)
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
    public static void print(Nodee head)
    {
        while(head != null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    private static Nodee convertArr2Dll(int[] arr)
    {
        Nodee head = new Nodee(arr[0]);
        Nodee prev = head;
        for(int i = 1; i < arr.length; i++)
        {
            Nodee temp = new Nodee(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Nodee head = convertArr2Dll(arr);
        print(head);

    }

}
