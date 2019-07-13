public class Mobile {
    private String name;
    private String colot;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColot() {
        return colot;
    }

    public void setColot(String colot) {
        this.colot = colot;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", colot='" + colot + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void call(String message){
        System.out.println("Message : [your input message]"+message);
    }
}
