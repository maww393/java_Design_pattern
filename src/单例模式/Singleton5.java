package 单例模式;


/**
 * 单例静态内部类模式，
 * 优点：不会在装载的时候直接实例化，只有显示通过调用getInstance方法时，
 * 才会显示装载SingletonHolder类，从而实例化instance
 * 相比较饿汉模式的两种方式更加不占用内存
 * @author baba
 *
 */
public class Singleton5 {
   private static class SingletonHolder{
	   private static final Singleton5 INSTANCE=new Singleton5();
	   
   }
   private Singleton5(){
	   
   }
   public static final Singleton5 getInstance()
   {
	   return SingletonHolder.INSTANCE;
   }

}
























