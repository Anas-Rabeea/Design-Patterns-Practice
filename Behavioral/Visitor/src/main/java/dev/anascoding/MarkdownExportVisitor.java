package dev.anascoding;

// Concrete Visitor
public class MarkdownExportVisitor implements DocumentVisitor
{
    @Override
    public void visit(TextElement text)
    {
        System.out.println("Exporting Text to Md : " + text.getText());
    }

    @Override
    public void visit(ImageElement image)
    {
        System.out.println("Exporting image to Md : " + image.getPath());
    }
}
