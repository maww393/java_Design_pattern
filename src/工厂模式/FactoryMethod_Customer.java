package ����ģʽ;


/**
 * ��������ģʽ
 * ȱ�㣺��������ģʽ�·��Ѿ��������ĶԶ���Ĵ��������˰�װ��
 * ʹ�ÿͻ������н�����������Ʒ��ɫ�ṩ�Ľӿڣ���ʹ�ö���������ɱ�������
 * ����Ʒ����ǳ���ʱ������ִ�������֮��Ӧ�Ĺ��������ⲻ��������ϣ���ġ�
 * 
 * 1.ʹ�ó���
 * 1)���ͻ�������Ҫ֪��Ҫʹ�ö���Ĵ������̡� 
 * 2)�ͻ�����ʹ�õĶ�����ڱ䶯�Ŀ��ܣ����߸����Ͳ�֪��ʹ����һ������Ķ���
 */

/**
 * ��Ʒ��
 * @author baba
 *
 */
abstract class BMA{
	public  BMA()
	{
		
	}
}

class BMA320 extends BMA{
	public BMA320()
	{
		System.out.println("����---��BMA320");
	}
}
class BMA523 extends BMA{
	public BMA523(){
		System.out.println("����---��BMA523");
	}
}

/**
 * ������
 * @author baba
 *
 */
interface FactoryBMA{
	public BMA CeateBMA();
}
class FactoryBMA320 implements FactoryBMA{

	@Override
	public BMA CeateBMA() {
		// TODO �Զ����ɵķ������
		return new BMA320();
	}
}
class FactoryBMA523 implements FactoryBMA{

	@Override
	public BMA CeateBMA() {
		// TODO �Զ����ɵķ������
		return new BMA523();
	}
	
}

/**
 * �ͻ���
 * @author baba
 *
 */
public class FactoryMethod_Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactoryBMA320 fb320=new FactoryBMA320();
		BMA320 b320=(BMA320) fb320.CeateBMA();

		FactoryBMA523 fb523=new FactoryBMA523();
		BMA523 b523=(BMA523) fb523.CeateBMA();
	}

}
