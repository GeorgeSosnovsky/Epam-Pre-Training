public class Test {
    public static void ByteTest() {
        byte a = 6, b = 12, c;

        System.out.println("Arithmetical operations with Byte type:");

        //addition
        c = (byte) (a + b);
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = (byte) (a - b);
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = (byte) (a * b);
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = (byte) (a / b);
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = (byte) (a % b);
        System.out.println(a + " % " + b + " = " + c);
        //prefix increment
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 6;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 6;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 6;
        System.out.println(a + "-- = " + a--);
        //unary minus
        c = (byte) -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (byte) +a;
        System.out.println("+" + a + " = " + c);

        System.out.println("Logical Operations with byte type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") : " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("Bitwise Operations with byte type:");

        //bitwise and
        c = (byte) (a & b);
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = (byte) (a | b);
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = (byte) (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = (byte) ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = (byte) (a << 1);
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = -36;
        c = (byte) (a >> 1);
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 36;
        c = (byte) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -36;
        c = (byte) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");

        System.out.println("Assignment Operations with byte type:");

        c = 36;
        System.out.println(c + " += " + a + " : c = " + (c += a));
        System.out.println(c + " -= " + a + " : c = " + (c -= a));
        System.out.println(c + " *= " + a + " : c = " + (c *= a));
        System.out.println(c + " /= " + a + " : c = " + (c /= a));
        System.out.println(c + " |= " + a + " : c = " + (c |= a));
        System.out.println(c + " &= " + a + " : c = " + (c &= a));
        System.out.println(c + " %= " + a + " : c = " + (c %= a));
        c = 36;
        System.out.println(c + " ^= " + a + " : c = " + (c ^= a));
        System.out.println(c + " >>= " + a + " : c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " : c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " : c = " + (c >>>= a));

        System.out.println("Relational Operations with byte type:");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        //Type casting
        System.out.println("Type casting:");

        byte b1 = 120;
        short s = 21234;
        char c1 = '\u0158';
        int i = 123_345_567;
        long l = 123_345_567_789L;
        float f = 148.12431F;
        double d = 2.34e190;
        boolean b2 = true;
        c = (byte) s;
        System.out.printf("byte = short: c = (byte) %d -> %d\n", s, c);
        c = (byte) c1;
        System.out.printf("byte = char: c = (byte) %c -> %d\n", c1, c);
        c = (byte) i;
        System.out.printf("byte = int: c = (byte) %d -> %d\n", i, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte) %d -> %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte) %f -> %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte) %e -> %d\n", d, c);

    }
    public static void ShortTest() {
        short a = 1111;
        short b = 324;
        short c;

        System.out.println("Arithmetical operation with short type:");

        //addition
        c = (short) (a + b);
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = (short) (a - b);
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = (short) (a * b);
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = (short) (a / b);
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = (short) (a % b);
        System.out.println(a + " % " + b + " = " + c);
        //prefix increment
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 1234;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 1234;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 1234;
        System.out.println(a + "-- = " + a--);
        //unary minus
        c = (short) -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (short) +a;
        System.out.println("+" + a + " = " + c);

        System.out.println("Logical Operations with short type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") : " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") : " + !(a >= b));

        System.out.println("Bitwise Operations with short type:");

        //bitwise and
        c = (short) (a & b);
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = (short) (a | b);
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = (short) (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = (short) ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = (short) (a << 1);
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = -615;
        c = (short) (a >> 1);
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 615;
        c = (short) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -615;
        c = (short) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");

        System.out.println("Assignment Operations with short type:");

        c = 12345;
        System.out.println(c + " += " + a + " : c = " + (c += a));
        System.out.println(c + " -= " + a + " : c = " + (c -= a));
        System.out.println(c + " *= " + a + " : c = " + (c *= a));
        System.out.println(c + " /= " + a + " : c = " + (c /= a));
        System.out.println(c + " %= " + a + " : c = " + (c %= a));
        System.out.println(c + " |= " + a + " : c = " + (c |= a));
        System.out.println(c + " &= " + a + " : c = " + (c &= a));
        c = 12345;
        System.out.println(c + " ^= " + a + " : c = " + (c ^= a));
        System.out.println(c + " >>= " + a + " : c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " : c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " : c = " + (c >>>= a));

        System.out.println("Relational Operations with short type :");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " !=" + b + " : " + (a != b));


        System.out.println("Type casting:");

        byte bt = 112;
        char ch = '\u0067';
        int i = 1234567;
        long l = 340000456753234240L;
        float f = 179.5411f;
        double d = 12345.1234;
        boolean bool = false;

        c = bt;
        System.out.println("short = byte: c = " + bt + " : c = " + c);
        c = (short) ch;
        System.out.println("short = char: c = " + ch + " : c = " + c);
        c = (short) i;
        System.out.println("short = int: c = " + i + " : c = " + c);
        c = (short) l;
        System.out.println("short = long: c = (short) " + l + " : c = " + c);
        c = (short) f;
        System.out.println("short = float: c = (short) " + f + " : c = " + c);
        c = (short) d;
        System.out.println("short = double: c = (short) " + d + " : c = " + c);


    }
    public static void IntTest() {
        int a = 45730748;
        int b = 493056389;
        int c;

        System.out.println("rithmetical operation with int type:");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);
        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 12345678;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 12345678;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 12345678;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 12345678;
        System.out.println(a + "-- = " + a--);

        System.out.println("Bitwise Operators with int type:");
        //bitwise and
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = a << 1;
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = -12345678;
        c = a >> 1;
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 12345678;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -12345678;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");

        System.out.println("Assignment Operation with int type:");

        c = 12345678;
        System.out.println(c + " += " + a + " : c = " + (c += a));
        System.out.println(c + " -= " + a + " : c = " + (c -= a));
        System.out.println(c + " *= " + a + " : c = " + (c *= a));
        System.out.println(c + " /= " + a + " : c = " + (c /= a));
        System.out.println(c + " %= " + a + " : c = " + (c %= a));
        System.out.println(c + " |= " + a + " : c = " + (c |= a));
        System.out.println(c + " &= " + a + " : c = " + (c &= a));
        System.out.println(c + " ^= " + a + " : c = " + (c ^= a));
        System.out.println(c + " >>= " + a + " : c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " : c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " : c = " + (c >>>= a));

        System.out.println("Relational Operation with int type:");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        System.out.println("Logical Operations with int type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") :" + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") : " + !(a >= b));

        System.out.println("Type casting:");

        byte bt = 9;
        short sh = 12345;
        char ch = '\u0092';
        long l = 15000000000000L;
        float f = 5.6f;
        double d = 1341235.123;
        boolean bool = false;

        c = bt;
        System.out.println("int = byte: c = " + bt + " : c = " + c);
        c = sh;
        System.out.println("int = short: c = " + sh + " : c = " + c);
        c = ch;
        System.out.println("int = char: c = " + ch + " : c = " + c);
        c = (int) l;
        System.out.println("int = long: c = (int) " + l + " : c = " + c);
        c = (int) f;
        System.out.println("int = float: c = (int) " + f + " : c = " + c);
        c = (int) d;
        System.out.println("int = double: c = (int) " + d + " : c = " + c);

    }
    public static void LongTest() {
        long a = 1234567891234L;
        long b = 123456789123456L;
        long c;

        System.out.println("Arithmetical Operators with long type:");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 1234567891234L;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 1234567891234L;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 1234567891234L;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 21234567891234L;
        System.out.println(a + "-- = " + a--);

        System.out.println("Bitwise Operations with long type:");
        //bitwise and
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " & " + Long.toBinaryString(b) + " = " + Long.toBinaryString(c)+ "\n");
        //bitwise OR
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " | " + Long.toBinaryString(b) + " = " + Long.toBinaryString(c) + "\n");
        //bitwise xor
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " ^ " + Long.toBinaryString(b) + " = " + Long.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Long.toBinaryString(a) + " = " + Long.toBinaryString(c) + "\n");
        //left shift
        c = a << 1;
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " << 1 = " + Long.toBinaryString(c) + "\n");
        //right shift
        a = -1234567891234L;
        c = a >> 1;
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " >> 1 = " + Long.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 1234567891234L;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " >>> 1 = " + Long.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -1234567891234L;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " >>> 1 = " + Long.toBinaryString(c) + "\n");

        System.out.println("------- Assignment Operators with \"long\" type -------");

        a = -1234567891234L;
        System.out.println(c + " += " + a + " : c = " + (c += a));
        System.out.println(c + " -= " + a + " : c = " + (c -= a));
        System.out.println(c + " *= " + a + " : c = " + (c *= a));
        System.out.println(c + " /= " + a + " : c = " + (c /= a));
        System.out.println(c + " %= " + a + " : c = " + (c %= a));
        System.out.println(c + " |= " + a + " : c = " + (c |= a));
        System.out.println(c + " &= " + a + " : c = " + (c &= a));
        System.out.println(c + " ^= " + a + " : c = " + (c ^= a));
        c = -1234567891234L;
        System.out.println(c + " >>= " + a + " : c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " : c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " : c = " + (c >>>= a));

        System.out.println("Relational Operators with long type:");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        System.out.println("Logical Operations with long type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") : " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") : " + !(a >= b));

        System.out.println("Type casting:");

        byte bt = 90;
        short sh = 12345;
        char ch = '\u1911';
        int i = 1234567890;
        float f = 544113.11f;
        double d = 2234.18;
        boolean bool = false;

        c = bt;
        System.out.println("long = byte: c = " + bt + " --> c = " + c);
        c = sh;
        System.out.println("long = short: c = " + sh + " --> c = " + c);
        c = ch;
        System.out.println("long = char: c = " + ch + " --> c = " + c);
        c = i;
        System.out.println("long = int: c = " + i + " --> c = " + c);
        c = (long) f;
        System.out.println("long = float: c = (long) " + f + " --> c = " + c);
        c = (long) d;
        System.out.println("long = double: c = (long) " + d + " --> c = " + c);


    }
    public static void FloatTest() {
        float a = 123.123f;
        float b = 321.231f;
        float c;

        System.out.println("Arithmetical Operation with float type:");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 123.123f;
        System.out.println("++" + a + " = " + ++a);
        //postfix increment
        a = 123.123f;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 123.123f;
        System.out.println("--" + a + " = " + --a);
        //postfix decrement
        a = 123.123f;
        System.out.println(a + "-- = " + a--);

        System.out.println("Assignment Operation with float type:");

        c = 9923.2332f;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));

        System.out.println("Relational Operation with float type:");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        System.out.println("Logical Operations with float type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") : " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") : " + !(a >= b));

        System.out.println("Type casting");

        byte bt = 120;
        short sh = -1324;
        char ch = '\u9000';
        int i = 123456789;
        long l = 123456789123456L;
        double d = 1234567.142;
        boolean bool = false;

        c = bt;
        System.out.println("float = byte: c = " + bt + " : c = " + c);
        c = sh;
        System.out.println("float = short: c = " + sh + " : c = " + c);
        c = ch;
        System.out.println("float = char: c = " + ch + " : c = " + c);
        c = i;
        System.out.println("float = int: c = " + i + " : c = " + c);
        c = l;
        System.out.println("float = long: c =  " + l + " : c = " + c);
        c = (float) d;
        System.out.println("float = double: c = (float) " + d + " : c = " + c);
    }
    public static void DoubleTest() {
        double a = 1234.123;
        double b = 321.123;
        double c;

        System.out.println("Arithmetical operations with double type:");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 1234.123;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 1234.123;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 1234.123;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 1234.1233;
        System.out.println(a + "-- = " + a--);

        System.out.println("------- Assignment Operators with \"double\" type -------");

        c = 321.123;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));

        System.out.println("Relational Operation with double type:");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        System.out.println("Logical Operations with double type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") : " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") : " + !(a >= b));

        System.out.println("Type casting:");

        byte bt = 120;
        short sh = 23000;
        char ch = '\u1011';
        int i = 123456789;
        long l = 21111010100000L;
        float f = 14.123f;
        boolean bool = false;

        c = bt;
        System.out.println("double = byte: c = " + bt + " : c = " + c);
        c = sh;
        System.out.println("double = short: c = " + sh + " : c = " + c);
        c = ch;
        System.out.println("double = char: c = " + ch + " : c = " + c);
        c = i;
        System.out.println("double = int: c = " + i + " : c = " + c);
        c = l;
        System.out.println("double = long: c =  " + l + " : c = " + c);
        c = f;
        System.out.println("double = float: c =  " + f + " : c = " + c);

    }
    public static void CharTest(){
        char a = 'P';
        char b = '\u1324';
        char c;

        System.out.println("Arithmetical operation with char type:");

        //addition
        c = (char) (a + b);
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = (char) (a - b);
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = (char) (a * b);
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = (char) (a / b);
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = (char) (a % b);
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = (char) -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (char) +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 'p';
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 'p';
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 'p';
        System.out.println(a + "-- = " + a--);


        System.out.println("Bitwise Operation with char type:");

        //bitwise and
        c = (char) (a & b);
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = (char) (a | b);
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = (char) (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = (char) ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = (char) (a << 1);
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = '\123';
        c = (char) (a >> 1);
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = '\123';
        c = (char) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        System.out.println("Assignment Operation with char type:");

        c = '/';
        System.out.println(c + " += " + a + " : c = " + (c += a));
        System.out.println(c + " -= " + a + " : c = " + (c -= a));
        System.out.println(c + " *= " + a + " : c = " + (c *= a));
        System.out.println(c + " /= " + a + " : c = " + (c /= a));
        System.out.println(c + " %= " + a + " : c = " + (c %= a));
        System.out.println(c + " |= " + a + " : c = " + (c |= a));
        System.out.println(c + " &= " + a + " : c = " + (c &= a));
        c = '_';
        System.out.println(c + " ^= " + a + " : c = " + (c ^= a));
        c = '_';
        System.out.println(c + " >>= " + a + " : c = " + (c >>= a));
        c = '_';
        System.out.println(c + " <<= " + a + " : c = " + (c <<= a));
        c = '_';
        System.out.println(c + " >>>= " + a + " : c = " + (c >>>= a));

        System.out.println("Relational Operation with char type:");

        //greater than
        System.out.println(a + " > " + b + " : " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " : " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " : " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " : " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        System.out.println("Logical operations with char type:");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") : " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") : " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") : " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") : " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") : " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") : " + !(a >= b));

        System.out.println("Type casting:");

        byte bt = 120;
        short sh = 1234;
        int i = 65234233;
        long l = 11011000000000L;
        float f = 123.23f;
        double d = 1344244.124;
        boolean bool = false;

        c = (char) bt;
        System.out.println("char = byte: c = (char) " + bt + " : c = " + c);
        c = (char) sh;
        System.out.println("char = short: c = (char) " + sh + " : c = " + c);
        c = (char) i;
        System.out.println("char = int: c = (char) " + i + " : c = " + c);
        c = (char) l;
        System.out.println("char = long: c = (char) " + l + " : c = " + c);
        c = (char) f;
        System.out.println("char = float: c = (char) " + f + " : c = " + c);
        c = (char) d;
        System.out.println("char = double: c = (char) " + d + " : c = " + c);

    }
    public static void BooleanTest(){
        boolean a = true;
        boolean b = false;
        boolean c;

        System.out.println("Bitwise operation with boolean type:");
        //bitwise and
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        //bitwise or
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        //bitwise xor
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println("Assignment operation with boolean type:");

        System.out.println(c + " &= " + a + " : c = " + (c &= a));
        System.out.println(c + " ^= " + a + " : c = " + (c ^= a));
        System.out.println(c + " |= " + a + " : c = " + (c |= a));

        System.out.println("Relational Operation with boolean type:");

        //equal to
        System.out.println(a + " == " + b + " : " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " : " + (a != b));

        System.out.println("Logical Operations with boolean type:");

        //logical and
        c = a && b;
        System.out.println(a + " && " + a + " = " + c);
        //logical or
        c = a || b;
        System.out.println(a + " || " + a + " = " + c);
        //logical xor
        c = a && b;
        System.out.println(a + " ^ " + a + " = " + c);
        //logical not
        System.out.println("!" + a + " : " + !a);

    }

}



