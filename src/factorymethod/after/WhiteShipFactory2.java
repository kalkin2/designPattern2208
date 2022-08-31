package factorymethod.after;

public class WhiteShipFactory2 extends  DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }


}
