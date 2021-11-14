class CWin{
    private static int cnt = 0;
    private String color = "black";
    private int width = 0;
    private int height = 0;

    
    //(a)
    public static void count(){
        System.out.println("count = " + cnt);
        System.out.println();
    }
    //(b)
    public CWin(String str,int w,int h){
        color = str;
        width = w;
        height = h;
        System.out.println("color = " + color);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println();
        cnt++;
    }
    //(c)
    public CWin(){
        color = "Red";
        width = 2;
        height = 2;
        System.out.println("color = " + color);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println();
        cnt++;
    }
    //(d)
    public void setZero(){
        cnt = 0;
    }  
    //(e)
    public void setValue(int n){
        cnt = n;
    }
}

public class Class08 {
    public static void main(String[]argv){
        CWin cw1 = new CWin();
        CWin cw2 = new CWin("blue",10,10);
        CWin.count();
        cw2.setZero();
        CWin.count();
        cw1.setValue(5);
        CWin.count();      
    }
    
}
/*
(f)類別變數 同第五題
(e)都可以 (類別函數)另種寫法
*/