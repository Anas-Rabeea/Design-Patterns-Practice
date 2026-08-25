public class ExcelReportService extends ReportService

{
    @Override
    protected ReportExporter createReportExporter()
    {
        return new ExcelReportExporter();
    }
}
