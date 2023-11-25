public class Eagle extends Bird implements Hunter{
    public Eagle(int age, String name, String talent, int height) {
        super(age, name, talent, height);
    }

    @Override
    public void show() {
        System.out.println("name:"+getName()+","+"age:"+getAge()+","+"Height:"+getHeight()+","+getTalent());
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName()+ " hunted" + prey);
    }
}
