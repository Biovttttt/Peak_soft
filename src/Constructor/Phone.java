package Constructor;

public class Phone {
private int price;
private int value;

Phone(int price){
    this.price=price;
}
Phone(int price, int value){
        this.price=price;
        this.value=value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
