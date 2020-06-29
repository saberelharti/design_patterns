package com.company.template;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public void execute() {

        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
