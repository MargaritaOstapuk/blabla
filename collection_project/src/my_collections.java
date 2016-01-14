import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Маргарита on 11.01.2016.
 */
public class my_collections extends LinkedList<flowers> {

    int show_content(flowers[] flowerses){
        for(flowers f1:flowerses)
        {f1.show_flower();
            System.out.println();}

        return 0;
    }

}
