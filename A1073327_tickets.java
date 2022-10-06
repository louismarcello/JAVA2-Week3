import java.security.*;

class ticket implements Runnable{

    static int tickets = 10000;
    private String machine;
    int sold, MAX=4;
    Thread t;
    SecureRandom random = new SecureRandom();

    ticket(String machine){
        this.machine = machine;
        sold=0;
        t=new Thread(this, machine);
        t.start();
    }

    public void run(){

        while(available()){
            int buyAmount = 1+random.nextInt(MAX);
            if (buyAmount<=tickets){
                Ticket(buyAmount);
                sold+=buyAmount;
                System.out.println(buyAmount+" tickets sold at "+machine);
            }
        }
        System.out.println(" Total number of tickets sold at "+machine+" is "+sold);
    }

    public boolean available(){
        if (tickets>0){
            return true;
        }else{
            return false;
        }
    }
    synchronized private static void Ticket(int buyAmount){

        tickets-=buyAmount;
        return;
} 

public class A1073327_tickets {
        public static void main(String[] args) {
            ticket m1 = new ticket("Machine 1");
            ticket m2 = new ticket("Machine 2");
            ticket m3 = new ticket("Machine 3");
        }
    }
}