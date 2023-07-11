package behavioral_pattern.template_pattern.the_problem;

public class TransferMoneyTask {
    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        System.out.println("Transfer Money");
    }
}
