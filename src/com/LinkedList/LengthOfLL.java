package com.LinkedList;

public class LengthOfLL {
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

    private static int lengthOfLL(Node head)
    {
        int cnt = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        System.out.println(lengthOfLL(head));
    }
}
