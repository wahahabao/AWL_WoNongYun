package com.example.list_d;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by AWL on 2017/11/6.
 * 使用Object操作集合
 */

public class ListTest  {
    public List courseToSelect;

    public ListTest(){
        this.courseToSelect = new ArrayList();
    }

    //add
    public void addTest(){
        Course course = new Course("123","test1");
        courseToSelect.add(course);
        Course temp = (Course) courseToSelect.get(0);
        System.out.print("添加的测试是："+temp.getId()+":"+temp.getName());
        Course course1 = new Course("1234","test2");
        courseToSelect.add(0,course1);
        Course temp1 = (Course) courseToSelect.get(0);
        Course temp2 = (Course) courseToSelect.get(1);
        System.out.println("添加的测试是："+temp1.getId()+":"+temp1.getName());
        System.out.println("添加的测试是："+temp2.getId()+":"+temp2.getName());
        //addAll(Arrays.asList)
        Course[] courses  = {new Course("123456","test4"),new Course("1234567","test5")};
        courseToSelect.addAll(Arrays.asList(courses));
        System.out.print("size："+courseToSelect.size());
        for (int i = 0;i < courseToSelect.size();i++)
        {   System.out.print("size："+courseToSelect.size());
            Course tempx = (Course) courseToSelect.get(i);
            System.out.println("添加的测试是："+tempx.getId()+":"+tempx.getName());
        }
        Course[] courses1 = {new Course("12345678","test6"),new Course("123456789","test7")};
        courseToSelect.addAll(2,Arrays.asList(courses1));
        System.out.print("size："+courseToSelect.size());
        for (int i = 0;i < courseToSelect.size();i++)
        {   System.out.print("size："+courseToSelect.size());
            Course tempx = (Course) courseToSelect.get(i);
            System.out.println("添加的测试是："+tempx.getId()+":"+tempx.getName());
        }

        Iterator it = courseToSelect.iterator();
        System.out.println("iterator:");
        while (it.hasNext()){
            Course tempy = (Course) it.next();
            System.out.println("添加的测试是："+tempy.getId()+":"+tempy.getName());
        }
        System.out.println("for each:");
        for (Object obj:courseToSelect) {
            Course tempxy = (Course) obj;
            System.out.println("添加的测试是："+tempxy.getId()+":"+tempxy.getName());
        }
    }

    public void modifyTest(){
        courseToSelect.set(4,new Course("wxf","wxf"));
        for (Object obj:courseToSelect) {
            Course tempxx = (Course) obj;
            System.out.println("添加的测试是："+tempxx.getId()+":"+tempxx.getName());
        }
    }

    public void removeTest(){
        System.out.println("执行删除操作");
//        Course cur = (Course) courseToSelect.get(4);
//        courseToSelect.remove(cur);
//        courseToSelect.remove(0);
        Course[] curs = {(Course) courseToSelect.get(2), (Course) courseToSelect.get(4)};
        courseToSelect.removeAll(Arrays.asList(curs));
        Iterator i = courseToSelect.iterator();
        while (i.hasNext()){
            Course tempp = (Course) i.next();
            System.out.println("添加的测试是："+tempp.getId()+":"+tempp.getName());
        }
    }

    public static void main(String agrs[]){
        ListTest listTest = new ListTest();
        listTest.addTest();
        System.out.println("modify");
        listTest.modifyTest();
        listTest.removeTest();
    }
}
