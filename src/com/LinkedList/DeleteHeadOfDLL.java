package com.LinkedList;

class Node_ {
    int data;
    Node_ next;
    Node_ back;

    Node_(int data1, Node_ next1, Node_ back1)
    {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node_(int data1)
    {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DeleteHeadOfDLL {
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

    private static Node_ deleteHead(Node_ head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node_ prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node_ head = convertArr2Dll(arr);
        head = deleteHead(head);
        print(head);
    }

}
