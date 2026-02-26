package edu.ucalgary.oop;

public class FamilyRelation {
    /**
     * @param args Ignored command-line argument
     */
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    // CONSTRUCTOR
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, 
        DisasterVictim personTwo) {
            if (personOne == null || personTwo == null || relationshipTo == null) {
                throw new IllegalArgumentException();
            }
            this.personOne = personOne;
            this.relationshipTo = relationshipTo;
            this.personTwo = personTwo;
    }

    // GETTERS AND SETTERS
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    public void setPersonOne(DisasterVictim personOne) {
        if (personOne == null) {
            throw new IllegalArgumentException();
        }
        this.personOne = personOne;
    }

    public String getRelationshipTo() {
        return relationshipTo;
    }

    public void setRelationshipTo(String relationshipTo) {
        if (relationshipTo == null) {
            throw new IllegalArgumentException();
        }
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    public void setPersonTwo(DisasterVictim personTwo) {
        if (personTwo == null) {
            throw new IllegalArgumentException();
        }
        this.personTwo = personTwo;
    }

}
