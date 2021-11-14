class sum{
    private int s = 0;

    public void add2n(int n){
        for(int i=0;i<=n;i++){
            s+=i;
        }
        System.out.println("sum = "+s);
    }
}

public class Class06 {
    public static void main(String[]argv){
        sum a = new sum();
        a.add2n(100);//輸入值
    }
}
