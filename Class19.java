class Data{
    private String name;
    private Test score;
    //(a)
    public Data(String na,int e,int m){
        this.name = na ;
        score = new Test(e,m);
    }
    class Test{
        int english;
        int math;
        //(b)
        public Test(int eng,int m){
            english = eng;
            math = m;
        }
        //(c)
        double avg(){
            return(english+math)/2.0;
        }
    }
    //(d)
    void show(){
        System.out.println("學生成績:"+name);
        System.out.println("英文成績:"+score.english);
        System.out.println("數學成績:"+score.math);
        System.out.println("平均成績"+score.avg());
    }
}
public class Class19 {
    public static void main(String[]argv){
        Data stu = new Data("Annie",85,92);
        stu.show();
    }
}
