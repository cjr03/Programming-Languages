//package com.company;
import java.util.Scanner;
class Main
{
    public static void main(String args[]) {
        int c, n, search;
        SortedList slist = new SortedList();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        System.out.println("Enter " + n + " integers in any order");
        for (c = 0; c < n; c++)
            slist.insert(in.nextInt());
        System.out.println("Sorting List");
        in.close();
        slist.quicksort(slist.input, 0, slist.input.size()-1);
        slist.print();
    }
}