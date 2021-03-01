package bt.session2;

public class char3 {
    public static void main(String[] args){
        char c1 = '0';
        char c2 = 'A';
        char c3;

        //c3 = c1 + 5 // error: RHS evaluated to "int", cannot assign
        c3 = (char)(c1+5); // Need explicit type casting, return char 'q'
        System.out.println(c3);
        System.out.println(c1+5);


        for( int codeNum ='a'; codeNum <= 'z'; ++codeNum){
            System.out.println((char)codeNum + "; " + codeNum);
        }
    }
}
