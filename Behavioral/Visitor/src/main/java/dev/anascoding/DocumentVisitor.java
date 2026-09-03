package dev.anascoding;

public interface DocumentVisitor
{
    void visit(TextElement text);
    void visit(ImageElement image);

}
