package com.LinkedList;

public class InsertBeforeVal {
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

    private static Node insertBeforeValue(Node head, int el, int val)
    {
        if(head == null)
        {
            return null;
        }
        if(head.data == val)
        {
            return new Node(el, head);
        }
        Node temp = head;
        while(temp.next != null)
        {
            if(temp.next.data == val)
            {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        head = insertBeforeValue(head, 100, 5);
        print(head);
    }
}
