package hospitals;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    String hospitalName;

    ArrayList<Patient> patientlist = new ArrayList<>();

    public void addPatient() {
        Patient patient = new Patient();
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
        patient.setState(state);
        patient.setDepartment(department);
        patientlist.add(patient);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", patientlist=" + patientlist +
                '}';
    }
}
