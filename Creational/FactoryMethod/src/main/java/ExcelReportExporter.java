
// Concrete Product
public class ExcelReportExporter implements ReportExporter
{
    @Override
    public void export(Report report)
    {
        System.out.println("Exporting Excel Report");
    }
}
