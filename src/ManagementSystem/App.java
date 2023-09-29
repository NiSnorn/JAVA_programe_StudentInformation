package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[]args){
        //选择登录系统界面
        System.out.println("----------学生信息管理系统----------");
        System.out.println("* 1、学生登录  2、教师登录  3、退出  *");
        System.out.println("---------------------------------");

        //学生端界面
        System.out.println("----------学生信息管理系统----------");
        System.out.println("*     1、查看信息      2、返回     *");
        System.out.println("---------------------------------");

        //教师登录界面
        System.out.println("----------学生信息管理系统----------");
        System.out.println("*1、添加信息  2、删除信息  3、修改信息*");
        System.out.println("*4、查看信息  5、返回              *");
        System.out.println("---------------------------------");

    }



    //教师端登录
    public static <Student> void Login_teacher(ArrayList<Student> list) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //已知用户名密码
        String name = "Login";
        String passwords = "123456";
        //获取用户名密码
//        while (true) {
//            System.out.println("请输入用户名：");
//            String username = sc1.next();
//            System.out.println("请输入密码：");
//            String user_password = sc2.next();
//            if (name.equals(username) && passwords.equals(user_password)) {
//                System.out.println("登陆成功");
//                Management_teacher(list);
//                break;
//            } else {
//                System.out.println("用户名或密码错误，请重新输入：");
//            }
//        }
//    }
    //登陆系统选择
//    Scanner sc = new Scanner(System.in);
//        wc:
//            while (true) {
//        System.out.println("----------学生信息管理系统----------");
//        System.out.println("* 1、学生登录  2、教师登录  3、退出  *");
//        System.out.println("---------------------------------");
//        int flag = sc.nextInt();
//        switch (flag) {
//            case 1:
//                Management_student(list);
//                break;
//            case 2:
//                Login_teacher(list);
//                break;
//            case 3:
//                break wc;
//            default:
//                System.out.println("输入有误，请重新输入：");
//                break;
//        }
//    }
//
//
//    //学生功能选择
//    Scanner sc = new Scanner(System.in);
//    wc2:
//            while (true) {
//        System.out.println("----------学生信息管理系统----------");
//        System.out.println("*     1、查看信息      2、返回     *");
//        System.out.println("---------------------------------");
//        int flags = sc.nextInt();
//        switch (flags) {
//            case 1:
//                view_Student_information(list);
//                break;
//            case 2:
//                break wc2;
//        }
//    }
//
//
//    //教师端功能选择
//    Scanner sc = new Scanner(System.in);
//    wc:
//            while (true) {
//        System.out.println("----------学生信息管理系统----------");
//        System.out.println("*1、添加信息  2、删除信息  3、修改信息*");
//        System.out.println("*4、查看信息  5、返回              *");
//        System.out.println("---------------------------------");
//        int flag = sc.nextInt();
//        switch (flag) {
//            case 1://学生信息的添加
//                add_Student_information(list);
//                break;
//            case 2://学生信息的删除
//                delete_Student_information(list);
//                break;
//            case 3://学生信息的修改
//                modify_Student_information(list);
//                break;
//            case 4://学生信息的查询
//                view_Student_information(list);
//                break;
//            case 5:
//                break wc;
//            default:
//                System.out.println("输入有误，请重新输入：");
//                break;
//        }
    }

}
