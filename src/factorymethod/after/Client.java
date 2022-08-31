package factorymethod.after;

import factorymethod.after.Ship;
import factorymethod.after.ShipFactory;

public class Client {

    public static void main(String[] args) {

        //java 9부터
//        Ship whiteShip = new WhiteShipFactory().orderShip("white", "kalkin@naver.com");
//        System.out.println(whiteShip);
//
//        Ship blackShip = new BlackShipFactory().orderShip("black", "nice@naver.com");
//        System.out.println(blackShip);



        Client client = new Client();
//        client.create(new WhiteShipFactory(), "white", "kalkin2@naver.com");
//        client.create(new BlackShipFactory(), "black", "kalkin2@naver.com");


        //java8
        client.create2(new WhiteShipFactory2(),"white", "kalala");
    }


//    private void create(ShipFactory factory, String name, String email){
//        System.out.println(factory.orderShip(name,email));
//    }

    private void create2(DefaultShipFactory factory, String name, String email){
        System.out.println(factory.orderShip(name,email));
    }
}
