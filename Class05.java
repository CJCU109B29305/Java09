class CCount{
    private static int cnt = 0;

    public void count(){
        cnt ++;
        System.out.println("count = "+cnt);
    }
    public void setZero(){
        cnt = 0;
        System.out.println("count = "+cnt);
    }
    public void setValue(int n){
        cnt = n; 
        System.out.println("count = "+cnt);
    }

}



public class Class05{
    public static void main(String[]argv){
        //(a)
        CCount cc = new CCount();
        CCount cc1 = new CCount();
        CCount cc2 = new CCount();
        cc.count();
        cc1.count();
        cc2.count();
        //(b)
        cc.setZero();
        //(c)
        cc1.setValue(4);
    }
}
/*

(d)類別變數

類別變數:物件共享，佔用在同一個記憶體
實例變數：獨立，存在於不同記憶體

(e)都可以(我寫的是實例)但是程式寫的方式不同

類別函數：可以直接呼叫
實例函數：必須透過物件來呼叫

*/