package org.template.report;

public class CSVReportGenerator extends ReportGenerator{

    @Override
    protected void loadData() {
        System.out.println("Loading data for CSV report...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Generating CSV content...");
    }

    @Override
    protected void export() {
        System.out.println("Exporting SCV file...");
    }
}
