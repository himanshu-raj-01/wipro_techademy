package wipro;

import java.util.HashMap;
import java.util.Map;

public class HospitalSystemMap {

    static class Patient {
        private int patientId;
        private String name;
        private int age;

        public Patient(int patientId, String name, int age) {
            this.patientId = patientId;
            this.name = name;
            this.age = age;
        }

        public int getPatientId() {
            return patientId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "PatientID=" + patientId + ", Name=" + name + ", Age=" + age;
        }
    }

    public static void main(String[] args) {

        Map<Integer, Patient> patientMap = new HashMap<>();

        // Add patients
        patientMap.put(101, new Patient(101, "Rahul", 30));
        patientMap.put(102, new Patient(102, "Anita", 25));
        patientMap.put(103, new Patient(103, "Vikas", 40));
        System.out.println(patientMap);
        System.out.println("Patient added");

        // Update patient
        if (patientMap.containsKey(102)) {
            patientMap.get(102).setAge(24);
            System.out.println("Patient 102 updated\n");
        }

        // Retrieve patient details
        System.out.println("Retrieve Patient 101:");
        System.out.println(patientMap.get(101) + "\n");

        // Remove patient
        patientMap.remove(103);
        System.out.println("Patient 103 removed\n");

        // List all patients
        System.out.println("List of all patients:");
        for (Patient p : patientMap.values()) {
            System.out.println(p);
        }

        // Check existence
        System.out.println("Does Patient 104 exist " + patientMap.containsKey(104));

        // Count total patients
        System.out.println("Total number of patients: " + patientMap.size());
        
        // Clear the system
        patientMap.clear();
        System.out.println("Total patients after clearing: " + patientMap.size());
    }
}