package org.ee.video;

// virtual proxy
public class VideoProcessorProxy implements VideoProcessing
{
    private RealVideoProcessor videoProcessor;

    @Override
    public void process(Video video)
    {
        System.out.println("Doing Some Checks (proxy things maybe)");
        synchronized (this)
        {
            if (this.videoProcessor == null)
            {
                this.videoProcessor = new RealVideoProcessor();
            }
        }
        videoProcessor.process(video);
    }
}
