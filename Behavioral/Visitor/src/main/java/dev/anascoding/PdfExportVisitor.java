package dev.anascoding;

// Concrete Visitor
public class PdfExportVisitor implements DocumentVisitor
{
    @Override
    public void visit(TextElement text)
    {
        System.out.println("Exporting Text to PDF : " + text.getText());
    }

    @Override
    public void visit(ImageElement image)
    {
        System.out.println("Exporting image to PDF : " + image.getPath());
    }
}
