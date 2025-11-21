class NotificationService {
    public void sendNotification(String type) {
        if (type.equals("email")) {
            System.out.println("Sending Email");
        } else if (type.equals("sms")) {
            System.out.println("Sending SMS");
        } else if (type.equals("push")) {
            System.out.println("Sending Push Notification");
        } else {
            System.out.println("Unknown notification type");
        }
    }
}

class Employee {
    private String name;
    private String address;
    private int age;
    private double salary;
    private String phone;
    private String department;
    private String role;

    public Employee(String name, String address, int age, double salary, String phone, String department, String role) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.department = department;
        this.role = role;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department + ", Role: " + role);
    }
}

class EmployeeManager {
    public void saveEmployee(Employee emp) {
        System.out.println("Saving employee: " + emp);
    }
}

class UserValidator {
    public boolean validateName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean checkEmail(String email) {
        if (email == null || !email.contains("@")) {
            return false;
        }
        return true;
    }
}

class Logger {
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
