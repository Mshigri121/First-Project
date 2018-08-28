
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Mohammads Calculator");
    	while(true){
        System.out.println("Please enter the first number:");
        int x = 1; //first num
        System.out.println("Please enter the second number:");
        int y = 4;//second num

        System.out.println("Choose your operation:");
        System.out.println("\t1: Addition");
        System.out.println("\t2: Subtraction");
        System.out.println("\t3: Multiplication");
        System.out.println("\t4: Division");

        int choice = 3; //users choice input
        System.out.println("You choose... " +  choice);
        //Switch Case
        switch(choice){
             case 1: 
                System.out.println("Sum = " + sum(x,y)); 
                break;
             case 2: System.out.println("Subtraction = " + sub(x,y));
                     break;
             case 3: System.out.println("Multiplication = " + mul(x,y));
                     break;
             case 4: System.out.println("Quotient = " + div(x,y));
                     break;
             default: System.out.println("You're retarted..."); 
                     break;

        }

	}

}

// public class Main {

// 	public static void main(String[] args) {
        
//         String name = "Momo";/// 
//         Calculator mo = new Calculator(name);   
//         System.out.println(mo.mul(20,20));
//         System.out.println(mo.user);
//         System.out.println(mo.lastOperation);
//         System.out.println(mo.lastComputation);
//     }

// }
