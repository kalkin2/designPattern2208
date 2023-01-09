package factorymethod.after;

public class Ship {
    private String name;
    private String color;
    private String logo;

    //test code commit!!!!!!
//    public Ship(String name, String color, String logo) {
//        this.name = name;
//        this.color = color;
//        this.logo = logo;
//    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
}
