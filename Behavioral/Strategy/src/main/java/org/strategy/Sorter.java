package org.strategy;

public class Sorter
{
    // composition of the interface , and we inject the impl at runtime
    private final SortStrategy strategy;

    public Sorter(SortStrategy strategy)
    {
        if (strategy == null)
            throw new IllegalStateException("Strategy Can't Be null. Add A Valid Strategy");

        this.strategy = strategy;
    }
    public void sorting(int[] nums)
    {
    // using the interface method for runtime override
        strategy.sort(nums);
    }

}
