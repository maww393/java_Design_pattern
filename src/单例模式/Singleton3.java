package ����ģʽ;

/**
 * ����ģʽ���ŵ㣺����ص�ʱ�򴴽�һ��ʵ����������ڶ���̴߳������ʵ����
 * ������߳�ͬ��������
 * ȱ�㣺��ʹ�������û���õ�Ҳ�ᱻ�����������������֮���𴴽�
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








