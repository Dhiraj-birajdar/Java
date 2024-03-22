package medical_records_management;

//Patient class representing patient information
public class Patient {
private int id;
private String name;
private String gender;
private String phone;

// Constructor
public Patient(int id, String name, String gender, String phone) throws InvalidPatientDataException {
   if (id <= 0) {
       throw new InvalidPatientDataException("Invalid patient ID: " + id);
   }
   if (name == null || name.isEmpty()) {
       throw new InvalidPatientDataException("Patient name cannot be null or empty.");
   }
   if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
       throw new InvalidPatientDataException("Invalid gender: " + gender);
   }
   if (!phone.matches("\\d{10}")) {
       throw new InvalidPatientDataException("Invalid phone number: " + phone);
   }

   this.id = id;
   this.name = name;
   this.gender = gender;
   this.phone = phone;
}

// Getters
public int getId() {
   return id;
}

public String getName() {
   return name;
}

public String getGender() {
   return gender;
}

public String getPhone() {
   return phone;
}
}