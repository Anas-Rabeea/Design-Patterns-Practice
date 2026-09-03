package dev.anascoding;

public class Main
{
    public static void main(String[] args)
    {
        DocumentVisitor visitor = new PdfExportVisitor();

        DocumentElement imageELement = new ImageElement("/tmp/img.jpg");
        DocumentElement textEleemt   =  new TextElement("Some Teext");

        imageELement.accept(visitor);
        textEleemt.accept(visitor);
        System.out.println("------------");
        DocumentVisitor visitor2 = new MarkdownExportVisitor();
        imageELement.accept(visitor);
        textEleemt.accept(visitor);

    }
}