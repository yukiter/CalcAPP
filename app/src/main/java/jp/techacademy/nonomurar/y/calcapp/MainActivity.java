package jp.techacademy.nonomurar.y.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.InputType;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;
    EditText mEditText;

    EditText editText1;
    EditText editText2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView);
        mEditText = (EditText) findViewById(R.id.editText);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);





        double a;
        double b;
        double c;


    }

    @Override
    public void onClick(View v) {
        if ( editText1.getText().toString().length() <= 0 )
        {
            return;
        }
        if( editText2.getText().toString().length() <= 0 )
        {
            return;
        }

        if (v.getId() == R.id.button1) {
          //  editText1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
            //editText2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);


            double a = Double.parseDouble( editText1.getText().toString() );
            double b = Double.parseDouble( editText2.getText().toString() );
            double c = a + b;
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE1",c);
            startActivity(intent);

        } else if (v.getId() == R.id.button2) {

            double a = Double.parseDouble( editText1.getText().toString() );
            double b = Double.parseDouble( editText2.getText().toString() );
            double c = a - b;
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE1",c);
            startActivity(intent);

        } else if (v.getId() == R.id.button3) {

            double a = Double.parseDouble( editText1.getText().toString() );
            double b = Double.parseDouble( editText2.getText().toString() );
            double c = a * b;
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE1",c);
            startActivity(intent);

        } else if (v.getId() == R.id.button4) {

            double a = Double.parseDouble( editText1.getText().toString() );
            double b = Double.parseDouble( editText2.getText().toString() );
            double c = a / b;
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("VALUE1",c);
            startActivity(intent);
        }

}


    }

