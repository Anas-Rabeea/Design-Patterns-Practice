
// THE LEAF WHICH HAS NO COMPONENTS INSIDE IT

public class File implements FileSystemComponent
{
    private final double size ;

    public File(double size)
    {
        this.size = size;
    }

    @Override
    public void delete()
    {
        System.out.println("Deleting Current File");
    }

    @Override
    public double getSize()
    {
        System.out.println("Calculating File Suze");
        return size;
    }
}
