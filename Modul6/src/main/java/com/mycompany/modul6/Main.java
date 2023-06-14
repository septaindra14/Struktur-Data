package com.mycompany.modul6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(12);

        g.addEdge(1, 2);
        g.addEdge(2, 1);
        g.addEdge(2, 5);
        g.addEdge(5, 2);
        g.addEdge(5, 3);
        g.addEdge(5, 7);
        g.addEdge(5, 9);
        g.addEdge(9, 5);
        g.addEdge(9, 8);
        g.addEdge(8, 9);
        g.addEdge(8, 11);
        g.addEdge(11, 10);
        g.addEdge(11, 7);
        g.addEdge(7,  11);
        g.addEdge(7, 6);
        g.addEdge(6, 7);
        g.addEdge(1, 4);
        g.addEdge(4, 6);

        int searchThis;

        while (true){
            Scanner input = new Scanner(System.in);
            searchThis = input.nextInt();
            System.out.println("\nDepth First Search    : ");
            g.DFS(searchThis);
            System.out.println("\n\nBreadth First Search  : ");
            g.BFS(searchThis);
            System.out.println();
        }
    }
}