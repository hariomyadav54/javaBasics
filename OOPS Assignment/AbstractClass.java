package p1;

 abstract class AbstractClass {
     AbstractClass(){
         System.out.println("all Animals");
     }
     public abstract void eat();
}
class dog extends AbstractClass{
     dog(){
         super();
     }
    @Override
    public void eat() {
        System.out.println("A dog");
    }
}
class Tiger extends AbstractClass {
Tiger(){
    super();
}
    @Override
    public void eat() {
        System.out.println("A Tiger");
    }
    public static void main(String[] args) {
        dog r = new dog();
        Tiger c = new Tiger();
        r.eat();
        c.eat();
    }
}



