/**
 * Created by Маргарита on 04.01.2016.
 */
public enum Apple {
    GoldenDel("Minsk",12), RedDel("Kobrin",13), Winesap("Moskoy",16);

    String city;
    int price;

    Apple(String city, int p)
    {this.city=city;
     this.price=p;}

    int sum_price(int kolvo, Apple a)
    {
        int sum=0;
        sum=kolvo*a.price;

        return sum;
    }


}
