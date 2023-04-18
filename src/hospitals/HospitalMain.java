package hospitals;

import java.util.ArrayList;

public class HospitalMain {
    public static void main(String[] args) {
        ArrayList<Hospital> apollo = new ArrayList<>();
        for (int i=0; i<=2; i++) {
            Hospital patient1 = new Hospital();
            patient1.addPatient();
            apollo.add(patient1);
            Hospital patient2 = new Hospital();
            patient2.addPatient();
            apollo.add(patient2);
            Hospital patient3 = new Hospital();
            patient3.addPatient();
            apollo.add(patient3);
        }
        ArrayList<Hospital> reliance = new ArrayList<>();
        for (int i=0; i<=2; i++){
            Hospital patient1 = new Hospital();
            patient1.addPatient();
            reliance.add(patient1);
            Hospital patient2 = new Hospital();
            patient2.addPatient();
            reliance.add(patient2);
            Hospital patient3 = new Hospital();
            patient3.addPatient();
            reliance.add(patient3);
        }
    }
}
