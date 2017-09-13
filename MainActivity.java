package com.sofia.laskin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView calculation;
    TextView result;
    Utils utils;
    HorizontalScrollView scroll1;
    HorizontalScrollView scroll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        utils = new Utils(this);
        calculation = (TextView) findViewById(R.id.mid);
        result = (TextView) findViewById(R.id.con);
        calculation.setMovementMethod(new ScrollingMovementMethod());
        scroll1 = (HorizontalScrollView) findViewById(R.id.scroll1);
        scroll2 = (HorizontalScrollView) findViewById(R.id.scroll2);
    }

    public void numberClicked(View view) {
        Button b = (Button) findViewById(view.getId());
        String buttonTxt = b.getText().toString();
        utils.numberClicked(buttonTxt);
    }

    public void commaClicked(View view) {
        Button b = (Button) findViewById(view.getId());
        String buttonTxt = b.getText().toString();
        utils.commaClicked(buttonTxt);
    }

    public void calculationClicked(View view) {
        Button b = (Button) findViewById(view.getId());
        String buttonTxt = b.getText().toString();
        utils.CalculationClicked(buttonTxt);
    }

    public void cClicked(View view) { utils.cClicked();}

    public void createToast(String message) { Toast.makeText(this, message, Toast.LENGTH_SHORT).show(); }

    public String getCalculationText() { return calculation.getText().toString(); }

    public void setResultText(String resultText) {
        result.setText(resultText);
        scroll2.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
    }

    public void setCalculationText(String calculation, boolean append) {
        if (append) this.calculation.append(calculation);
        else this.calculation.setText(calculation);
        scroll1.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
    }
}
