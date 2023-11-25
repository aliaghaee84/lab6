public abstract class Bird extends Animal{
    private int height;

    public Bird(int age, String name, String talent, int height) {
        super(age, name, talent);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
