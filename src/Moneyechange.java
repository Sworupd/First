import java.util.Scanner;
public class Moneyechange {
    public static void main(String[] args) {
        int ruppes, change, n;
        Scanner ret = new Scanner(System.in);
        System.out.println("Enter the total amount");
        ruppes = ret.nextInt();
        System.out.println("Enter the change amount");
        change = ret.nextInt();
        if(change >= 1000);
        n = change/1000;
        System.out.println("Amount of 1000 is:" +n);
        change= change- n*1000;

        if(change >= 500);
        n = change/500;
        System.out.println("Amount of 500 is:" +n);
        change = change-n*500;

        if(change >= 100);
        n = change/100;
        System.out.println("Amount of 100 is:" +n);
        change = change-n*100;

        if(change >= 50);
        n = change/50;
        System.out.println("Amount of 50 is:"+n);
        change = change-n*50;

        if(change >= 20);
        n= change/20;
        System.out.println("Amount of 20 is:"+n);
        change = change-n*20;

        if(change >= 10);
        n = change/10;
        System.out.println("Amount of 10 is:"+n);
        change = change-n*10;

        if(change >= 5);
        n = change/10;
        System.out.println("Amount of 5 is:"+n);
        change = change-n*5;

        if(change >=1);
        n= change/1;
        System.out.println("Amount of 1 is:"+n);


        int retu, a;
        Scanner cha = new Scanner(System.in);
        System.out.println("Enter the amount to be changed");
        retu = cha.nextInt();

        if(retu >= 1000);
        a = retu/1000;
        System.out.println("1000s are: "+a);
        retu = retu - a*1000;

        if(retu >= 500);
        a = retu/500;
        System.out.println("500s are: "+a);
        retu = retu - a*500;

        if(retu >= 100);
        a = retu/100;
        System.out.println("100s are: "+a);
        retu = retu-a*100;

        if(retu >= 50);
        a= retu/50;
        System.out.println("50s are: "+a);
        retu = retu-a*50;

        if(retu >= 20);
        a = retu/20;
        System.out.println("20s are: "+a);
        retu = retu-a*20;

        if(retu >= 10);
        a = retu/10;
        System.out.println("10s are: "+a);



        int offer, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount to be changed");
        offer = sc.nextInt();

        if(offer>=1000);
        b = offer/1000;
        System.out.println("1000s are: " +b);
        offer = offer-b*1000;

        if(offer >= 500);
        b = offer/500;
        System.out.println("500s are: "+b);
        offer = offer-b*500;

        if(offer >= 100);
        b = offer/100;
        System.out.println("100s are: "+b);
        offer = offer-b*100;

        if(offer >= 50);
        b = offer/50;
        System.out.println("50s are: "+b);
        offer = offer-b*50;

        if(offer >= 20);
        b = offer/20;
        System.out.println("20s are: "+b);
        offer = offer-b*20;

        if(offer >= 10);
        b = offer/10;
        System.out.println("10s are:" +b);

        int exchange, c;
        Scanner ab = new Scanner(System.in);
        System.out.println("Exchange to be given");
        exchange = ab.nextInt();

        if(exchange >= 1000);
        c = exchange/1000;
        System.out.println("1000s are: "+c);
        exchange = exchange-c*1000;

        if(exchange >= 500);
        c = exchange/500;
        System.out.println("500s are: "+c);
        exchange = exchange-c*500;

        if(exchange >= 100);
        c= exchange/100;
        System.out.println("100s are: "+c);
        exchange = exchange-c*50;

        if(exchange >= 50);
        c = exchange/50;
        System.out.println("50s are: "+c);
        exchange = exchange-c*50;

        if(exchange >= 20);
        c= exchange/20;
        System.out.println("20s are: "+c);
        exchange = exchange-c*20;

        if(exchange >= 10);
        c = exchange/10;
        System.out.println("10s are: "+c);


        int chang , dc;
        Scanner off = new Scanner(System.in);
        System.out.println("Amount to be changed");
        chang = off.nextInt();

        if(chang>=1000);
        dc = chang/1000;
        System.out.println("1000s are: "+dc);
        chang = chang-dc*1000;

        if(chang >= 500);
        dc = chang/500;
        System.out.println("500s are: "+dc);
        chang = chang-dc*500;

        if(chang >= 100);
        dc= chang/100;
        System.out.println("100s are: "+dc);
        chang = chang-dc*100;

        if(chang >= 50);
        dc = chang/50;
        System.out.println("50s are: "+dc);
        chang = chang-dc*50;

        if(chang >= 20);
        dc = chang/20;
        System.out.println("20s are: "+dc);
        chang = chang-dc*20;

        if(chang >= 10);
        dc = chang/10;
        System.out.println("10s are: "+dc);
    }
}
