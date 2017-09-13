package com.sofia.laskin2;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Sofia on 13.9.2017.
 */

public class Utils {
    // Indicates whether user has pressed "="
    boolean calculated;
    // Holds the last number user has entered
    String curNum = "";
    // Holds the main class
    MainActivity activity;

    public Utils(MainActivity activity) {
        this.activity = activity;
    }

    // Responds to clicking any number
    public void numberClicked(String buttonTxt) {
        String lastChar = "";

        reset();
        if (activity.getCalculationText().length() > 0)
            lastChar = String.valueOf(activity.getCalculationText().charAt(activity.getCalculationText().length() - 1));
        if (!lastChar.equals("/") || !buttonTxt.equals("0")) {
            curNum += buttonTxt;
            activity.setCalculationText(buttonTxt, true);
            calculate(activity.getCalculationText());
        } else {
            activity.createToast("Can't divide by 0");
        }
    }

    // Responds to clicking comma
    public void commaClicked(String buttonTxt) {
        String lastChar;

        if (activity.getCalculationText().length() > 0) {
            lastChar = String.valueOf(activity.getCalculationText().charAt(activity.getCalculationText().length() - 1));
            if (!curNum.contains(",") && lastChar.matches("[0-9]")) {
                curNum += buttonTxt;
                activity.setCalculationText(buttonTxt, true);
            }
        }
    }

    // Responds to clicking +-/x=
    public void calculationClicked(String buttonTxt) {
        String lastChar;

        if (activity.getCalculationText().length() > 0) {
            lastChar = String.valueOf(activity.getCalculationText().charAt(activity.getCalculationText().length() - 1));
            if (lastChar.matches("[0-9,]")) {
                curNum = "";
                activity.setCalculationText(buttonTxt, true);
                calculate(activity.getCalculationText());
            } else {
                String newTxt = activity.getCalculationText().substring(0, activity.getCalculationText().length() - 1) + buttonTxt;
                activity.setCalculationText(newTxt, false);
            }
        }
    }

    // Responds to clicking C-button
    public void cClicked() {
        String lastChar;

        reset();
        if (activity.getCalculationText().length() > 0) {
            lastChar = String.valueOf(activity.getCalculationText().charAt(activity.getCalculationText().length() - 1));
            if (lastChar.matches("[0-9,]") && curNum.length()>0) curNum = curNum.substring(0, curNum.length() - 1);
            if (activity.getCalculationText().length()>0)
                activity.setCalculationText(activity.getCalculationText().substring(0, activity.getCalculationText().length() - 1), false);
            if (activity.getCalculationText().length()>0)
                calculate(activity.getCalculationText());
            else activity.setResultText("");
        }
    }

    // Resets the view if needed
    void reset() {
        if (calculated) {
            calculated = false;
            activity.setCalculationText("", false);
        } else calculated = false;
    }

    // Calculates the actual calculation
    private void calculate(String calculate) {
        String lastChar = String.valueOf(calculate.charAt(calculate.length() - 1));
        NumberFormat nf = new DecimalFormat("##.###################");

        calculate = calculate.replace(',', '.');
        calculate = calculate.replace('x', '*');
        calculate = calculate.replace("=", "");

        if (lastChar.matches("[0-9,=]")) {
            Expression e = new ExpressionBuilder(calculate).build();
            double resolved = e.evaluate();
            activity.setResultText(String.valueOf(nf.format(resolved)));

            if (lastChar.equals("=")) {
                activity.setResultText("");
                activity.setCalculationText(String.valueOf(nf.format(resolved)), false);
                calculated = true;
            }
        }
    }
}
