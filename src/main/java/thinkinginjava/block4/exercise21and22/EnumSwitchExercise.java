package thinkinginjava.block4.exercise21and22;

import thinkinginjava.Exercise;
import thinkinginjava.ScannerUtils;
import thinkinginjava.TextUtils;

import static net.mindview.util.Print.print;

public class EnumSwitchExercise extends Exercise {
    @Override
    public String getId() {
        return "22";
    }

    @Override
    public String getName() {
        return "Switching with enums";
    }

    @Override
    public String getDescription() {
        return "Write a switch statement for the enum in the previous example. " +
                "For each case, output a description of that particular currency.  ";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }

    private boolean isCurrencyExists(String currency) {
        if (!TextUtils.isEmpty(currency)) {
            for (PaperCurrency paperCurrency : PaperCurrency.values()) {
                if (paperCurrency.name().equalsIgnoreCase(currency)) {
                    return true;
                }
            }
        }

        return false;
    }

    private String formatCurrencyName(String currency) {
        if (currency != null) {
            return currency.trim().toUpperCase();
        }
        return null;
    }

    @Override
    protected void run() {
        print("Print a name of enum you want to get a description for (case insensitive). Possible options are:");
        for (PaperCurrency paperCurrency : PaperCurrency.values()) {
            print(paperCurrency);
        }
        String enumName;
        do {
            enumName = formatCurrencyName(ScannerUtils.getStringFromUser());
            if (isCurrencyExists(enumName)) {
                break;
            } else {
                print("Invalid option. Please type one of the options printed above");
            }
        } while (true);

        switch (PaperCurrency.valueOf(enumName)) {
            case FIFTY: {
                print("Fifty roubles");
                break;
            }
            case HUNDRED: {
                print("Hundred roubles");
                break;
            }
            case TWO_HUNDRED: {
                print("Two hundred roubles");
                break;
            }
            case FIVE_HUNDRED: {
                print("Five hundred roubles");
                break;
            }
            case THOUSAND: {
                print("Thousand roubles");
                break;
            }
            case TWO_THOUSAND: {
                print("Two thousand roubles");
                break;
            }
        }
    }
}
