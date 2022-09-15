package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class CurrencyUtils {

    public static DecimalFormat getRupiahFormat() {
        DecimalFormat indonesianCurrency = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rupiahFormat = new DecimalFormatSymbols();

        rupiahFormat.setCurrencySymbol("Rp. ");
        rupiahFormat.setMonetaryDecimalSeparator(',');
        rupiahFormat.setGroupingSeparator('.');

        indonesianCurrency.setDecimalFormatSymbols(rupiahFormat);

        return indonesianCurrency;
    }

}
