package sevice.menu;

import academy.Email;
import servise.menu.inter.MenuCreateEmailServiceInter;

import java.util.Scanner;

public class MenuCreateEmailService implements MenuCreateEmailServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter surname:");
        String surname = sc.nextLine();

        Email employeeEmail = new Email(name, surname);
        System.out.println(employeeEmail.showInfo());
    }
}

