package ����ģʽ;

/**
 * ����ģʽ���֣��ŵ㣺����ص�ʱ�򴴽�һ��ʵ����������ڶ���̴߳������ʵ����
 * ������߳�ͬ��������
 * ȱ�㣺��ʹ�������û���õ�Ҳ�ᱻ�����������������֮���𴴽�
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















