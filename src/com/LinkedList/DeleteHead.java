package com.LinkedList;

import java.util.logging.SocketHandler;

public class DeleteHead {
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
    private static Node removesHead(Node head)
    {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        head = removesHead(head);
        print(head);
    }
}
