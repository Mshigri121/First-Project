// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock


public class Calculator{
    //attributes
    public String user;
    public String lastOperation;
    public double lastComputation;
    
    //default constructor
    //Used when creating an object:
         //String name = in.nextLine();
        //ex; Calculator myCalculator = new Calculator(name);
    public Calculator(String aUser){
        this.user = (aUser + "'s Calculator");
        this.lastOperation = "Not used"; 
        this.lastComputation = 0;
    }
    
    //Used on THE object:
        //ex; myCalculator.sum();
     public double sum(double x, double y){
         this.lastOperation = "Sum"; 
         double sum = x+y;
         this.lastComputation = sum;
         return sum;
     }
 
     public double sub(double x, double y){
         this.lastOperation = "Sub"; 
         double sub = x - y;
         this.lastComputation = sub;
         return sub;
     }
 
     public double mul(double x, double y){
         this.lastOperation = "Mul"; 
         double mul = x * y;
         this.lastComputation = mul;
         return mul;
     }

     public double div(double x, double y){
         this.lastOperation = "Div"; 
         double div = x / y;
         this.lastComputation = div;
         return div;
     }
}
    
