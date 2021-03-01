package bt.session2;

public class strToPrimitive {
    public static void main(String[] args){
        // string to int
        String intStr = "5566";
        int number = Integer.parseInt(intStr);
        // input to Integer.parseInt() must be a valid integer literal
        // number = Integer.parseInt("abc") // Runtime error : NumberFormatException

        // string to double float
        String inStr = "55.66";
        float aFloat = Float.parseFloat(inStr);            // aFloat <- 55.66f
        double aDouble = Double.parseDouble("1.2345");  // aDouble <- 1.2345
        aDouble = Double.parseDouble("1.2e-3");         // aDouble <- 0.0012
        //Input to Integer.parseInt() must be a valid double literal
        //aDouble = Double.parseDouble("abc"); // Runtime error : NumberFormException

        //string to char

        //Extract each char
        String msg = "Hello, world";
        char msgChar;
        for(int idx = 0; idx < msg.length(); ++idx){
            msgChar = msg.charAt(idx);
            // Do something about the extracted char
            System.out.println(msgChar);
        }

        //string to boolean
        String boolStr = "true";
        boolean done = Boolean.parseBoolean(boolStr); // done <- true
        boolean valid = Boolean.parseBoolean("false"); // valid <- false

        // 9.5 primitive to string
        String str1 = 123 + "";
        String str2 = 12.34 + "";
        String str3 = 'c' + "";
        String str4 = true + "";

        String str5 = String.valueOf(12345);
        String str6 = String.valueOf(true);
        String str7 = String.valueOf(55.66);

        String str8 = Integer.toString(1234);
        String str9 = Double.toString(1.23);
        String str10 = Character.toString('z');

        //9.6 string.format
        System.out.printf("Hi, %d, %.1f", 11, 22.22);
        String str = String.format("%.1f", 1.234);
    }
}
