// FactoryMethodPatternExample.java

// Document interface
interface Document {
    void open();
}

// WordDocument class
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document...");
    }
}

// PdfDocument class
class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

// ExcelDocument class
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document...");
    }
}

// Abstract factory
abstract class DocumentFactory {
    abstract Document createDocument();
}

// Word factory
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

// PDF factory
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

// Excel factory
class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// Main class to test the pattern
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // Create Word document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        // Create PDF document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        // Create Excel document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
