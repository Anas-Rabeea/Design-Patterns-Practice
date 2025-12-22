package org.ee;

public class Main {
    public static void main(String[] args) {

        // client doesn't know the control we do in the background
    DocumentUtils documentUtils =
            new ReadingDocumentProxy("SecretFile.txt");

    documentUtils.readDocument();

    }
}