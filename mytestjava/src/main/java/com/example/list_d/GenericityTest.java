package com.example.list_d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by AWL on 2017/11/9.
 * 使用泛型操作集合
 */

public class GenericityTest {

    public List<Course> genericityTestList;

    public GenericityTest() {
        this.genericityTestList = new ArrayList<Course>();
    }

    public void add(){
        Course course = new Course("1","11");
        genericityTestList.add(course);
//        genericityTestList.add("vdv"); //List<Course> genericityTestList使用了泛型，只能添加Course，不能添加其它类型的。
        genericityTestList.add(new Course("2","22"));
    }

    public void childAdd(){
        Course[] childx = {new Course("3","33"),new Course("4","44")};
        genericityTestList.addAll(Arrays.asList(childx));
    }

    public void ForEach(){
        System.out.println("ForEach");
        for (Course cour:genericityTestList) {
                System.out.println("Id："+cour.getId()+" name："+cour.getName());
        }

//        Iterator it = genericityTestList.iterator();
        Iterator<Course> it = genericityTestList.listIterator();
        System.out.println("Iterator");
        while (it.hasNext()){
//            System.out.println("一定要大力记住这种写法it.next,不能满足要求。每写一次it.next都会往后移动，都不是同一个it"+"Id："+it.next().getId()+" name："+it.next().getName());
            Course couse = (Course) it.next();
            System.out.println("区分"+"Id："+couse.getId()+" name："+couse.getName());
        }
    }

    public static void main(String[] agrs){
        GenericityTest genericityTest = new GenericityTest();
        genericityTest.add();
        genericityTest.childAdd();
        genericityTest.ForEach();
    }

}
