package edu.ucalgary.oop;

import java.time.LocalDate;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private LocalDate dateOfTreatment;

    // CONSTRUCTOR
    public MedicalRecord(Location location, String treatmentDetails, LocalDate dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }
    // GETTERS AND SETTERS 
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public LocalDate getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setDateOfTreatment(LocalDate dateOfTreatment) {
        if (dateOfTreatment == null || dateOfTreatment.isAfter(LocalDate.now()) ) {
            throw new IllegalArgumentException();
        }
        this.dateOfTreatment = dateOfTreatment;
    }

}
