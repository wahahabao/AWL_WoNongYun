package com.wonongyun.awl.awl_wonongyun.face;

/**
 * Created by AWL on 2017/10/31.
 */
interface interTest {
    public static final int CANNEL = 56;
    void checkout();
}
interface interTest01{
    void send();
}
interface interTest02  extends interTest01{
    public static final int TIME = 1000;
}
abstract class absTest{
    public abstract void res();
}

class WxfClass extends absTest implements interTest,interTest01 {

    @Override
    public void checkout() {
        //实现interTest接口中的抽象方法
    }

    @Override
    public void send() {
        //实现interTest01接口中的抽象方法
    }

    @Override
    public void res() {
        //实现抽象类中的抽象方法
    }
}

class wxfClass01{
    private String name;
}
class wxfClass02 implements interTest02{

    @Override
    public void send() {

    }
}
public class interDemo {
    public static void main(String arg[]){
//        interTest a = new interTest();
    }
}

