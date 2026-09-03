package dev.anascoding;

public class ImageElement implements DocumentElement
{
    private final String path;

    public ImageElement(String path)
    {
        this.path = path;
    }

    public String getPath()
    {
        return this.path;
    }

    @Override
    public void accept(DocumentVisitor visitor)
    {
        visitor.visit(this);
    }
}
