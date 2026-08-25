public abstract class DocumentProcessor
{
    private final StorageSystem storageSystem;

    public DocumentProcessor(StorageSystem storageSystem)
    {
        this.storageSystem = storageSystem;
    }

    public final void process(Document document)
    {
        storageSystem.store(document);
    }



}
