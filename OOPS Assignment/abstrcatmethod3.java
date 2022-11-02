package p1;

abstract class abstrcatmethod3 {
    public abstract void test();
    public abstract void rank1();
}
    class apple extends abstrcatmethod3{
    @Override
    public void test(){
        System.out.println("test is good");
    }

        @Override
        public void rank1() {

        }
    }
    class banana extends  apple{
        @Override
        public void rank1(){
            System.out.println("3 rd");
        }
    }
class store{
    public static void main(String[] args) {
        abstrcatmethod3 b = new banana();
        b.rank1();
        b.test();
    }
}
