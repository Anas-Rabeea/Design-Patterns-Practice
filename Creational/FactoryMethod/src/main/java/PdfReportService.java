public class PdfReportService extends  ReportService

{
    @Override
    protected ReportExporter createReportExporter()
    {
        return new PdfReportExporter();
    }
}
