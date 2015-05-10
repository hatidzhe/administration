import java.util.*;

public class DateCounter {

    static long diffInDays( Calendar first, Calendar second ) {
        long days = 0;
        return 0;
    }

    static long diffFromToday( Calendar cal ) {
        long days = 0;
        return 0;
    }

    public static void main( String[] args ) {
        Calendar Anfangsdatum = Calendar.getInstance();
        Calendar Enddatum = Calendar.getInstance();
        Anfangsdatum.set( 2015, 04, 21 );
        Enddatum.set( 2015, 05, 10 );
        long Tage = Anfangsdatum.getTimeInMillis();
        long Tage2 = Enddatum.getTimeInMillis();
        long diff = Tage2 - Tage;
        long diffTage = diff / ( 24 * 60 * 60 * 1000 );
        System.out.println( "Der Tagesunterschied beträgt " + diffTage + " Tage" );
    }
}


