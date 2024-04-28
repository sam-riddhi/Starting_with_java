package com.LinkedList;

public class InsertionAtTail {
    private static Node convertArr2LL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node head)
    {
        while(head != null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    private static Node insertTail(Node head, int val)
    {
        if(head == null)
        {
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        head = insertTail(head, 100);
        print(head);
    }
}
