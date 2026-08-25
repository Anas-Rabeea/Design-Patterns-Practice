package org.ee;

public class ReadingDocumentProxy implements DocumentUtils{
    // this class will be between client and reading the document
    // it is like the bodyguard before reaching the actual person

    private final String fileName;
    // notice that it is not final as we want LAZY Initialization
    private ActualDocumentRead actualDocumentRead;

    public ReadingDocumentProxy(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void readDocument() {
        System.out.println("Checking access rights"); // Control 1
        synchronized (this)
        {
            if (actualDocumentRead == null)
            { // LAZY LOADING
                actualDocumentRead = new ActualDocumentRead(fileName);
            }
        }
        actualDocumentRead.readDocument();
    }
}
