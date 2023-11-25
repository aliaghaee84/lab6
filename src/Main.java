import java.net.CacheRequest;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Animal> mylist = new ArrayList<>();
            Parrot parot1 = new Parrot(10, "parrot1", "can talk",200);
            Cheetah chetah1 = new Cheetah(12, "chetah1", "the fastest", 100);
            Eagle eagle1 = new Eagle(5, "eagle1","beautiful",400);
            Girafe girafe1 = new Girafe(7,"girafe1", "the talest", 30);
            mylist.add(parot1);
            mylist.add(chetah1);
            mylist.add(eagle1);
            mylist.add(girafe1);
        for (Animal c : mylist) {
            c.show();
        }
    }
}