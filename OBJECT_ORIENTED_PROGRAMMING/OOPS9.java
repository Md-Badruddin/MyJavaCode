package OBJECT_ORIENTED_PROGRAMMING;
class Talib{
    String name;
    static String School;
}

public class OOPS9 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Talib.School = "PDA College";

        Talib s1 = new Talib();
        s1.name = "Yahya";

        System.out.println("Name of the Student is :"+s1.name +"\nCollege of the Student is :" +s1.School);
    }
}
