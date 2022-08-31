package factorymethod.before;


public class Ship {
    private String name;
    private String color;
    private String logo;
    private  String message;
    public Ship(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
