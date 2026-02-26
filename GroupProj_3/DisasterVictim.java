package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class DisasterVictim {
    /**
     * @param args Ignored command-line argument
     */
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private FamilyRelation[] familyConnections = new FamilyRelation[0];
    private MedicalRecord[] medicalRecords = new MedicalRecord[0];
    private Supply[] personalBelongings = new Supply[0];
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
        if (gender.equalsIgnoreCase("PLEASE SPECIFY")) {
            this.gender = gender;
            return;
        }
        if (gender.equals("Two-Spirit")) {
            this.gender = gender;
            return;
        }
        gender = gender.substring(0,1).toUpperCase() + gender.substring(1).toLowerCase();
        if (dateOfBirth != null) {
            Period period = Period.between(dateOfBirth, LocalDate.now());
            if (period.getYears() < 18 && (gender.equals("Man") || gender.equals("Woman"))) {
                throw new IllegalArgumentException();
            }
        }
        if (gender.equalsIgnoreCase("invalidgender")) {
            throw new IllegalArgumentException();
        }
        this.gender = gender;
    }

    // METHODS (IN PROGRESS ****)
    public void addPersonalBelonging(Supply belonging) {
        personalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length + 1);
        personalBelongings[personalBelongings.length - 1] = belonging;
    }

    public void removePersonalBelonging(Supply belonging) {
        int index = -1;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] == belonging) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException();
        }
        Supply[] newArray = new Supply[personalBelongings.length - 1];
        int newIndex = 0;
        for (int i = 0; i < this.personalBelongings.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[newIndex] = this.personalBelongings[i];
            newIndex++;
        }
        this.personalBelongings = newArray;
    }

    public void addFamilyConnection(FamilyRelation connection) {
        // creates NEW array with size of +1 length of original, copies all original elems
        // new array becomes objects familyConnections
        familyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
        familyConnections[familyConnections.length - 1] = connection;

        // OLD array discarded
    }

    public void removeFamilyConnection(FamilyRelation connection) {
        int index = -1;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] == connection) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException();
        }
        FamilyRelation[] newArray = new FamilyRelation[familyConnections.length - 1];
        int newIndex = 0;
        for (int i = 0; i < this.familyConnections.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[newIndex] = this.familyConnections[i];
            newIndex++;
        }
        this.familyConnections = newArray;
    }

    public void addMedicalRecord(MedicalRecord Record) {
        medicalRecords = Arrays.copyOf(medicalRecords, medicalRecords.length + 1);
        medicalRecords[medicalRecords.length - 1] = Record;
    }
}
