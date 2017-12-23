package 单例模式;

/**
 * 饿汉模式变种，优点：类加载的时候创建一次实例，不会存在多个线程创建多个实例，
 * 避免多线程同步的问题
 * 缺点：即使这个单例没有用到也会被创建，而且在类加载之后会别创建
 * @author baba
 *
 */
public class Singleton4 {
    private static Singleton4 instance=null;
    static {
    	instance=new Singleton4();
    }
   private Singleton4()
   {
	   
   }
   public static Singleton4 getInstance(){
	   return instance;
   }

}















