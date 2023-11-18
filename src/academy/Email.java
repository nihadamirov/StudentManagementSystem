package academy;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 6;
    private String companySuffix = "company.com";
    private int mailboxCapacity = 500;
    private String alternateMail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@gmail" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    private String setDepartment() {
        System.out.print("New worker:" + firstName + " " + lastName + "\nACADEMY CODES: \n1 for Teacher\n2 for Development\n3 for Accounting\n0 none\nEnter academy code:");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            return "tch";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acout";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
    }
}
