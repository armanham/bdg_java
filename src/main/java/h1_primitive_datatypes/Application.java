package h1_primitive_datatypes;

public class Application {

    public static void main(String[] args) {

        //Group (Integer)
        System.out.println("---Group (Integer)---");

        byte a = 12;
        byte b = -120;
        System.out.println("a: " + a + "\n" + "b: " + b);

        short c = 2888;
        short d = 0;
        System.out.println("c: " + c + "\n" + "d: " + d);

        int e = 1;
        int f = 132535;
        System.out.println("e: " + e + "\n" + "f: " + f);

        long g = 23L;
        long h = -788888L;
        System.out.println("g: " + g + "\n" + "h: " + h);

        System.out.println("Max value of byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of byte: " + Byte.MIN_VALUE);

        System.out.println("Max value of short: " + Short.MAX_VALUE);
        System.out.println("Min value of short: " + Short.MIN_VALUE);

        System.out.println("Max value of int: " + Integer.MAX_VALUE);
        System.out.println("Min value of int: " + Integer.MIN_VALUE);

        System.out.println("Max value of long: " + Long.MAX_VALUE);
        System.out.println("Min value of long: " + Long.MIN_VALUE);


        //Group (Floating point number)
        System.out.println("---Group (Floating point number)---");

        float j = 12.543f;
        float k = -1212.043f;
        System.out.println("j: " + j);
        System.out.println("k: " + k);

        double l = 1342531.7685d;
        double m = 34.87576474d;
        System.out.println("l: " + l);
        System.out.println("m: " + m);

        System.out.println("Max value of float: " + Float.MAX_VALUE);
        System.out.println("Min value of float: " + Float.MIN_VALUE);

        System.out.println("Max value of double: " + Double.MAX_VALUE);
        System.out.println("Min value of double: " + Double.MIN_VALUE);

//        9 Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
//          իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?
        double number1 = 34.567839023d;
        float number2 = 12.345f;
        double number3 = 8923.1234857d;
        float number4 = 3456.091f;
        //float-ը ստորակետից հետո ճշգրտության 6bit հնարավորություն ունի, իսկ double-ը՝ 15:
        //Օրինակ բերված օրինակում պետք է տվյալների կորուստ լինի
        float number5 = 34.567839023f;
        System.out.println("34.567839023d: " + number5 + "f");


        //Group (Character)
        System.out.println("---Group (Character)---");

        char n = '#';
        char o = '0';
        System.out.println("n: " + n);
        System.out.println("o: " + o);

        char s = 77;
        char w = 109;
        System.out.println("s = " + s);
        System.out.println("w = " + w);

        char t = '\u0009';
        System.out.println("t: " + (int) t);


        //Group (Boolean)
        System.out.println("---Group (Boolean)---");

        boolean p = true;
        boolean q = false;
        System.out.println("p: " + p);
        System.out.println("q: " + q);

//        13. Ի՞նչ կտպի կոդի այս հատվածը եւ ինչու՞։
//        int year = 201l;
//        System.out.print (year);
        //answer - Compilation error


        System.out.println("---Java Type Casting---");
//        Widening Casting (automatically) - converting a smaller
//        type to a larger type size

        int aa = 7;
        long bb = aa;
        System.out.println("bb after type casting(int aa -> long aa): " + bb);

        int myInt = 7;
        double myDouble = myInt;
        System.out.println("myDouble after type casting: " + myDouble);


//        Narrowing casting must be done manually by placing the type
//        in parentheses in front of the value.

        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println("ii after type casting(double dd = 9.78 -> int dd): " + ii);

        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println("gg after type casting(int ff = 9999 -> byte ff): " + gg);


//        long max = 3123456789;  wrong --- 3123456789L
//        double d = 1000_.00; wrong --- 1000.00
//        char i =’i’; char j=’j’; char ij = i +j; wrong char ij = (char)(i + j)
//        int 7a = 8; wrong --- a = 8
//        long h = h  + 8; wrong նախ պետք է սկզբնարժեքավորել h-ը
//        int n, m = 11; m = n; wrong նախ պետք է սկզբնարժեքավորել m-ը
    }
}
