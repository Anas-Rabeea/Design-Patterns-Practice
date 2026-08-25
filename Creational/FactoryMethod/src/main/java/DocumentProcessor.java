public abstract class DocumentProcessor
{
    protected abstract Parser createParser();

    // to own the workflow
    public final String makeResult(Document document)
    {
        Parser parser = createParser();
        String result = parser.parseDocument(document);
        return  result;
    }
}
