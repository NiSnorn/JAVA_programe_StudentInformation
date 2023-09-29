package Function;


import Information.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {

    public ArrayList<Students> Delete_information(ArrayList<Students> newList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号：");
        while (true) {
            String id = sc.next();
            if (newList.contains(id)) {
                System.out.println("学生信息删除成功！");
                break;
            }
            System.out.println("该学生信息不存在，请重新输入：");
        }
        return newList;
    }
}
