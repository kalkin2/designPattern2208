package factorymethod.after;


/**
 * java8 for 추상 메서드 구현
 * 공통역할을 추상클래스를 이용하여 구현한다.
 */
public abstract  class DefaultShipFactory implements ShipFactory2{


    @Override
    public void sendEmail(String email, Ship ship) {
        System.out.println("java 11 이전은 interface에서 private 메서드 구현이 불가하므로, 추상메서드로 구현..");
    }

    @Override
    public void validate(String name, String email){
        if(name ==null){
            throw new IllegalArgumentException("배이름을 정해주세요.");
        }
        if(email ==null){
            throw new IllegalArgumentException("연락처를 정해주세요.");
        }
    }

    @Override
    public void prepareFor(String name){
        System.out.println(name+" 만들 준비중...");
    }
}
