package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger();
        CheeseBurger cheeseBurger = new CheeseBurger();
        ShrimpBurger shrimpBurger = new ShrimpBurger();

        hamburger.cook();
        System.out.println("==================================");
        shrimpBurger.cook();
        System.out.println("==================================");
        cheeseBurger.cook();
    }

    public static class Hamburger {
        public String name;

        public Hamburger(String name) {
            this.name = name;
        }

        public Hamburger(){
            this("햄버거");
        }

        public void cook(){
            System.out.println(this.name + "의 재료는");
            System.out.println("빵");
            System.out.println("양상추");
            System.out.println("패티");
            System.out.println("피클");
        }
    }

    public static class CheeseBurger extends Hamburger{
        public CheeseBurger() {
            super("치즈버거");
        }

        @Override
        public void cook() {
           super.cook();
            System.out.println("+ 치즈");
        }
    }

    public static class ShrimpBurger extends Hamburger{
        public ShrimpBurger() {
            super("새우버거");
        }

        @Override
        public void cook() {
            super.cook();
            System.out.println("+ 새우");
        }
    }
}
