interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON format");
    }
}

class SalesReport implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Exported to PDF");
    }
}

public class ReportApp {
    public static void main(String[] args) {
        ReportExporter report = new SalesReport();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
