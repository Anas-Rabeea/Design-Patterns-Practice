

public class Main
{
    public static void main(String[] args)
    {
        ReportService reportService = new PdfReportService();
        // here we dont need to know the we use pdfReportExporter
        reportService.generate(new Report("name1" , "5asd5sa65d" , 20.33));

        DocumentProcessor processor = new JsonDocumentProcessor();
        String processingResult = processor.makeResult(new Document("asdas", "564a6ds5"));
        System.out.println(processingResult);
    }
}
