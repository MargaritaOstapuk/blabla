/**
 * Created by Маргарита on 13.01.2016.
 */
public class flowers {
    protected int amount; //количество
    protected String color;
    protected String name;

    flowers(){}

    flowers(int amount, String color, String name){
        setAmount(amount);
        setColor(color);
        setName(name);
    }

    int getAmount(){
        return amount;
    }

    void setAmount(int amount){
        this.amount=amount;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    void show_flower(){
        System.out.println("amount: "+getAmount());
        System.out.println("color: "+getColor());
        System.out.println("name: "+getName());
    }
}
