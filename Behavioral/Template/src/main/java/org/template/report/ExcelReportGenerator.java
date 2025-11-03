package org.template.report;

public class ExcelReportGenerator extends ReportGenerator{

    @Override
    protected void loadData() {
        System.out.println("Loading data for Excel report...");
    }

    @Override
    protected void generateContent() {
        System.out.println("Generating Excel content...");
    }

    @Override
    protected void export() {
        System.out.println("Exporting Excel file...");
    }


}
