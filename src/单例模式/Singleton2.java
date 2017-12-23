package 单例模式;


/**
 * 懒汉模式，但是线程安全的情况
 * 效率很低，99%情况下不需要同步。
 * @author baba
 *
 */
public class Singleton2 {

   private static Singleton2 instance;
   private Singleton2(){
	   
   }
   public static synchronized Singleton2 getInstance()
   {
	   if(instance==null)
	   {
		   instance=new Singleton2();
	   }
	   return instance;
   }

}
