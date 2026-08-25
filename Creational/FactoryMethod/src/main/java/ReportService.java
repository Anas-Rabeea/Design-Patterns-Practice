public abstract class ReportService
{
    // Factory Method
    // protected
    //   Because clients aren't supposed to manually use the creation mechanism.
    //    the impls (subclasses) are the ones responsible for creation
    //    It's an implementation extension point for subclasses.


    protected abstract ReportExporter createReportExporter();

    // Operation Method (Business)
    public void generate(Report report)
    {
        ReportExporter exporter = createReportExporter();
        exporter.export(report);
    }


}
