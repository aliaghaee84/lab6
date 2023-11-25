public  abstract class Animal {
    private int age;
    private String name;
    private String talent;

    public Animal(int age, String name, String talent) {
        this.age = age;
        this.name = name;
        this.talent = talent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }
    public abstract void show();
}
