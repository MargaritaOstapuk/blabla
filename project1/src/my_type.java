
import java.lang.reflect.*;
/**
 * Created by ��������� on 05.01.2016.
 */
 class my_type {

    @my_anon(str="string",num=1)
    public static void show_metod()
    {
        my_type ob=new my_type();

        try{
            Class<?> c = ob.getClass();//�������� ������ Class ��� ��������� ������
            Method m = c.getMethod("show_metod");//�������� ������ ������������ ��������
            my_anon an= m.getAnnotation(my_anon.class);//�������� ��������� ������


            System.out.println(an.str()+" "+5*an.num());

        }
        catch (NoSuchMethodException e){
            System.out.println("����� �� ������ ");
        }


    }
}
