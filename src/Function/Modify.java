package Function;


import Information.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Modify {
    public ArrayList<Students> Modify_information(ArrayList<Students> newList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号：");
        while (true) {
            String id = sc.next();
            if (newList.remove(id)) {
                System.out.println("学生信息修改成功！");
                break;
            }
            System.out.println("该学生信息不存在，请重新输入：");
        }
        return newList;
    }


}
