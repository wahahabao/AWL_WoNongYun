package com.example;

public class MyClassTestJava {

    public static void main(String args[]){
        System.out.println("没有乱码");

        TestCallBack a = new TestCallBack() {
            @Override
            public void solve(String result) {
                System.out.print("使用匿名内部类方式solve");
            }

            @Override
            public void testFuc() {
                System.out.print("使用匿名内部类方式testFuc");
            }
        };
        a.solve("");
        a.testFuc();
    }
}
