package 工厂模式;


/**
 * 工厂方法模式
 * 缺点：工厂方法模式仿佛已经很完美的对对象的创建进行了包装，
 * 使得客户程序中仅仅处理抽象产品角色提供的接口，但使得对象的数量成倍增长。
 * 当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。
 * 
 * 1.使用场景
 * 1)当客户程序不需要知道要使用对象的创建过程。 
 * 2)客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。
 */

/**
 * 产品类
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
		System.out.println("制造---》BMA320");
	}
}
class BMA523 extends BMA{
	public BMA523(){
		System.out.println("制造---》BMA523");
	}
}

/**
 * 工厂类
 * @author baba
 *
 */
interface FactoryBMA{
	public BMA CeateBMA();
}
class FactoryBMA320 implements FactoryBMA{

	@Override
	public BMA CeateBMA() {
		// TODO 自动生成的方法存根
		return new BMA320();
	}
}
class FactoryBMA523 implements FactoryBMA{

	@Override
	public BMA CeateBMA() {
		// TODO 自动生成的方法存根
		return new BMA523();
	}
	
}

/**
 * 客户类
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
