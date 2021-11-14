class Caaa{
    private int value;

    public Caaa(){
        value = 10; //value 10 (a)
        System.out.println("value = " + value);
    }
    public Caaa(int i){
        value = i ;
        System.out.println("value = " + value);
    }
}

public class Class03 {
    public static void main(String[]argv){
        Caaa obj = new Caaa();
        Caaa obj2 = new Caaa(12);
    }
}
/* 
(b) 16行呼叫第一個建構元 17行呼叫第二個建構元(有引數的原因)
(c) 不行，一個java檔只能有一個public，且必須跟檔名相同
(d) 對此範例執行沒有影響，但會被其他Class存取。
*/