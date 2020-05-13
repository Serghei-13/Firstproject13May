import org.testng.annotations.Test;

public class MyClass {
    @Test
    public void test001() {
        //Hello, World
        //Print "Hello, World!" to the console
        System.out.println("Hello, World!");
    }

    @Test
    public void test002() {
        //Create all of the primitives (except long and double) with different values.
        // Concatenate them into a string and print it to the screen so it will print:
        // H3110 w0r1d 2.0 true
        byte b = 0;
        short s = 1;
        int i = 311;
        float f = 2.0f;
        char c = 'r';
        boolean bool = true;
        String output = "H" + i + b + ' ' + "w" + b + c + s + "d" + ' ' + f + ' ' + bool;
        System.out.println(output);
    }

    @Test
    public void test003() {
        //Conditionals
        //Change the variables in the first section, so that each if statement resolves as true.
        String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

    @Test
    public void test004() {
        //Arrays
        //Change the values in numbers so it will not raise an error.
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length-1] = 'y';
        System.out.println("Done!");
        }
    }

}
