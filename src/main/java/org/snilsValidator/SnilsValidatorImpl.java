package org.snilsValidator;

public class SnilsValidatorImpl implements SnilsValidator {
    @Override
    public boolean validate(String snils) {
        char[] snils_number = snils.toCharArray();
        int sum_numbers = 0;
        int control = 0;
        for (int i = 0; i < 9; i++) {
            sum_numbers += (Character.getNumericValue(snils_number[i]) * (9 - i));
        }
        System.out.println(sum_numbers);

        if (sum_numbers < 100) {
            control = sum_numbers;
        } else if (sum_numbers == 0) {
            control = 0;
        } else {
            int mod_sum = sum_numbers % 101;
            if (mod_sum == 100) {
                control = 0;
            } else {
                control = mod_sum;
            }
        }

        int contol_snils = Integer.valueOf(snils.substring(9));
        if (contol_snils == control) {
            return true;
        } else {
            return false;
        }
    }
}
