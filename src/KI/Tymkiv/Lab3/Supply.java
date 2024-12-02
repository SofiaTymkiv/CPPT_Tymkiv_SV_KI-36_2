package KI.Tymkiv.Lab3;

public class Supply {
    private int quantity;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supply(int quantity, String name) {
        this.quantity = quantity;
        this.name = name;
    }
}