public class LocalDiskStorageSystem implements StorageSystem
{
    @Override
    public void store(Document document)
    {
        System.out.println("Lcoal Disk Storage ");
    }
}
