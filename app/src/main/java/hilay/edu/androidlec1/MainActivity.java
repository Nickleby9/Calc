package hilay.edu.androidlec1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnZero = (Button) findViewById(R.id.btnZero);
    Button btnOne = (Button) findViewById(R.id.btnOne);
    Button btnTwo = (Button) findViewById(R.id.btnTwo);
    Button btnThree = (Button) findViewById(R.id.btnThree);
    Button btnFour = (Button) findViewById(R.id.btnFour);
    Button btnFive = (Button) findViewById(R.id.btnFive);
    Button btnSix = (Button) findViewById(R.id.btnSix);
    Button btnSeven = (Button) findViewById(R.id.btnSeven);
    Button btnEight = (Button) findViewById(R.id.btnEight);
    Button btnNine = (Button) findViewById(R.id.btnNine);
    Button btnPoint = (Button) findViewById(R.id.btnPoint);
    Button btnEquals = (Button) findViewById(R.id.btnEquals);
    Button btnClear = (Button) findViewById(R.id.btnClear);
    Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
    Button btnDivide = (Button) findViewById(R.id.btnDivide);
    Button btnPlus = (Button) findViewById(R.id.btnPlus);
    Button btnMinus = (Button) findViewById(R.id.btnMinus);
    Button btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
    Button btnPercent = (Button) findViewById(R.id.btnPercent);
    TextView tvResult = (TextView) findViewById(R.id.tvResult);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClear.setOnClickListener(onClick(View arg0) {
            tvResult.setText("You have pressed");
        });


    }

    private class HandleClick implements View.OnClickListener {
        public void onClick(View arg0) {
            tvResult.setText("You have pressed");
        }

    }
}
