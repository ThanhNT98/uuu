package objectclass;

import java.util.Scanner;

public class DoctorHashText {
    public static void main(String[] args) {
        DoctorHash doctorHashObj = new DoctorHash();
        int choice;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("\n!!! Welcome to LifeLine Hospital!!!!\n" + "\nSelect the operation you want to perform:");
            System.out.println("******************************");
            System.out.println("1. Register Doctor");
            System.out.println("2. Display the Doctor details");
            System.out.println("3. Publish the entire list");
            System.out.println("4. Exit");
            System.out.println("******************************");
            choice = sc.nextInt();
            switch(choice) {
                case 1: doctorHashObj.add();break;
                case 2: doctorHashObj.display(); break;
                case 3: doctorHashObj.publish(); break;
                case 4: break;
                default: System.out.println("Not a valid choice!!!");
            }
        } while(choice != 4);
    }
}
