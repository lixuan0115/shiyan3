package sy3;

public class teacher extends personnel {  //子类
    String lesson;
    public teacher(int number, String name, char sex, String lesson){
        super(number,name,sex);
        this.lesson = lesson;
    }
    public String toString(){
        return   "Teacher(教师信息):" +"  编号：" + number
                + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }
}