package OBJECT_ORIENTED_PROGRAMMING;
            //INHERITANCE

class Animal{
        String color;

    public void mksd(){
        System.out.println("Animal Makes a Sound.");
    }
    public void colour(String color){
        System.out.println("Color of the Animal is :"+color);
    }
                                                                                                                    
}
public class OOPS4 {
    public static void main(String[] args) {
        Animal c1 = new Animal();
        c1.color = "Reddish";
        c1.mksd();
        c1.colour(c1.color);
    }
    
}
