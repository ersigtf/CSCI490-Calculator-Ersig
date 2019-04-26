package com.example.calculator_ersig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button addBtn;
    private Button subtractBtn;
    private Button multiplyBtn;
    private Button divideBtn;
    private Button clearBtn;
    private Button clearEntryBtn;
    private Button decimalBtn;
    private Button equalsBtn;

    private TextView resultView;


    double result;
    double heldNum;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating all them buttons.
        zeroBtn = findViewById(R.id.zeroBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);

        addBtn = findViewById(R.id.addBtn);
        subtractBtn = findViewById(R.id.subtractBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        divideBtn = findViewById(R.id.divideBtn);
        clearBtn = findViewById(R.id.clearBtn);
        clearEntryBtn = findViewById(R.id.clearEntryBtn);
        decimalBtn = findViewById(R.id.decimalBtn);
        equalsBtn = findViewById(R.id.equalsBtn);

        resultView = findViewById(R.id.resultView);

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (!dString.equals("0")){
                    resultView.append(getResources().getString(R.string._0Btn));
                }
            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._1));
                }
                else {
                    resultView.append(getResources().getString(R.string._1));
                }

            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._2));
                }
                else {
                    resultView.append(getResources().getString(R.string._2));
                }
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._3));
                }
                else {
                    resultView.append(getResources().getString(R.string._3));
                }
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._4));
                }
                else {
                    resultView.append(getResources().getString(R.string._4));
                }
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._5));
                }
                else {
                    resultView.append(getResources().getString(R.string._5));
                }
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._6));
                }
                else {
                    resultView.append(getResources().getString(R.string._6));
                }
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._7));
                }
                else {
                    resultView.append(getResources().getString(R.string._7));
                }
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._8));
                }
                else {
                    resultView.append(getResources().getString(R.string._8));
                }
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dString = resultView.getText().toString();
                if (dString.equals("0")){
                    resultView.setText(getResources().getString(R.string._9));
                }
                else {
                    resultView.append(getResources().getString(R.string._9));
                }
            }
        });
        decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(resultView.getText().toString());
                if ((d % 1) == 0){
                    resultView.append(getResources().getString(R.string.decimalBtn));
                }
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(getResources().getString(R.string._0Btn));
            }
        });
        clearEntryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(getResources().getString(R.string._0Btn));
                heldNum = 0;
                operator = null;
                result = 0;
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(heldNum != 0){
                    result = calculate(heldNum);
                    resultView.setText(Double.toString(result));
                    operator = "add";

                }
                else{
                    double d = Double.parseDouble(resultView.getText().toString());
                    heldNum = d;
                    operator = "add";
                    resultView.setText(getResources().getString(R.string._0Btn));

                }

            }
        });
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "subtract";
               result = calculate(heldNum);
               resultView.setText(Double.toString(result));
            }
        });
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "multiply";
                result = calculate(heldNum);
                resultView.setText(Double.toString(result));
            }
        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(heldNum != 0){
                    result = calculate(heldNum);
                    resultView.setText(Double.toString(result));
                    operator = "divide";

                }
                else{
                    double d = Double.parseDouble(resultView.getText().toString());
                    heldNum = d;
                    operator = "divide";
                    resultView.setText(getResources().getString(R.string._0Btn));

                }
            }
        });
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = calculate(heldNum);
                resultView.setText(Double.toString(result));
            }
        });

    }
    public double calculate(double num){
        double d = Double.parseDouble(resultView.getText().toString());
        if (operator.equals("add")){
            num+=d;
        }
        if (operator.equals("subtract")){
            num -= d;
        }
        if (operator.equals("multiply")){
            num *= d;
        }
        if (operator.equals("divide")){
            if (d != 0){
                num /= d;
            }
        }

        return num;
    }

}


