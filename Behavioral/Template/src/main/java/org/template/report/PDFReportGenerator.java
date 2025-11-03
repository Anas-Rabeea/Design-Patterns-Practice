package org.template.report;

public class PDFReportGenerator extends ReportGenerator{
    @Override
    protected void loadData() {
        System.out.println("Loading data for PDF report...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Generating PDF content...");
    }

    @Override
    protected void export() {
        System.out.println("Exporting PDF file...");
    }
}
