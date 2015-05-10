import java.util.*;
import java.text.*;

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

    // parse String to Calendar
    static Calendar parseCalendar( String arg ) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat parser = new SimpleDateFormat( "dd.MM.yyyy" );
        try {
            Date date = parser.parse( arg );
            cal.setTime( date );
        } catch( Exception ex ) {
            System.err.println( "Error: invalid argument: " + ex.toString() );
        }
        return cal;
    }

    // returns the first argument as String if available, else exits
    static String firstArgument( String[] args ) {
        if( args.length != 1 ) {
            System.err.println( "Error: Not enough arguments"  );
            System.err.println( "Usage: java DateCounter 21.04.2014"  );
            System.exit( 1 );
        }
        return args[0];
    }

    public static void main( String[] args ) {
        String argument = firstArgument( args );
        Calendar cal = parseCalendar( argument );
        long diffTage = diffFromToday( cal );
        System.out.println( "Der Tagesunterschied beträgt " + diffTage + " Tage" );
    }
}


