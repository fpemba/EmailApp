package org.wecancodeit;

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
}
