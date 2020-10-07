import java.util.*;
/**
 * Write a description of class TitleLastAndMagnitudeComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry>
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TitleLastAndMagnitudeComparator
     */
    public TitleLastAndMagnitudeComparator()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String q1LastWord = q1.getInfo().substring(q1.getInfo().lastIndexOf(" ")+1);
        String q2LastWord = q2.getInfo().substring(q2.getInfo().lastIndexOf(" ")+1);
        if (q1LastWord.compareTo(q2LastWord) > 0) {
            return 1;
        }
        else if (q1LastWord.compareTo(q2LastWord) < 0) {
            return -1;
        }
        else {
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
    }
}
