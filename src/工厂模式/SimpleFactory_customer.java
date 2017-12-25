package 工厂模式;


/**
 * 简单工厂模式
 * 优点：它是符合开闭原则的
 * 缺点：但是工厂部分好像不太理想，因为每增加一种新型车，
 * 都要在工厂类中增加相应的创建业务逻辑（createBMW(int type)方法需要新增case），这显然是违背开闭原则的。
 * 可想而知对于新产品的加入，工厂类是很被动的。对于这样的工厂类，我们称它为全能类或者上帝类。 
 * 
 * 我们举的例子是最简单的情况，而在实际应用中，很可能产品是一个多层次的树状结构。由于简单工厂模式中只有一个工厂类来对应这些产品，
 * 所以这可能会把我们的上帝累坏了，也累坏了我们这些程序员。
 * @author baba
 *
 */

/**
 * 工厂类
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
 * 产品类
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
 * 客户类
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
