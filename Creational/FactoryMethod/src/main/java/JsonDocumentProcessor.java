public class JsonDocumentProcessor extends DocumentProcessor
{

    @Override
    protected Parser createParser()
    {
        return new JsonParser();
    }
}
