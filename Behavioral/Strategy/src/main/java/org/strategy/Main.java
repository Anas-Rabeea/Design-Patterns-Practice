package org.strategy;



public class Main {
    public static void main(String[] args) {

        // Strategy differs based on the input or the selected implementation
        int[] nums = {1,9,7,8,10,6,3};

        Sorter sorter = new Sorter(new MergeSortStrategy());
        sorter.sorting(nums);

        }
    }
