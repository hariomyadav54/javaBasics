package p1;

public class Customer {
  private int custId;
  private String  custName;

   private String custAddress;

    public void setDisplay(int x){
        custId=x;
    }
    public int getDisplay(){
        return custId;
    }
    public void setCustName(String name){
        custName= name;
    }
    public String getCustName(){
        return custName;
    }
    public void setCustAddress(String City){
        custAddress= City;
    }
    public String getCustAddress() {
        return custAddress;
    }
}
class Hide1{
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setDisplay(10);
        System.out.println(c.getDisplay());
        c.setCustName("Hari");
        System.out.println(c.getCustName());
        c.setCustAddress("Navi Mumbai");
        System.out.println(c.getCustAddress());
    }
}


