package com.LinkedList;


public class convertarr2ll {
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

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
