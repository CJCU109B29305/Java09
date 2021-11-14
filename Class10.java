class CRational{
    public static int n ;
    public static int d ;

    public void setN(int num){
        n = num;
    }
    public void setD(int num){
        d= num;
    }
    //(b)
    public static void show(){
        System.out.println(n+"/"+d);
    }
    //(a)
    public void setND(int num,int den){
        n = num;
        d = den;
    }
}
public class Class10 {
    public static void main(String[]argv){
        CRational aaa = new CRational();
        aaa.setN(2);
        aaa.setD(5);
        CRational.show();
        aaa.setND(1,9);
        CRational.show();
    }
}
