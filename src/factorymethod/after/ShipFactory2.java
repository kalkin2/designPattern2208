package factorymethod.after;


/**JAVA 8까지는 아래처럼 사용 private method Before**/
public interface ShipFactory2 {

    //주문
    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);

        //각자에 맞게 구현.
        Ship ship = createShip();
        sendEmail(email, ship);
        return ship;
    }

    // 추상메서드로 구현!
    void sendEmail(String email, Ship ship);

    //추상화
    Ship createShip();

    void validate(String name, String email);
    void prepareFor(String name);

}
