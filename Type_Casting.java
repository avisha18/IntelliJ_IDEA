public class Type_Casting {
    public static void main(String[] args) {

        int i = 50000;
        float f = 5.25645f;
        char c = 'V';
        byte b = 65;
        short s = 568;
        long l = 85256L;
        double d = 5.521;

        double equation = (i*b) + (f+c) - (l/s) /d ;
        System.out.println((i*b) +"  "+ (f+c) +"  "+ (l/s) +"  " + d);
        System.out.println(equation);
    }
}
