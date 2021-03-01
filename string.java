package bt.session2;

public class string {
    public static void main(String[] args){
        String str = "Java is cool!";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));

        //Comparing two strings
        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));
        System.out.println(str.equalsIgnoreCase(anotherStr));
        System.out.println(anotherStr.equals(str));
        System.out.println(anotherStr.equalsIgnoreCase(str));
        // (str == anotherStr) to compare two Strings is WRONG !!!
    }
}
