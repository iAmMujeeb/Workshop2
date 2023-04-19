package hospitals;

import java.util.ArrayList;

public class HospitalMain {
    public static void main(String[] args) {
        ArrayList<Hospital> hospitals = new ArrayList<>();

            Hospital apollo1 = new Hospital();
            apollo1.addPatient();
            apollo1.addPatient();
            hospitals.add(apollo1);

            Hospital reliance1 = new Hospital();
            reliance1.addPatient();
            reliance1.addPatient();
            hospitals.add(reliance1);

            Hospital aiims1 = new Hospital();
            aiims1.addPatient();
            hospitals.add(aiims1);
        System.out.println(hospitals);
    }
}
