package entities;

public class Bill {

    public static double COVER = 4.00;

    public static char gender;
    public static int beer;
    public static int barbecue;
    public static int softDrink;

    public static double cover(){
        if (feeding() > 30.00){
            return 0;
        } else {
            return COVER;
        }
    }

    public static double feeding(){
        return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
    }

    public static double ticket(){
        if (gender == 'M' || gender == 'm') {
            return 10.00;
        } else if (gender == 'F' || gender == 'f'){
            return 8.00;
        }
        return 0;
    }

    public static double total(){
        return feeding() + ticket() + cover();
    }
}