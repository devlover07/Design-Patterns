package singleton;
import singleton.Singleton;


public class App 
{
    public static void main( String[] args )
    {
        Singleton obj1 = Singleton.getObj();
        Singleton obj2 = Singleton.getObj();
        Singleton obj3 = Singleton.getObj();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
