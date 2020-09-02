package ClassAndMethod;

public class Person {
    String name;
    double weight;

    Person(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    void Eat(Food food){
        if (food != null){
            this.weight += food.eatFood;
        }
    }

    String Presentation(){
        return "Hi! I'm "+name+" and my pound is "+weight+" kg";
    }
}
