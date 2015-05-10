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

    // calculate the difference from today in days
    static long diffFromToday( Calendar cal ) {

        Calendar today = Calendar.getInstance();
        long daysDiff  = diffInDays( cal, today );

        return daysDiff;
    }

    public static void main( String[] args ) {
        Calendar Anfangsdatum = Calendar.getInstance();
        Anfangsdatum.set( 2015, 03, 21 ); // 03 is april

        long diffTage = diffFromToday( Anfangsdatum );
        System.out.println( "Der Tagesunterschied beträgt " + diffTage + " Tage" );
    }
}


