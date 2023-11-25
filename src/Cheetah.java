public class Cheetah extends Mammal implements Hunter{
    public Cheetah(int age, String name, String talent, double speed) {
        super(age, name, talent, speed);
    }

    @Override
    public void show() {
        System.out.println("name:"+getName()+","+"age:"+getAge()+","+"speed:"+getSpeed()+","+getTalent());
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName()+ " hunted" + prey);
    }
}
