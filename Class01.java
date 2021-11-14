class CRectangle{
    int width;
    int height;
   
    //(a)
    void Crectangle(int w,int h) {
        width = w ;
        height = h ;
        System.out.println("width = "+w);
        System.out.println("height = "+h);
    }
    //(b)
    void crectangle(){
        width = 6 ;
        height = 3 ;
        System.out.println("width = "+width);
        System.out.println("height = "+height);
    }
    //(c)
    void This(){
        this.Crectangle(5,4); //this
    }
}
public class Class01{
    public static void main(String[]argv){
        CRectangle cr = new CRectangle();
        cr.Crectangle(10,8); //(a)
        cr.crectangle(); //(b)
        cr.This(); //(c)
    }
}
