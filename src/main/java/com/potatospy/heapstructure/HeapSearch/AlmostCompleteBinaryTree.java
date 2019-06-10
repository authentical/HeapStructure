package com.potatospy.heapstructure.HeapSearch;

import java.util.ArrayList;
import java.util.List;

public class AlmostCompleteBinaryTree {


    private int insertHere;
    private List<Integer> heap;
    private boolean isMax;


    public AlmostCompleteBinaryTree(List<String> heap) {
        this.heap = new ArrayList<Integer>();
        this.insertHere = 1;    // New heaps start at 1
        isMax=true; // COnfigured for MAX heap by default
    }


    // Insert
    public void insertElement(int value) {


        // Add element... could be root...
        heap.set(insertHere, value); // In Heaps, skip 0 index
        //heap(7)

        // Move insertMark
        insertHere++;
        // heap(7|0,null|)
    }


    // Delete
    public void sortHeap(){

        int element = --insertHere;

    }





    public int getInsertHere() {
        return insertHere;
    }

    public void setInsertHere(int insertHere) {
        this.insertHere = insertHere;
    }

    public List<Integer> getHeap() {
        return heap;
    }

    public void setHeap(List<Integer> heap) {
        this.heap = heap;
    }

    public boolean isMax() {
        return isMax;
    }

    public void setMax(boolean max) {
        isMax = max;
    }
}






