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

    private static Node_ deleteTail(Node_ head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node_ tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        Node_ newtail = tail.back;
        newtail.next = null;
        tail.back = null;

        return  head;
    }

    private static Node_ deleteKthelement(Node_ head, int k)
    {
        if(head == null)
        {
            return null;
        }

        int cnt = 0;
        Node_ kNode = head;
        while(kNode != null)
        {
            cnt++;
            if(cnt == k)
                break;
            kNode = kNode.next;
        }

        Node_ prev = kNode.back;
        Node_ front = kNode.next;

        if(prev == null && front == null)
        {
            return null;
        }

        else if(prev == null)
        {
            return deleteHead(head);
        }
        else if (front == null)
        {
            return deleteTail(head);
        }

        prev.next = front;
        front.back = prev;

        kNode.next = null;
        kNode.back = null;
        return head;
    }

//    private static Node_ deleteNode(Node_ temp)
//    {
//        Node_ prev = temp.back;
//        Node_ front = temp.next;
//
//        if(front == null)
//        {
//            prev.next = null;
//            temp.back = null;
//            return;
//        }
//
//        prev.next = front;
//        front.back = prev;
//
//        temp.next = temp.back = null;
//    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node_ head = convertArr2Dll(arr);
       // head = deleteHead(head);
       // head = deleteTail(head);
        //head = deleteKthelement(head, 3);
        //deleteNode(head);
        print(head);
        //return 0;
    }

}
