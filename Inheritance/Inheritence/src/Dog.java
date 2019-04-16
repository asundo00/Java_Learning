public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) { //znamo da svi psi imaju tijelo i mozak pa makknemo, a doda
        super(name, 1, 1, size, weight);
        this.teeth = teeth;
        this.legs = legs;
        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override  //preuzimanje metode iz Animal classe
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(4);

    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
