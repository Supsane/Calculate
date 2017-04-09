package com.example.chashurinevgeny.calculate;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 09.04.2017.
 */

public class MainController {
    public String countResult(String enterTextView) {
        String result = "check";
        return result;
    }

    public void checkEnterTextView(Context context, TextView enterTextView, TextView resultTextView, View view) {
        String strEnterTextView = enterTextView.getText().toString();
        for (int i = 0; i < strEnterTextView.length(); i++) {
            if (String.valueOf(strEnterTextView.charAt(i)).equals(context.getResources().getText(R.string.addButton).toString())) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView));
                }
            } else if (String.valueOf(strEnterTextView.charAt(i)).equals(context.getResources().getText(R.string.subtractionButton).toString())) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView));
                }
            } else if (String.valueOf(strEnterTextView.charAt(i)).equals(context.getResources().getText(R.string.multiplicationButton).toString())) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView));
                }
            } else if (String.valueOf(strEnterTextView.charAt(i)).equals(context.getResources().getText(R.string.divisionButton).toString())) {
                if (i != strEnterTextView.length() - 1) {
                    resultTextView.setText(countResult(strEnterTextView));
                }
            }
        }
    }
}
