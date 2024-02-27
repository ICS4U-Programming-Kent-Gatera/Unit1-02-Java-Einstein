import java.lang.Math;
import java.util.Scanner;

/**
 * My program calculates how much energy is in an object.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-Feb-27
 */

public final class Einstein {
    /**
    * Pleases the style checker.
    *
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Calculates how much energy is in an object.
     *
     * @param args args
     */
    public static void main(String[] args) {
        // Initializing input object and speed of light.
        final Scanner in = new Scanner(System.in);
        final Long speedOfLight = (long) 299792458;
        try {
            // User input prompt.
            System.out.print("What is the mass of your object?(kg): ");
            final int massAsInt = in.nextInt();
            // If mass is > 0, then do the calculations.
            if (massAsInt > 0) {
                final double energyJoules = massAsInt
                    * Math.pow(speedOfLight, 2);
                // Answer message.
                System.out.printf(
                    "The object contains " + energyJoules + " J\n");
                // In case the mass is negative and invalid.
            } else {
                System.out.print("Mass must be> 0.");
            }
            // Error case message instruction.
        } catch (Exception e) {
            System.out.print("Enter a valid mass int > 0.");
        }
        // Closing this object since we no need it anymore.
        in.close();
    }
}
