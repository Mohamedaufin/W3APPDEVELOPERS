package Aufin;

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equals("EMAIL")) return new EmailNotification();
        if (type.equals("SMS")) return new SMSNotification();
        return null;
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification n = NotificationFactory.createNotification("EMAIL");
        n.notifyUser();
    }
}
