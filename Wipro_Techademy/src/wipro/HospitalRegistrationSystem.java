package wipro;

import java.util.*;
import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

class Patient {
	
	private int patientId;
	private String patientName;
	
	public Patient(int patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	//equals(): checks duplicates based on patientId
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		Patient patient = (Patient) obj;
		return patientId == patient.patientId;
	}
	
	// hashcode(): based on patientId
	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}
	
	@Override
	public String toString() {
		return "Patient ID: " + patientId + ", Name: " + patientName;
	}
}


public class HospitalRegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Patient> patients = new HashSet<>();
		
		Patient p1 = new Patient(101, "Alex");
		Patient p2 = new Patient(102, "John");
		Patient p3 = new Patient(101, "Alex Duplicate"); // Same ID
		
		//Adding Patients
		addPatient(patients, p1);
		addPatient(patients, p2);
		addPatient(patients, p3);
		
		// unique registered patients
		System.out.println("\nUnique Registered Patients:");
		for (Patient p : patients) {
			System.out.println(p);
		}
	}
	
	static void addPatient(Set<Patient> patients, Patient patient) {
		if (patients.contains(patient)) {
			System.out.println("Patient with ID " + patient.getPatientId() + " is already registered");
		} else {
			patients.add(patient);
			System.out.println("Patient added to the system");
		}
	}
}
