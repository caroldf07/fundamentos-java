package ClassAndMethod;

public class Dinner {
    public static void main(String[] args) {
        Food f1 = new Food("rice",0.333);
        Food f2 = new Food("beans",0.222);

        Person p = new Person("Carol",57.000);

        System.out.println(p.Presentation());
        p.Eat(f1);
        p.Eat(f2);
        System.out.println(p.Presentation());

    }
}
