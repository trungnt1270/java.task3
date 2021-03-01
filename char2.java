package bt.session2;

public class char2 {
    public static void main(String[] args){
        char c1 = '0';
        char c2 = 'A';
        char c3;

        //c3 = c1 + c2 // error: RHS evaluated to "int", cannot assign
        c3 = (char)(c1+c2); // Need explicit type casting, return char 'q'
        System.out.println(c3);
        System.out.println(c1+c2);
        System.out.println((char)(c1+c2));
    }
}
