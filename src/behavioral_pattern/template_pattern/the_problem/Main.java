package behavioral_pattern.template_pattern.the_problem;

public class Main {
    public static void main(String[] args) {
        AuditTrail trail = new AuditTrail();

        TransferMoneyTask transferMoneyTask = new TransferMoneyTask(trail);
        transferMoneyTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask(trail);
        generateReportTask.execute();
    }
}
