package edu.ucalgary.oop;
import java.util.Arrays;
public class Location {

    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;


    public Location(String locationName, String address) {
        this.name = locationName;
        this.address = address;
        this.occupants = new DisasterVictim[0];
        this.supplies = new Supply[0];  
    }
    


    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public DisasterVictim[] getOccupants() {
        return Arrays.copyOf(this.occupants, this.occupants.length);
    }
    public Supply[] getSupplies() {
        return Arrays.copyOf(this.supplies, this.supplies.length);
    }




    public void setName(String locationName) {
        this.name = locationName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setOccupants(DisasterVictim[] occupants) {
        if (occupants == null) {
            this.occupants = new DisasterVictim[0];
        }
        else {
            this.occupants = Arrays.copyOf(occupants, occupants.length);
        }
    }
    public void setSupplies(Supply[] inventory) {
        if (inventory == null) {
            this.supplies = new Supply[0];
        }
        else {
            this.supplies = Arrays.copyOf(inventory, inventory.length);

        }
    }
    


    
    public void addOccupant(DisasterVictim occupant) {
        DisasterVictim[] updated = Arrays.copyOf(this.occupants, this.occupants.length + 1);
        updated[updated.length - 1] = occupant;
        this.occupants = updated;
    }

    public void removeOccupant(DisasterVictim occupant) {
        int indexFound = -1;
        for (int i = 0; i < this.occupants.length; i++) {
            if (this.occupants[i].equals(occupant)) {
                indexFound = i;
                break;
            }
        }
        if (indexFound == -1) {
            throw new IllegalArgumentException();
        }
        int newSize = this.occupants.length - 1;
        DisasterVictim[] newArray = new DisasterVictim[newSize];
        int newIndex = 0;
        for (int i = 0; i < this.occupants.length; i++) {
            if (i == indexFound) {
                continue;
            }
            newArray[newIndex] = this.occupants[i];
            newIndex++;
        }
        this.occupants = newArray;
    }
    



    public void addSupply(Supply inventory) {
        Supply [] updated = Arrays.copyOf(this.supplies, this.supplies.length + 1);
        updated[updated.length - 1] = inventory;
        this.supplies = updated;
    }
    
    public void removeSupply(Supply inventory) {
        int indexFound = -1;
        for (int i = 0; i < this.supplies.length; i++) {
            if (this.supplies[i].equals(inventory)) {
                indexFound = i;
                break;
            }
        }
        if (indexFound == -1) {
            throw new IllegalArgumentException();
        }
        int newSize = this.supplies.length - 1;
        Supply[] newArray = new Supply[newSize];
        int newIndex = 0;
        for (int i = 0; i < this.supplies.length; i++) {
            if (i == indexFound) {
                continue;
            }
            newArray[newIndex] = this.supplies[i];
            newIndex++;
        }
        this.supplies = newArray;
    
    }




}