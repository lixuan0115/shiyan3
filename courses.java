package sy3;

public class courses {
    int number;
    String coursesname;
    String place;
    float time;
    float score;


    public courses(String coursesname, int number, String place, float time, float score) {
        this.coursesname = coursesname;
        this.number = number;
        this.place = place;
        this.time = time;
        this.score = score;

    }

    public String toString() {
        return   coursesname+    "(课程信息)" + "     课程编号：" + number + "   上课地点：" + place
                + "    课程时间：" + time + "小时" + "     课程学分：" + score + "分";
    }
}