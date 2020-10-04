package org.wecancodeit;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int mailboxCapacity = 600;
    private String department;
    private String email;
    private String compaySuffix = "company.com";
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();


        this.password = randomPassword(8);
        System.out.println("Your password is: " + password);


        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + compaySuffix;

    }

    public String setDepartment() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your department code: \n1:Accounting\n2:Sales\n3:Admin\n4:Dev");
        int deptChoice = scn.nextInt();

        if (deptChoice == 1) {
            return "Accounting";
        } else if (deptChoice == 2) {
            return "Sales";
        } else if (deptChoice == 3) {
            return "Admin";
        } else if (deptChoice == 4) {
            return "Dev";
        } else {
            return "";
        }
    }
}
