import java.util.*;

public class DateCounter {

    // calculate the difference of two dates in days
    static long diffInDays( Calendar first, Calendar second ) {

        long msFirst  = first.getTimeInMillis();
        long msSecond = second.getTimeInMillis();
        long msDiff   = msFirst - msSecond;
        long daysDiff = msDiff / ( 24 * 60 * 60 * 1000 );
        daysDiff = Math.abs( daysDiff ); // we want always a positive difference

        return daysDiff;
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

        long diffTage = diffInDays( Anfangsdatum, Enddatum );
        System.out.println( "Der Tagesunterschied beträgt " + diffTage + " Tage" );
    }
}


