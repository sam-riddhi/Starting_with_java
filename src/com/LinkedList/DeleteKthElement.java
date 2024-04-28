package com.LinkedList;

public class DeleteKthElement {
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    private static Node removeK(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2LL(arr);
        head = removeK(head, 3);
        print(head);
    }
}
