package p1;

abstract class abstrctmethod2 {
    public abstract void developer();
    public abstract void rank();
}
class c extends abstrctmethod2{
    @Override
    public void developer(){
        System.out.println("Dennis");
    }
    @Override
    public void rank(){
        System.out.println("3 rd");
    }
    }
    class jav extends abstrctmethod2{
        @Override
        public void developer() {
            System.out.println("james gosling");
        }
        @Override
        public void rank(){
            System.out.println("1 st");
        }
        }
        class OP{
            public static void main(String[] args) {
                abstrctmethod2 r = new c();
                r.developer();
                r.rank();
           abstrctmethod2 j = new jav();
           j.developer();
           j.rank();
            }
        }



