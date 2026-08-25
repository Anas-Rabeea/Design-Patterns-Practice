package org.ee;

// the real object and the proxy both implement the same interface
public class ActualDocumentRead implements DocumentUtils{
    private final String fileName;

    public ActualDocumentRead(String fileName) {
        this.fileName = fileName;
        // put in the constructor to only called ONCE (LAZY Loading )
        System.out.println(" {LAZY} Loading document from disk: " + fileName);
    }

    @Override
    public void readDocument() {
        System.out.println("Finally Reading Document After ONE Loading via constructor");

    }
}
