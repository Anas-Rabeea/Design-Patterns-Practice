package dev.anascoding;

public interface DocumentElement
{
    void accept(DocumentVisitor visitor);
}
