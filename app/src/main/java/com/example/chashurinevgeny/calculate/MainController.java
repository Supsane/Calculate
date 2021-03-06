package com.example.chashurinevgeny.calculate;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 09.04.2017.
 */

public class MainController {
    public String countResult(String enterTextView, Context context) {
        String[] numberArray;
        String result = "0";
        int number1;
        int number2;
        for (int i = 0; i < enterTextView.length(); i++) {
            if (String.valueOf(enterTextView.charAt(i)).equals(context.getResources().getText(R.string.addButton).toString())) {
                numberArray = enterTextView.split("\\+");
                number1 = Integer.parseInt(numberArray[0]);
                number2 = Integer.parseInt(numberArray[1]);
                result = String.valueOf(number1 + number2);
            } else if (String.valueOf(enterTextView.charAt(i)).equals(context.getResources().getText(R.string.subtractionButton).toString())) {
                numberArray = enterTextView.split(context.getResources().getText(R.string.subtractionButton).toString());
                number1 = Integer.parseInt(numberArray[0]);
                number2 = Integer.parseInt(numberArray[1]);
                result = String.valueOf(number1 - number2);
            } else if (String.valueOf(enterTextView.charAt(i)).equals(context.getResources().getText(R.string.multiplicationButton).toString())) {
                numberArray = enterTextView.split("\\*");
                number1 = Integer.parseInt(numberArray[0]);
                number2 = Integer.parseInt(numberArray[1]);
                result = String.valueOf(number1 * number2);
            } else if (String.valueOf(enterTextView.charAt(i)).equals(context.getResources().getText(R.string.divisionButton).toString())) {
                numberArray = enterTextView.split(context.getResources().getText(R.string.divisionButton).toString());
                number1 = Integer.parseInt(numberArray[0]);
                number2 = Integer.parseInt(numberArray[1]);
                if (number2 == 0) {
                    result = context.getResources().getString(R.string.stopNull);
                } else {
                    result = String.valueOf(number1 / number2);
                }
            }
        }
        return result;
    }

    public void checkEnterTextView(Context context, TextView enterTextView, TextView resultTextView, View view) {
        String strEnterTextView = enterTextView.getText().toString();
        for (int i = 0; i < strEnterTextView.length(); i++) {
            if (String.valueOf(strEnterTextView.charAt(i)).equals("+")) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView, context));
                }
            } else if (String.valueOf(strEnterTextView.charAt(i)).equals("-")) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView, context));
                }
            } else if (String.valueOf(strEnterTextView.charAt(i)).equals("*")) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView, context));
                }
            } else if (String.valueOf(strEnterTextView.charAt(i)).equals("/")) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView, context));
                }
            }
        }
    }
}
