public class XmlDocumentProcessor extends DocumentProcessor
{

    @Override
    protected Parser createParser()
    {
        return new XmlParser();
    }
}
