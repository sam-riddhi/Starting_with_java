package com.samriddhi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID  = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Samriddhi Jaiswal");
                break;
            case 2:
                System.out.println("Saksham");
                break;
            case 3:
                System.out.println("Print employee no 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Mechanical":
                        System.out.println("Mechanical dept");
                        break;
                    default :
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}
