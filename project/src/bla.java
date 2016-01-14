/**
 * Created by Маргарита on 04.01.2016.
 */
public class bla{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apple ap[]=Apple.values();
        Apple ap1=Apple.RedDel;

        //вывод всех констант и их конструкторов
        for(Apple a: ap)
            System.out.println(a+" "+a.city+" "+a.price);
        System.out.println();

        //вывод всех констан и их порядковых номеров
        for(Apple a: ap)
            System.out.println(a+" "+a.ordinal());
        System.out.println();

        for(Apple a: ap)
        {if(ap1.compareTo(a)==0)
            System.out.println(a+" "+a.ordinal());}
        System.out.println();

        System.out.println("stoim "+ap1.sum_price(2,ap1));
        System.out.println();
    }
}
