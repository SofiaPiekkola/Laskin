import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    Utils utils;
    HorizontalScrollView ho1;
    HorizontalScrollView ho2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        utils = new Utils(this);
        t1 = (TextView) findViewById(R.id.mid);
        t2 = (TextView) findViewById(R.id.con);
        ho1 = (HorizontalScrollView) findViewById(R.id.scroll1);
        ho2 = (HorizontalScrollView) findViewById(R.id.scroll2);
    }

    public void numberClicked(View view) {
        Button b = (Button) findViewById(view.getId());
        utils.numberClicked(b.getText().toString());
    }

    public void commaClicked(View view) {
        Button b = (Button) findViewById(view.getId());
        utils.commaClicked(b.getText().toString());
    }

    public void calculationClicked(View view) {
        Button b = (Button) findViewById(view.getId());
        utils.calculationClicked(b.getText().toString());
    }

    public void cClicked(View view) {
        utils.cClicked();
    }

    public String getCalculationText(){
        return t1.getText().toString();
    }

    public void setResultText(String text){
        t2.setText(text);
        ho2.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
    }

    public void setCalculationText(String s, boolean add){
        if (add)t1.append(s);
        else t1.setText(s);
        ho1.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
    }

    public void createToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
