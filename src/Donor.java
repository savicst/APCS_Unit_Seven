public class Donor {
    private String name;
    private double amount;
//constructor
    public Donor(String n, double a){
        name = n;
        amount = a;
    }
//getters
    public String getName() {
        return name;
    }
    public double getAmount() {
       return amount;
    }
}
