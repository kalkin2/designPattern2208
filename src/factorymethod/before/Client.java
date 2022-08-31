package factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = ShipFactory.orderShip("white","kalkin2@naver.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("black","kalkin2@naver.com");
        System.out.println(blackShip);
    }
}
