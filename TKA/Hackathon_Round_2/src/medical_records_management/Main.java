package medical_records_management;

public class Main {
 public static void main(String[] args) {
     // Test Medical Records Management

     try {
         // Create valid patient
         Patient patient1 = new Patient(1, "John Doe", "Male", "1234567890");
         System.out.println("Patient 1 created successfully.");
     } catch (InvalidPatientDataException e) {
         System.out.println("Error creating patient 1: " + e.getMessage());
     }

     try {
         // Create patient with invalid data
         Patient patient2 = new Patient(-2, "", "Other", "12345");
         System.out.println("Patient 2 created successfully.");
     } catch (InvalidPatientDataException e) {
         System.out.println("Error creating patient 2: " + e.getMessage());
     }
 }
}

//Problem 5: Medical Records Management
//• Create a medical records management application to demonstrate handling 
//exceptions (custom exceptions) for cases like invalid patient data.
//• Use below information.
//o Patient Info (id, name, gender, phone)
//▪
//ID: can't be null or negative
//▪
//NAME: Can’t be null or empty
//▪ Gender: Should be only Male or Female
//▪
//Phone: Should be 10-digit