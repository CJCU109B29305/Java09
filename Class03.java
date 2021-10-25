//從某建構元呼叫另一建構元
class Caaa{
    private int value;

    public Caaa(){
        //呼叫此建構元vaule = 10
        System.out.println("vaule = "+value);
    }
    public Caaa(int i){
        value = i;
        System.out.println("vaule = "+value);
    }
}

public class Class03 {
    public static void main(String[]argv){
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);
    }
}
/*在第6行寫下程式碼，使當沒有引數的建構元Caaa()被呼叫時，value的值被設為10
  17.18各是哪一個建構元被呼叫
  第2行是否能宣告public?為甚麼?
  第3行的value 可以改為public嗎?是否有影響?為甚麼?*/