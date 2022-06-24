package home_work_25;

public class Car extends Car_details {
    private int id;
    private int number_auto;

    public Car(int id,int number_auto, int year, String color, String model, String price) {
        super(year, color, model, price);
        this.id=id;
        this.number_auto=number_auto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_auto() {
        return number_auto;
    }

    public void setNumber_auto(int number_auto) {
        this.number_auto = number_auto;
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(String price) {
        super.setPrice(price);
    }
}
