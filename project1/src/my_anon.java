import java.lang.annotation.*;

/**
 * Created by Маргарита on 06.01.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface my_anon {

    String str();
    int num();
}
