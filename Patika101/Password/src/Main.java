import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName="fatih",tempUserName,password="java123",tempPassword;

        System.out.print("Enter username: ");
        tempUserName=inp.nextLine();

        System.out.print("Enter password: ");
        tempPassword=inp.nextLine();

        if (tempUserName.equals(userName)) {

            if (tempPassword.equals(password)) {
                System.out.println("Logged In Successfully");
            }else{
                System.out.print("Do you want to change your password (y/n)? ");
                String conditon=inp.nextLine();

                if (conditon.equals("y")) {
                    System.out.print("Enter new password: ");
                    String newPassword=inp.nextLine();

                    if (newPassword.equals(password)) {
                        System.out.println("Your new and old password cannot be same.");
                    }else{
                        password=newPassword;
                        System.out.println("Password changed successfully");
                        System.out.println("Your new password is: "+password);
                    }
                }else
                    System.out.println("Password is not changed");
            }
        }else
            System.out.println("Incorrect username");
    }
}