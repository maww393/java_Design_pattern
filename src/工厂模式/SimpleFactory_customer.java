package ����ģʽ;


/**
 * �򵥹���ģʽ
 * �ŵ㣺���Ƿ��Ͽ���ԭ���
 * ȱ�㣺���ǹ������ֺ���̫���룬��Ϊÿ����һ�����ͳ���
 * ��Ҫ�ڹ�������������Ӧ�Ĵ���ҵ���߼���createBMW(int type)������Ҫ����case��������Ȼ��Υ������ԭ��ġ�
 * �����֪�����²�Ʒ�ļ��룬�������Ǻܱ����ġ����������Ĺ����࣬���ǳ���Ϊȫ��������ϵ��ࡣ 
 * 
 * ���Ǿٵ���������򵥵����������ʵ��Ӧ���У��ܿ��ܲ�Ʒ��һ�����ε���״�ṹ�����ڼ򵥹���ģʽ��ֻ��һ������������Ӧ��Щ��Ʒ��
 * ��������ܻ�����ǵ��ϵ��ۻ��ˣ�Ҳ�ۻ���������Щ����Ա��
 * @author baba
 *
 */

/**
 * ������
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
 * ��Ʒ��
 * @author baba
 *
 */
class SimpleFactory{
	public BMA creatBMA(int type){
		switch(type){
		case 320:
		    return new BMA320();
		case 523:
			return new BMA523();
		default:
		      break;
		}
		return null;
	}
}

/**
 * �ͻ���
 * @author baba
 *
 */
public class SimpleFactory_customer {

	public static void main(String[] args) {
		SimpleFactory  f=new SimpleFactory();
		BMA bma320=f.creatBMA(320);
		BMA bma523=f.creatBMA(523);

	}

}
