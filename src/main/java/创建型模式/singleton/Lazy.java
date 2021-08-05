package 创建型模式.singleton;

public class Lazy {

    private static volatile Lazy lazy;

    private Lazy(){
    }

    public static  Lazy getLazy(){
        if(lazy == null){
            synchronized (Lazy.class){
                if(lazy == null){
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
