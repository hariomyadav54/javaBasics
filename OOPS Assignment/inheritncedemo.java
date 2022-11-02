package p1;
interface inheritncedemo {
    void show();
}
interface B{
    void Disp();
}
class total implements inheritncedemo,B{
   public void show (){
        System.out.println("interface A");
    }
   public void  Disp (){
        System.out.println("interface B");
    }
    public static void main(String[] args) {
        total a = new total();
        a.Disp();
        a.show();
    }
    }
