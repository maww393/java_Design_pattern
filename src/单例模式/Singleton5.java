package ����ģʽ;


/**
 * ������̬�ڲ���ģʽ��
 * �ŵ㣺������װ�ص�ʱ��ֱ��ʵ������ֻ����ʾͨ������getInstance����ʱ��
 * �Ż���ʾװ��SingletonHolder�࣬�Ӷ�ʵ����instance
 * ��Ƚ϶���ģʽ�����ַ�ʽ���Ӳ�ռ���ڴ�
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
























