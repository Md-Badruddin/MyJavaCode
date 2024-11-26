package OBJECT_ORIENTED_PROGRAMMING;
//Constructor with Parameters

class Angel{

    Angel(){
        System.out.println("Angel came with no arguments.\n");
    }

    Angel(String talk, String msg){
        System.out.println("Angel came with with arguments to the Prophets.");
        System.out.println("1. Believe in only one lord, Allah said by Angel " +talk);
        System.out.println("2.The Mission of the Prophet is to Guide People Said by angel to the Prophet " +msg);
        System.out.println("\n");
    }

}

public class OOPS2 {
    public static void main(String[] args) {

        Angel A = new Angel();
        Angel B = new Angel("Gabriel", "Final Messnger");
    }
    
}
