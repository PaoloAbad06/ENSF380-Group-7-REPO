package edu.ucalgary.oop;

public class Supply {

    private String type;
    private int quantity;

    public Supply(String type, int quantity) {
        setType(type);
        setQuantity(quantity);
    }

    public void setType(String type) {
        if (type == null) {
            thrown new IllegalArgumentException("Type can't be null");
        }
        this.type = type;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            thrown new IllegalArgumentException("Quantity can't be negative");
        }
        this.quantity = quantity;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getQuantity() {
        return this.quantity;
    }






}