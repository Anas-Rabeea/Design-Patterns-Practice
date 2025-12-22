package org.ee;

public class ReadingDocumentProxy implements DocumentUtils{
    // this class will be between client and reading the document
    // it is like the bodyguard before reaching the actual person

    private final String fileName;
    private  ActualDocumentRead actualDocumentRead;

    public ReadingDocumentProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void readDocument() {
        System.out.println("Checking access rights"); // Control 1
        if(actualDocumentRead == null)
        { // LAZY LOADING
            actualDocumentRead = new ActualDocumentRead(fileName);
        }
        actualDocumentRead.readDocument();
    }
}
