abstract class Abstraction_Code {
    public abstract boolean sound();
}

public class loin extends Abstraction_Code{
    public boolean sound(){
        System.out.println("Loin");
        return false;
    }
     public static void main(String[]args){
        Abstraction_Code obg=new loin();

         obg.sound();

        }
        }
