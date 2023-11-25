public class Parrot extends Bird implements Prey{
    public Parrot(int age, String name, String talent, int height) {
        super(age, name, talent, height);
    }

    @Override
    public void show() {
        System.out.println("name:"+getName()+","+"age:"+getAge()+","+"Height:"+getHeight()+","+getTalent());
    }

    @Override
    public String getName(Prey prey) {
        return getClass().getName();
    }
}
