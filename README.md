
1.实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
2.业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展（黄色背景的文字，不能原篇出现在实验报告中，需要进一步明确所有的属性）。
3.实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

4核心代码
package sy3;

import java.util.Scanner;    
public class test {
    public static void main(String[] args) {
        int flag = 1;
        courses s = null;
        while (flag == 1) {
            Scanner in = new Scanner(System.in);
            courses a = s;      
            Student w = new Student(2019310630, "李瑄", 'M',a);
            System.out.println("学生信息");
            System.out.println(w);
            teacher b = new teacher(1, "王", 'M', "数学");
            teacher c = new teacher(2, "李", 'M', "化学");
            teacher d = new teacher(3, "张", 'W', "英语");
            System.out.println("教师信息");
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            courses e = new courses("数学", 4, "101", 2, 2);
            courses f = new courses("英语", 5, "102", 2, 3);
            courses g = new courses("化学", 6, "103", 2, 4);
            System.out.println("课程信息");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println("请输入1,2,3进行选课: ");
            int x = in.nextInt();// Scanner 类来获取用户的输入
            if (x == 1) {
                a = e;
                System.out.println("已选课: " + e);
                System.out.println(b);
            } else if (x == 2) {
                a = f;
                System.out.println("已选课: " + f);
                System.out.println(c);
            } else if (x == 3) {
                a = g;
                System.out.println("已选课: " + g);
                System.out.println(d);
            } else {
                System.out.println("未查到课程");
            }
            Student n = new Student(2019310630, "李瑄", 'M',a);
            System.out.println(n);

            System.out.println("请输入1,2,3进行退课: ");
            int y = in.nextInt();
            while (x == 1)      //确保只能退已选课程
                if (y == 1) {
                    a = null;
                    System.out.println("已退课: " + e);
                    System.out.println(b);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = e;
                    break;
                }

            while (x == 2)
                if (y == 2) {
                    a = null;
                    System.out.println("已退课: " + f);
                    System.out.println(c);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = f;
                    break;
                }

            while (x == 3)
                if (y == 3) {
                    a = null;
                    System.out.println("已退课: " + g);
                    System.out.println(d);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = g;
                    break;
                }
            Student o = new Student(2019310640, "李瑄", 'M',a);
            System.out.println(o);

            System.out.println("输入1或者2选择继续选退课或者退出");
            int z = in.nextInt();
            while (z == 1) {
                System.out.println("继续选课");
                break;

            }
            while (z == 2) {
                flag = 0;
                System.out.println("退出");
                break;
            }
        }
    }
}
6实验过程
首先确定人员为父类，教师和学生为子类，用扩展继承父类的属性和方法 
其次想好每个类对应他们各自的属性及该补充的信息等
然后利用函数将父类与子类构造并连接起来
用关键字将其关联起来
最后利用scanner获取输入值 把所有信息输出出来
7实验结果
见图片
8实验感想
本次实验进一步了解并更进一步的熟练运用了循环函数，还有对继承函数的认识与了解，可以实现对类与类之间的联系。还有父类与子类之间的构造联系。在做实验写java程序之前要确定这些类的属性以及他们之间该如何
构造联系，和输入输出的运用。
