package com.lysenko.pattenrsOOP.behavioral.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("notifi this message", Priority.ROUTINE);
        reportNotifier.notifyManager("notifi this message with email", Priority.IMPORTANT);
        reportNotifier.notifyManager("notifi this message with sms", Priority.ASAP);
    }
}
