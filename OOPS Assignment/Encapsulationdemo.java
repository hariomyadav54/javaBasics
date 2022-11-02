package p1;

public class Encapsulationdemo {
    private int id;
    private String name;
    public void setid(int x){
        id=x;
    }
    public int getid(){
        return  id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
class hide{
    public static void main(String[] args) {
        Encapsulationdemo r= new Encapsulationdemo();
        r.setid(10);
        System.out.println(r.getid());
        r.setName("Hari");
        System.out.println(r.getName());
    }
}
