package factorymethod.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email){
//        validate(name, email);
//        prepareFor(name);

        //각자에 맞게 구현.
        Ship ship = createShip();
//        sendEmail(email, ship);
        return ship;
    }

    //추상화
    Ship createShip();


    /**java8이후 가능함.**/
//    private void sendEmail(String email, Ship ship){
//        System.out.println("메일 발송");
//    }
//
//
//    private void validate(String name, String email){
//        if(name ==null){
//            throw new IllegalArgumentException("배이름을 정해주세요.");
//        }
//        if(email ==null){
//            throw new IllegalArgumentException("연락처를 정해주세요.");
//        }
//    }
//
//    private void prepareFor(String name){
//        System.out.println(name+" 만들 준비중...");
//    }
}
