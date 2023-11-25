public abstract class Mammal extends Animal{
    private double speed;

    public Mammal(int age, String name, String talent, int speed) {
        super(age, name, talent);
        this.speed = speed;
    }

    public Mammal(int age, String name, String talent, double speed) {
        super(age, name, talent);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
