package com.example.list_d;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by AWL on 2017/11/9.
 */

public class MapTest {
    public Map<String,Student> studentMap;

    public MapTest() {
        this.studentMap = new HashMap<String, Student>();
    }

    /**
     * 增加put
     *
     */

    public void testPut(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i<3){
            System.out.println("please input id：");
            String ID = scanner.next();
            Student stu = studentMap.get(ID);
            if (stu == null){
                System.out.println("please input name：");
                String name = scanner.next();
                Student newStudent = new Student(ID,name);
                studentMap.put(ID,newStudent);
                System.out.println("put success!");
                System.out.println(studentMap.get(ID).getName());
                i++;
            }else{
                System.out.println("error！该id已存在");
                continue;
            }
        }
    }
    /**
     *  test Map KeySet
     */
    public void keySetT(){
        Set<String> keysets = studentMap.keySet();
        System.out.println("keysets size:"+ keysets.size());
        for (String stuId:keysets) {
            Student st = studentMap.get(stuId);
            if (st!=null)
                System.out.println("stu name:"+ st.getName());
        }
    }

    public static void main(String[] agro){
        MapTest mapTest = new MapTest();
        mapTest.testPut();
        mapTest.keySetT();
    }
}
