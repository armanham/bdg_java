package h3.operators;

import h2_methods.Application;

/**
 * @author Arman Hambardzumyan
 */
public class OperatorsUtil {

    public static void main(String[] args) {

        System.out.println("---Arithmetic operators---");

        int a = 8;
        int b = 6;
        System.out.println(
                "a: " + a +
                        "\nb: " + b +
                        "\na + b: " + (a + b) +
                        "\na * b: " + (a * b) +
                        "\na - b: " + (a - b) +
                        "\na / b: " + (a / b) +
                        "\na % b: " + (a % b) + "\n"
        );

        double c = 6.4;
        double d = 0.03;
        System.out.println(
                "c: " + c +
                        "\nd: " + d +
                        "\nc + d: " + (c + d) +
                        "\nc * d: " + (c * d) +
                        "\nc - d: " + (c - d) +
                        "\nc / d: " + (c / d) +
                        "\nc % d: " + (c % d) + "\n"
        );

        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("x: " + x + "\ny: " + y + "\n");


        System.out.println("---Unary Operators---");

        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("n1: " + n1);
        System.out.println("-e: " + (-e));
        System.out.println("-f: " + (-f));
        System.out.println("+e: " + (+e));
        System.out.println("(-e + 92): " + (-e + 92));
        System.out.println("!n1: " + (!n1));
        System.out.println("!(!n1): " + (!(!n1)));
        System.out.println("e++: " + e++);
        System.out.println("--f: " + --f + "\n");

        int x1 = 3;
        int y1 = ++x1 * 5 / x1-- + --x1;
        System.out.println("x1 is " + x1);
        System.out.println("y1 is " + y1 + "\n");


        System.out.println("---Assignment Operator---");
        int x2 = (int) 1.0;
        System.out.println("x2: " + x2);
        short y2 = (short) 1921222;
        System.out.println("y2: " + y2);
        System.out.println("(2147483647 + 1): " + (2147483647 + 1));
        long y3 = (x = 3);
        System.out.println("y3: " + y3);
        boolean y4 = false;
        boolean x4 = (y4 = true);
        System.out.println("x4: " + x4 + "\n");


        System.out.println("---Relational Operators---");

        int aa = 10;
        int bb = 20;
        System.out.println("aa: " + aa + "\nbb: " + bb);
        System.out.println("aa < bb: " + (aa < bb));
        System.out.println("aa <= bb: " + (aa <= bb));
        System.out.println("aa >= bb: " + (aa >= bb));
        System.out.println("aa > bb: " + (aa > bb) + "\n");


        System.out.println("---Additional tasks---");
        float g = 2.1f;

        byte m = 5;
        byte n = 10;
        //byte k = m + n; wrong
        byte k = (byte) (m + n);
        //or
        int kk = m + n;

        short m2 = 10;
        short n2 = 3;
        //short k2 = m2 * n2; wrong
        short k2 = (short) (m2 * n2);
        //or
        int kk2 = m2 * n2;

        long m3 = 10;         //version1 - int m3
        int n3 = 5;           //version2 - long n3
        n3 = (int) (n3 * m3); //version3 - (n3 * m3) cast to int


//        Հայտարարել.   երկու  int  տիպի  փոփոխականներ,  վերագրել  10  եւ  5  այնուհետեւ
//        փոփոխականի արժեքները տեղերով փոխել։
        int p = 10;
        int q = 5;
        System.out.println("p: " + p);
        System.out.println("q: " + q + "\n");
        int temp = p;
        p = q;
        q = temp;
        System.out.println("p: " + p);
        System.out.println("q: " + q + "\n");

//        փորձեք   նախորդ   խնդիրը   լուծել   առանց   երրորդ   փոփոխական   օգտագործելու։
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("p: " + p);
        System.out.println("q: " + q + "\n");

        //Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը
        //I already have this method for all [int a; int b] cases in homework_2.Application (PS. sorry for my english)
        Application ap = new Application();
        System.out.println("Sum of [1; 100]: " + ap.sumOfSequenceOfNumbers(1, 100) + "\n");


        System.out.println("---Bitwise & Logical Operators---");

        int aaa = 8;
        int bbb = 3;
        System.out.println("aaa: " + aaa);
        System.out.println("bbb: " + bbb);
        System.out.println("aaa & bbb: " + (aaa & bbb));
        System.out.println("aaa ^ bbb: " + (aaa ^ bbb));
        System.out.println("aaa | bbb: " + (aaa | bbb));
        System.out.println("~aaa: " + (~aaa));
        System.out.println("true || (aaa < 4): " + (true || (aaa < 4)));
        System.out.println("(bbb >= 6) || (++aaa <= 7): " + ((bbb >= 6) || (++aaa <= 7)));
        System.out.println("(aaa < bbb) ? aaa : bbb: " + ((aaa < bbb) ? aaa : bbb));
        System.out.println("bbb ^ bbb: " + (bbb ^ bbb) + "\n");


        System.out.println("---Shift Operator---");

        System.out.println("10 << 2: " + (10 << 2));
        System.out.println("-10 << 3: " + (-10 << 3));
        System.out.println("20 >> 2: " + (20 >> 2));
        System.out.println("15 >> 3: " + (15 >> 3) + "\n");

        //Տրված   փոփոխականը   բազմապատկեք   8-ով   եւ   16-ով   առանց օգտագործելու *-նշանը։
        int j = 3;
        System.out.println("j: " + j);
        System.out.println("(j * 8) == (j << 3): " + (j << 3));
        System.out.println("(j * 16) == (j << 4): " + (j << 4));
    }
}
