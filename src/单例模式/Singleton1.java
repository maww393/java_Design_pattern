package 单例模式;

/**
 * 懒汉模式，线程不安全，多线程下不能保障正确的执行
 * @author baba
 *
 */
public class Singleton1 {

    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance()
    {
    	if(instance==null)
    	{
    		instance=new Singleton1();
    	}
    	return instance;
    }
    
}




























