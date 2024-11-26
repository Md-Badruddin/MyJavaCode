package OBJECT_ORIENTED_PROGRAMMING;
                //POLYMORPHISM

class Padh{
        String usn;
        String name;
        double cgpa;

    public void info(){
        System.out.println("Methods with no arguments\n");
    }

    public void info(String usn){
        System.out.println("Methods with arguments..");
        System.out.println("USN of the Student is :" +usn);
    }

    public void info(String name, double cgpa){
        System.out.println("Name of the Student is :" +name +"\nCGPA of the Student is :" +cgpa);
    }
}                

public class OOPS3 {
    public static void main(String[] args) {
        
        Padh s1 = new Padh();
        s1.info();

        s1.usn = "3PD23CS067";
        s1.info(s1.usn);

        s1.name = "Badruddin";
        s1.cgpa = 9.3;
        s1.info(s1.name, s1.cgpa);

    }

    
}