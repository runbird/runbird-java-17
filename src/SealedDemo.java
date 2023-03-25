/**
 * @author: JimLock
 * @desc: SealedDemo
 * @version:1.0
 * @create:2023/3/25 20:02
 */
public class SealedDemo {
    // 带有 final 修饰符的类是不能继承的，sealed 能扩展类的功能，但是限制只有某些类能继承
    // non-sealed 修饰符，任何类都可以继续扩展
    // permits 明确能够从该class继承的子类名称

    // 只允许 Bicycle, Car, Truck 继承
    public abstract sealed class Vehicle permits Bicycle, Car, Truck {
        // ..
    }

    // Car 带有 final 修饰符，防止进一步扩展
    public final class Car extends Vehicle  {
        //...
    }

    // Truck 带有 sealed 修饰符，只允许特定的类继承
    public sealed class Truck extends Vehicle permits PickTruck, CyberTruck  {
        //...
    }
    // Bicycle 带有 non-sealed 修饰符，任何类都可以继续扩展
    public non-sealed class Bicycle extends Vehicle  {
        //...
    }
    // 任意扩展 Bicycle 类
    public class Motor extends Bicycle {
        //...
    }


    public final class PickTruck extends Truck {}
    public final class CyberTruck extends Truck {}
}
