public class Girafe extends Mammal implements Prey{
    public Girafe(int age, String name, String talent, double speed) {
        super(age, name, talent, speed);
    }

    @Override
    public void show() {
        System.out.println("name:"+getName()+","+"age:"+getAge()+","+"speed:"+getSpeed()+","+getTalent());
    }
    @Override
    public String getName(Prey prey) {
        return getClass().getName();
    }

}
