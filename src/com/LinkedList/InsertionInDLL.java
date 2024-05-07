package com.LinkedList;
class Nodee_ {
    int data;
    Nodee_ next;
    Nodee_ back;

    Nodee_(int data1, Nodee_ next1, Nodee_ back1)
    {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Nodee_(int data1)
    {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class InsertionInDLL {
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
    private static Nodee_ insertBeforeHead(Nodee_ head, int val)
    {
        Nodee_ newHead = new Nodee_(val, head, null);
        head.back = newHead;

        return newHead;
    }

    private static Nodee_ insertBeforeTail(Nodee_ head, int val)
    {
        if(head.next == null)
        {
            return insertBeforeHead(head, val);
        }
        Nodee_ tail = head;
        while (tail.next != null)
        {
            tail = tail.next;
        }

        Nodee_ prev = tail.back;
      //  Nodee_ newNode = new Node(val, tail, prev);
        //prev.back = newNode;
        //tail.back = newNode;
        return head;

    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Nodee_ head = convertArr2Dll(arr);
        //head = insertBeforeHead(head, 10);
        head = insertBeforeTail(head, 10);
        print(head);
    }
}
