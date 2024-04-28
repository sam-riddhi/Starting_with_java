package com.LinkedList;

public class InsertionAtKth
{
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

    private static Node insertPosition(Node head, int el, int k)
    {
        if(head == null)
        {
            if(k == 1)
            {
                return new Node(el);
            }
            else
            {
                return head;
            }
        }
        if(k == 1)
        {
            return new Node(el, head);
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null)
        {
            cnt++;
            if(cnt == (k - 1))
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
        head = insertPosition(head, 100, 3);
        print(head);
    }
}
