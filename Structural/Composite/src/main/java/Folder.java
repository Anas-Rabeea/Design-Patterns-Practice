import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// COMPOSITE CLASS which composite the common interface
public class Folder implements FileSystemComponent
{
    List<FileSystemComponent> children = new ArrayList<>();

    // non-component operation
    public void add(FileSystemComponent component)
    {
        children.add(component);
    }


    @Override
    public void delete()
    {
        children = Collections.emptyList();
        System.out.println("Deleting Current Folder and its children");
    }

    @Override
    public double getSize()
    {
        double sum = 0;
        for ( FileSystemComponent component : children ) sum += component.getSize();
        return sum;
    }
}
