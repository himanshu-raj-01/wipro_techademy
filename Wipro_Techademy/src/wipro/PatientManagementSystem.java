package wipro;

import java.util.*;

public class PatientManagementSystem {

    public static void main(String[] args) {

        // LinkedList to maintain patient queue (FIFO)
        LinkedList<String> patientQueue = new LinkedList<>();

        // Patients arriving normally (added at end)
        patientQueue.add("Ramesh");
        patientQueue.add("Suresh");
        patientQueue.add("Anita");
        patientQueue.add("Priya");

        System.out.println("Initial Patient Queue:");
        displayPatients(patientQueue);

        // Emergency patient (added at beginning)
        patientQueue.addFirst("Emergency - Alex");

        System.out.println("\nAfter Emergency Arrival:");
        displayPatients(patientQueue);

        // Remove a patient after treatment (FIFO)
        String removedPatient = patientQueue.removeFirst();
        System.out.println("\nPatient Treated and Removed: " + removedPatient);

        //updated queue
        System.out.println("\nCurrent Patient Queue:");
        displayPatients(patientQueue);

        // Check first and last patient
        System.out.println("\nFirst Patient in Queue: " + patientQueue.getFirst());
        System.out.println("Last Patient in Queue: " + patientQueue.getLast());

        // Search for a patient by name
        String searchPatient = "Raj";
        if (patientQueue.contains(searchPatient)) {
            System.out.println("\nPatient Found: " + searchPatient);
        } else {
            System.out.println("\nPatient Not Found: " + searchPatient);
        }
    }

    // Method to display all patients
    public static void displayPatients(LinkedList<String> queue) {
        for (String patient : queue) {
            System.out.println(patient);
        }
    }
}
