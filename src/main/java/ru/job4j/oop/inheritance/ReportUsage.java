package ru.job4j.oop.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        String separator = "______________________";
        printReport(new TextReport());
        System.out.println(separator);
        printReport(new HtmlReport());
        System.out.println(separator);
        printReport(new JSONReport());

    }

    public static void printReport(TextReport report) {
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
