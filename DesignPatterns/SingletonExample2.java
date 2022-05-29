package DesignPatterns;

class Singleton2{
    private static Singleton2 obj;
    private Singleton2() {}

    public static Singleton2 getInstance()
    {
        if(obj==null)
            synchronized (Singleton2.class)
            {
                if(obj==null)
                    obj=new Singleton2();
            }
        return obj;
    }

}


public class SingletonExample2 {

    public static void main(String[] args) {
        Singleton2 obj= Singleton2.getInstance();
        System.out.println(obj);

        Singleton2 obj2= Singleton2.getInstance();
        System.out.println(obj2);

    }
}
