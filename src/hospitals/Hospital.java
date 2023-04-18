package hospitals;

import java.util.Scanner;

public class Hospital {
    Patient patient = new Patient();
    public void addPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Patient's Name");
        String name = scanner.next();
        System.out.println("Enter Patient's Age");
        String age = scanner.next();
        System.out.println("Enter Patient's Phone Number");
        String phoneNumber = scanner.next();
        System.out.println("Enter Patient's City");
        String city = scanner.next();
        System.out.println("Enter Patient's State");
        String state = scanner.next();
        System.out.println("Enter Patient's Department");
        String department = scanner.next();
        patient.setName(name);
        patient.setAge(age);
        patient.setPhoneNumber(phoneNumber);
        patient.setCity(city);
        patient.setDepartment(department);
        System.out.println(patient);
    }
}
