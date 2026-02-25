package src.edu.ucalgary.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class DisasterVictim {
    /**
     * @param args Ignored command-line argument
     */
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private LocalDate ENTRY_DATE;
    private String gender;
    private String comments;

    // CONSTRUCTORS
    public DisasterVictim(String firstName, LocalDate entryDate) {
        this.firstName = firstName;
        this.ENTRY_DATE = entryDate;
    }
    
    public DisasterVictim(String firstName, LocalDate entryDate, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.ENTRY_DATE = entryDate;
        this.dateOfBirth = dateOfBirth;
    }

    // GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now()) ) {
            throw new IllegalArgumentException();
        }
        this.dateOfBirth = dateOfBirth;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = connections;
    }

    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = records;
    }

    public void setPersonalBelongings(Supply[] supplies) {
        this.personalBelongings = supplies;
    }

    public LocalDate getEntryDate() {
        return ENTRY_DATE;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // METHODS (IN PROGRESS ****)
    public void addPersonalBelonging(Supply belonging) {
        personalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length + 1);
        personalBelongings[personalBelongings.length - 1] = belonging;
    }

    public void removePersonalBelonging(Supply belonging) {
        int index = -1;
        for (int i = 0; i < personalBelongings.length - 1; i++) {
            if (personalBelongings[i] == belonging)
                index = i;
            
        }
    }

    public void addFamilyConnection(FamilyRelation connection) {
        // creates NEW array with size of +1 length of original, copies all original elems
        // new array becomes objects familyConnections
        familyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
        familyConnections[familyConnection.length - 1] = connection;

        // OLD array discarded
    }

    public void removeFamilyConnection(FamilyRelation connection) {
        // IN PROGRESS ****
    }

    public void addMedicalRecord(MedicalRecord Record) {
        medicalRecords = Arrays.copyOf(medicalRecords, medicalRecords.length + 1);
        medicalRecords[medicalRecords.length - 1] = medicalRecords;
    }
}
