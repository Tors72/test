public class printf {
    static void start(){
        //printf() #[flag][precision][width][conv-type]
        //System.out.printf("Hello %d World",123); -gives Hello 123 World
        boolean a=true; //%b
        char b='a'; //%c
        int c=15; //%d
        double d=60000.50; //%f
        String e="hello";
        System.out.printf("You have this much money: %+,.2f",d); // .= no of decimal places,  , = comma after every 3 0's. + = positive no.
        u.ps("\n");
        System.out.printf("%-10s",e);
    }
}
