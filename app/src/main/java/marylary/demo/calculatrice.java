package marylary.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculatrice extends AppCompatActivity {

 String op = "+";
 String oldNumber = "";

boolean isNewOp = true;

    private EditText RESULT;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        RESULT = (EditText) findViewById(R.id.editTextRESULT);
    }



    public void buttonEvent(View view) {


    if (isNewOp)

        RESULT.setText("");
         isNewOp = false;
        String number = RESULT.getText().toString();
        switch(view.getId()){
            case R.id.button7:
                number += "7";
                break;

            case R.id.button8:
                number += "8";
                break;



            case R.id.button9:
                number += "9";
                break;


            case R.id.button4:
                number += "4";
                break;



            case R.id.button5:
                number += "5";
                break;



            case R.id.button6:
                number += "6";
                break;


            case R.id.button1:
                number += "1";
                break;


            case R.id.button2:
                number += "2";
                break;


            case R.id.button3:
                number += "3";
                break;


            case R.id.button0:
                number += "0";
                break;

            case R.id.buttonMOINSPLUS:
                number = "-"+number;
                break;


            case R.id.buttonVIRGULE:
                number = ".";
                break;
        }

        RESULT.setText(number);
    }

    public void opperationEvent(View view) {

            isNewOp = true;
            oldNumber = RESULT.getText().toString();
            switch (view.getId()){
                case R.id.buttonDIVISION: op = "/"; break;
                case R.id.buttonMULTIPLE: op = "*"; break;
                case R.id.buttonMOINS: op = "-"; break;
                case R.id.buttonPLUS: op = "+"; break;


            }
    }

    public void equalsEvent(View view) {
        String newNumber = RESULT.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;

            case "-":
                result = Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;

            case "*":
                result = Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;

            case "/":
                result = Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }

        RESULT.setText(result + "");
    }

    public void acEvent(View view) {
        RESULT.setText("0");
        isNewOp = true;
    }

    public void percentEvent(View view) {
        double no = Double.parseDouble(RESULT.getText().toString())/100;
        RESULT.setText(no+"");
        isNewOp = true;
    }
}