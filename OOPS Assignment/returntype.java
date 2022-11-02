package p1;

 class returntype {
   int show(){
        System.out.println("hello");
        return 10;

    }
}
class w extends returntype{
     @Override
     int show(){
         super.show();
        System.out.println("java");
        return 0;
    }
}
class Test1{
    public static void main(String[] args) {
        w r = new w();
        r.show();
    }
}
