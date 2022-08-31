package factorymethod.before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {


        Ship ship;
        if(name.equals("white")){
            System.out.println("whipteShip 만들 준비중");
            ship = new Ship("white");
            ship.setColor("화이트");
            ship.setLogo("WH");
            return ship;
        }else if(name.equals("black")){
            System.out.println("whipteShip 만들 준비중");
            ship = new Ship("black");
            ship.setColor("블랙");
            ship.setLogo("BL");
            return ship;
        }
        return null;
    }
}
