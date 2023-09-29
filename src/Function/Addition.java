package Function;



import Information.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Addition {

    public Students Add_information(ArrayList<Students> newList) {
        Scanner sc = new Scanner(System.in);
        Students stu = new Students();
        System.out.println("请输入学生学号：");
        //学生学号信息输入检查
//        add_check_id(newList, sc, stu);
//        System.out.println("请输入学生姓名：");
//        String name = sc.next();
//        stu.setName(name);
//        System.out.println("请输入学生所在学院(4-6字)：");
//        //学生学院信息输入检查
//        add_check_college(sc, stu);
//        //学生专业班级信息输入检查
//        System.out.println("请输入学生专业班级(4-8字)：");
//        add_check_major(sc, stu);
        return stu;
    }




}