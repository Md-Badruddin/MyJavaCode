package OBJECT_ORIENTED_PROGRAMMING;
                //ENCAPSULATION   [ ISME PACKAGES AND ACCESS MODIFIERS HAI]

class Bank{
    public String name;
    String phno;
    protected String email;
    private String password;

    public String getpassword(){
        return this.password;
    }

    public String setpassword(String pass){
            return this.password = pass;
    }
}

public class OOPS6 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Bank b1 = new Bank();

        b1.name = "Waseem";
        b1.phno = "8086653412";
        b1.email = "waseem@890gmail.com";
        b1.setpassword("waseem435");
        b1.getpassword();

        System.out.println("The Information of your bank :=\n" +"Name : "+b1.name +"\nPhone no. : " +b1.phno +"\nEmail Address : "+b1.email +"\nPassword : " +b1.getpassword());

    }
    
}
