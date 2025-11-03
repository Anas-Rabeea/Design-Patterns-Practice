package org.strategy;

public class Sorter {

    private final SortStrategy strategy ;

    public Sorter(SortStrategy strategy) {
        if(strategy == null)
            throw new IllegalStateException("Strategy can't be null");

        this.strategy = strategy;
    }

    public void sorting(int[] nums)
    {
        strategy.sort(nums);
    }

}
