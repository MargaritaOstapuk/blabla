import java.util.ArrayList;

/**
 * Created by Маргарита on 11.01.2016.
 */
public class main {

    public static void main(String[] args){

        my_collections flow= new my_collections();


        flowers fl1= new flowers(5,"purpure","tulip");
        flowers fl2= new flowers(3,"white","rose");
        flowers fl3= new flowers(7,"black","tulip");

        flow.add(fl1);
        flow.add(fl2);
        flow.add(1,fl3);

        flowers[] flowerses= new flowers[flow.size()];
        flowerses=flow.toArray(flowerses);
        System.out.println("the contents of the collection: " + flow);
        System.out.println();
        System.out.println(flow.show_content(flowerses));

        //flow.remove(fl2);
        //System.out.println("the contents of the collection: " + flow);

    }
}
