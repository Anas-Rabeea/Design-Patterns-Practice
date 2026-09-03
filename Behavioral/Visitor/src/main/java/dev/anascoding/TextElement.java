package dev.anascoding;

public class TextElement implements DocumentElement
{
    private final String text;

    public TextElement(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return this.text;
    }

    @Override
    public void accept(DocumentVisitor visitor)
    {
        visitor.visit(this);
    }
}
