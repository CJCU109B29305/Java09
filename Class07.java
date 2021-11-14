class x2{
    private int s = 1;

    public void power(int x,int n){
        for(int i = 0;i<n;i++){
            s*=x;
        }
        System.out.println("x**n = " + s);
        s = 1;//可以直接跑下一個物件
    }
}


public class Class07 {
    public static void main(String[]argv){
        x2 x = new x2();
        x.power(2, 5);
        x.power(3, 2);
    }
}
