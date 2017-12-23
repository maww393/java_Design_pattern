package 单例模式;

/**
 * 饿汉模式，优点：类加载的时候创建一次实例，不会存在多个线程创建多个实例，
 * 避免多线程同步的问题
 * 缺点：即使这个单例没有用到也会被创建，而且在类加载之后会别创建
 * @author baba
 *
 */
public class Singleton3 {

    private static Singleton3 instance=new Singleton3();
    private Singleton3(){
    }
    public static Singleton3 getInstance()
    {
    	return instance;
    }

}








