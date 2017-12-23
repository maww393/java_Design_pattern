package 单例模式;

/**
 * 单例模式双重校验锁
 * 优点：双重校验锁即实现了延迟加载，又解决了线程并发问题，同时还解决了执行效率问题
 * @author baba
 *
 */
public class Singleton7 {
   private volatile static Singleton7 instance;
    private Singleton7()
    {
    	
    }
    public static Singleton7 getInstance(){
    	if(instance==null)
    	{
    		synchronized(Singleton7.class){
    			if(instance==null){
    				instance=new Singleton7();
    			}
    		}
    	}
    	return instance;
    }

}


























