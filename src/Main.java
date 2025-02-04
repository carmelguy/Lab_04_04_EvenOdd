public class Main
{
    public static void main(String[] args)
    {
        int numToExamine = 2;
        int remainder = numToExamine % 2;

        System.out.println("Number to examine: " + numToExamine);
        System.out.println("Remainder when divided by 2: " + remainder);
        System.out.println("The number " + numToExamine + " is " + (remainder == 0 ? "even" : "odd"));

    }

}