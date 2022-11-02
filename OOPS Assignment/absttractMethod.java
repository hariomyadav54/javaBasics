package p1;

abstract class absttractMethod {
    public abstract void developer();
}
class html extends absttractMethod{
    @Override
    public void developer (){
        System.out.println("tim lee");
    }
}
class java extends absttractMethod {
    @Override
    public void developer (){
        System.out.println("james gos");
    }
}
class Main{
    public static void main(String[] args) {
        absttractMethod h = new html();
        h.developer();
        absttractMethod j = new java();
        j.developer();

    }
}