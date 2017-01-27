package utilities;

import lombok.val;

public class Mod11 {

    private final static String VALIDCHARS = "0123456789";

    public static int calc(final String _idWithoutCheckdigit) {

// remove leading or trailing whitespace, convert to uppercase
        val idWithoutCheckdigit = _idWithoutCheckdigit.trim();

// this will be a running total
        int sum = 0;

// loop through digits from right to left
        for (int i = 0; i < idWithoutCheckdigit.length(); i++) {

//set ch to "current" character to be processed
            val ch = idWithoutCheckdigit
                    .charAt(idWithoutCheckdigit.length() - i - 1);

// throw exception for invalid characters
            if (VALIDCHARS.indexOf(ch) == -1) {
                throw new IllegalArgumentException("\"" + ch + "\" is an invalid character");
            }

// our "digit" is calculated using ASCII value - 48
            val digit = (int) ch - 48;

// weight will be the current digit's contribution to
// the running total
            final int weight;
            if (i % 2 == 0) {

                // for alternating digits starting with the rightmost, we
                // use our formula this is the same as multiplying x 2 and
                // adding digits together for values 0 to 9.  Using the
                // following formula allows us to gracefully calculate a
                // weight for non-numeric "digits" as well (from their
                // ASCII value - 48).
                weight = (2 * digit) - (digit / 5) * 9;

            } else {

                // even-positioned digits just contribute their ascii
                // value minus 48
                weight = digit;

            }
            // keep a running total of weights
            sum += weight;

        }

// avoid sum less than 10 (if characters below "0" allowed,
// this could happen)
        sum = Math.abs(sum) + 10;

// check digit is amount needed to reach next number
// divisible by ten
        return (10 - (sum % 10)) % 10;
    }
}
