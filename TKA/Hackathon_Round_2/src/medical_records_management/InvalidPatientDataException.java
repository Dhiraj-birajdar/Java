package medical_records_management;

//Custom exception for invalid patient data
public class InvalidPatientDataException extends Exception {
public InvalidPatientDataException(String message) {
   super(message);
}
}
