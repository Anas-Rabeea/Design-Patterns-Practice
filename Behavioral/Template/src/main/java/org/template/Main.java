package org.template;

import org.template.order.*;
import org.template.report.CSVReportGenerator;
import org.template.report.ExcelReportGenerator;
import org.template.report.PDFReportGenerator;
import org.template.report.ReportGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Implement a system that generates different report types (PDF, CSV, Excel)
        // using the Template Method Pattern.

        // example 1
        Scanner sc = new Scanner(System.in);

//        while (true)
//        {
//            System.out.println("Enter Report Type (PDF , Excel , CSV)");
//            String reprotType = sc.nextLine();
//
//            ReportGenerator generator = switch (reprotType.toLowerCase())
//            {
//                case "csv" -> new CSVReportGenerator();
//                case "pdf" -> new PDFReportGenerator();
//                case "excel" -> new ExcelReportGenerator();
//                default -> throw new IllegalStateException("Enter a Valid Generator Type (PDF , Excel , CSV)");
//            };
//            generator.generateReport();
//        }


        // example 2
        while (true)
        {
            System.out.println("Enter Order Type (InStore , Online , Phone");
            String inputType = sc.nextLine();

            OrderType type = OrderType.fromString(inputType);

            OrderProcessor processor = switch (type)
            {
                case PHONE -> new PhoneOrderProcessor();
                case ONLINE -> new OnlineOrderProcessor();
                case INSTORE -> new InStoreOrderProcessor();
                default -> throw new IllegalArgumentException("Enter A Valid Order Type");
            };
            processor.orderProcessing();

        }

    }
}