package ����ģʽ;



/**
 * ���󹤳�ģʽ�ļ��ַ�ʽ
 * ����Ŀ�Ķ���Ϊ�˽���
 * ���󹤳�ģʽ�ǹ�������ģʽ�������汾������������һ����ػ����໥�����Ķ���
 */

/**
 * ��Ʒ��
 * @author baba
 *
 */

/**
 * �����ͻ��ͺ�
 * @author baba
 *
 */
abstract class BMA{
	
}
class BMA320 extends BMA{
	
}
class BMA523 extends BMA{
	
}
/**
 * �յ�����
 * @author baba
 *
 */
abstract class Aircondition{
	
}
class airconditionBMA320 extends Aircondition{
	
}
class airconditionBMA523 extends Aircondition{
	
}

//����������

/**
 * ���������ӿ�
 * @author baba
 *
 */
interface FactoryBMA{
	BMA createBMA();
	Aircondition createAirc();
}
/**
 * ����BMA320��
 * @author baba
 *
 */
class FactoryBMA320 implements FactoryBMA{

	@Override
	public BMA createBMA() {
		// TODO �Զ����ɵķ������
		return new BMA320();
	}

	@Override
	public Aircondition createAirc() {
		// TODO �Զ����ɵķ������
		return new airconditionBMA320();
	}	
}
/**
 * ����523��
 * @author baba
 *
 */
class FactoryBMA523 implements FactoryBMA{

	@Override
	public BMA createBMA() {
		// TODO �Զ����ɵķ������
		return new BMA523();
	}

	@Override
	public Aircondition createAirc() {
		// TODO �Զ����ɵķ������
		return new airconditionBMA320();
	}
	
}

/**
 * �ͻ�
 * @author baba
 *
 */
public class AbstractFactory_Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactoryBMA320 fb320=new FactoryBMA320();
		fb320.createBMA();
		fb320.createAirc();
		
		FactoryBMA523 fb523=new FactoryBMA523();
		fb523.createBMA();
		fb523.createAirc();

	}

}


























