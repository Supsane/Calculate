package com.example.chashurinevgeny.calculate;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView enterTextView = null;
    private TextView resultTextView = null;
    private Button oneButton = null;
    private Button twoButton = null;
    private Button threeButton = null;
    private Button fourButton = null;
    private Button fiveButton = null;
    private Button sixButton = null;
    private Button sevenButton = null;
    private Button eightButton = null;
    private Button nineButton = null;
    private Button zeroButton = null;
    private Button dotButton = null;
    private Button resultButton = null;
    private Button addButton = null;
    private Button subtractionButton = null;
    private Button multiplicationButton = null;
    private Button divisionButton = null;
    private Button resetButton = null;
    MainController controller = new MainController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterTextView = (TextView) findViewById(R.id.enterTextView);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        oneButton = (Button) findViewById(R.id.oneButton);
        twoButton = (Button) findViewById(R.id.twoButton);
        threeButton = (Button) findViewById(R.id.threeButton);
        fourButton = (Button) findViewById(R.id.fourButton);
        fiveButton = (Button) findViewById(R.id.fiveButton);
        sixButton = (Button) findViewById(R.id.sixButton);
        sevenButton = (Button) findViewById(R.id.sevenButton);
        eightButton = (Button) findViewById(R.id.eightButton);
        nineButton = (Button) findViewById(R.id.nineButton);
        zeroButton = (Button) findViewById(R.id.zeroButton);
        dotButton = (Button) findViewById(R.id.dotButton);
        resultButton = (Button) findViewById(R.id.resultButton);
        addButton = (Button) findViewById(R.id.addButton);
        subtractionButton = (Button) findViewById(R.id.subtractionButton);
        multiplicationButton = (Button) findViewById(R.id.multiplicationButton);
        divisionButton = (Button) findViewById(R.id.divisionButton);
        resetButton = (Button) findViewById(R.id.resetButton);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);
        dotButton.setOnClickListener(this);
        resultButton.setOnClickListener(this);
        addButton.setOnClickListener(this);
        subtractionButton.setOnClickListener(this);
        multiplicationButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Context context = getApplicationContext();
        String strEnterTextView = enterTextView.getText().toString();
        switch (view.getId()) {
            case R.id.oneButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.oneButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.oneButton));
                }
                break;
            case R.id.twoButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.twoButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.twoButton));
                }
                break;
            case R.id.threeButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.threeButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.threeButton));
                }
                break;
            case R.id.fourButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.fourButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.fourButton));
                }
                break;
            case R.id.fiveButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.fiveButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.fiveButton));
                }
                break;
            case R.id.sixButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.sixButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.sixButton));
                }
                break;
            case R.id.sevenButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.sevenButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.sevenButton));
                }
                break;
            case R.id.eightButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.eightButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.eightButton));
                }
                break;
            case R.id.nineButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(context.getResources().getString(R.string.nineButton));
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.nineButton));
                }
                break;
            case R.id.zeroButton:
                if (strEnterTextView.equals("0")) {
                    enterTextView.setText(strEnterTextView);
                } else {
                    enterTextView.setText(strEnterTextView + context.getResources().getString(R.string.zeroButton));
                }
                break;
            case R.id.dotButton:
                enterTextView.setText(enterTextView.getText() + context.getResources().getString(R.string.dotButton));
                break;
            case R.id.resultButton:
                resultTextView.setText(controller.countResult());
                break;
            case R.id.addButton:
                controller.checkEnterTextView(context, enterTextView, resultTextView);
                break;
            case R.id.subtractionButton:
                controller.checkEnterTextView(context, enterTextView, resultTextView);
                break;
            case R.id.multiplicationButton:
                controller.checkEnterTextView(context, enterTextView, resultTextView);
                break;
            case R.id.divisionButton:
                controller.checkEnterTextView(context, enterTextView, resultTextView);
                break;
            case R.id.resetButton:
                enterTextView.setText(context.getResources().getString(R.string.enterTextView));
                break;
        }
    }
}
