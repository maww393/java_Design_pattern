package 工厂模式;



/**
 * 抽象工厂模式的几种方式
 * 最终目的都是为了解耦
 * 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象
 */

/**
 * 产品类
 * @author baba
 *
 */

/**
 * 车类型机型号
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
 * 空调类型
 * @author baba
 *
 */
abstract class Aircondition{
	
}
class airconditionBMA320 extends Aircondition{
	
}
class airconditionBMA523 extends Aircondition{
	
}

//创建工厂类

/**
 * 创建工厂接口
 * @author baba
 *
 */
interface FactoryBMA{
	BMA createBMA();
	Aircondition createAirc();
}
/**
 * 创建BMA320车
 * @author baba
 *
 */
class FactoryBMA320 implements FactoryBMA{

	@Override
	public BMA createBMA() {
		// TODO 自动生成的方法存根
		return new BMA320();
	}

	@Override
	public Aircondition createAirc() {
		// TODO 自动生成的方法存根
		return new airconditionBMA320();
	}	
}
/**
 * 创建523车
 * @author baba
 *
 */
class FactoryBMA523 implements FactoryBMA{

	@Override
	public BMA createBMA() {
		// TODO 自动生成的方法存根
		return new BMA523();
	}

	@Override
	public Aircondition createAirc() {
		// TODO 自动生成的方法存根
		return new airconditionBMA320();
	}
	
}

/**
 * 客户
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


























