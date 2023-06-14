package com.mycompany.modul6;

import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    private final int PanjangArrayExternal;
    private final LinkedList[] LinkedList;

    Graph(int PanjangArray) {
        PanjangArrayExternal = PanjangArray;
        LinkedList = new LinkedList[PanjangArray];
        for (int i = 0; i < PanjangArray; ++i)
            LinkedList[i] = new LinkedList();
    }

    void addEdge(int Dari, int Ke) {
        LinkedList[Dari].add(Ke);
    }

    void DFSBackEnd(int k, boolean[] Dikunjungi) {
        Dikunjungi[k] = true;
        System.out.print(k + " ");
        Iterator<Integer> i = LinkedList[k].listIterator();
        if (i.hasNext()) {
            do {
                int n = i.next();
                if (!Dikunjungi[n]) DFSBackEnd(n, Dikunjungi);
            } while (i.hasNext());
        }
    }

    void DFS(int Input) {
        boolean[] Dikunjungi = new boolean[PanjangArrayExternal];
        DFSBackEnd(Input, Dikunjungi);
    }

    void BFS(int Input) {
        boolean[] Dikunjungi = new boolean[PanjangArrayExternal];
        LinkedList<Integer> queue = new LinkedList<>();
        Dikunjungi[Input] = true;
        queue.add(Input);
        while (queue.size() != 0) {
            Input = queue.poll();
            System.out.print(Input + " ");
            Iterator<Integer> i = LinkedList[Input].listIterator();
            if (i.hasNext()) {
                do {
                    int n = i.next();
                    if (!Dikunjungi[n]) {
                        Dikunjungi[n] = true;
                        queue.add(n);
                    }
                } while (i.hasNext());
            }
        }
    }
}