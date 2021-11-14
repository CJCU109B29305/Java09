class Namecard{
    private String name;
    private String address;
    private Phone data;

    //(a)
    public Namecard(String na,String ad,String co,String ce){
        this.name = na;
        this.address = ad;
        data = new Phone(co,ce);
    }
    class Phone{
        String company;
        String cell;
        //(b)
        public Phone(String s1,String s2){
            company = s1;
            cell = s2;
        }
    }
    //(c)
    void show(){
        System.out.println("name = "+name);
        System.out.println("address = "+address);
        System.out.println("company = "+data.company);
        System.out.println("cell = "+data.cell);
    }
}
public class Class17 {
    public static void main(String[]argv){
        //(d)
        Namecard first = new Namecard("Andy","123City","2345-6789","0911-336600");
        first.show();
    }
}