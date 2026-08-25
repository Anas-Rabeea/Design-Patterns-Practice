public class S3StorageSystem implements StorageSystem
{
    @Override
    public void store(Document document)
    {
        System.out.println("S3 Storage ");
    }
}
