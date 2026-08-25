package org.ee.video;

public class RealVideoProcessor implements VideoProcessing
{
    public RealVideoProcessor()
    {
        System.out.println("Loading a Huge Video From DB...");
    }

    @Override
    public void process(Video video)
    {
        System.out.println("RealVideoProcessor is Processing now...");
    }
}
