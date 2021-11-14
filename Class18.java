public class Class18 {
    public static void main(String[]argv){

        final int r = 1;
        (new Object() { 
            int r = 2;//修改值
                public void show() { 
                    System.out.println("area = "+r*r*3.14);                            
                }     
            }).show();
    }
    static class CCircle{
        public double pi = 3.14;
        public double radius;

        public CCircle(double r){
            radius = r;
        }
    }    
}
