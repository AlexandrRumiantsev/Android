package com.example.calkkg;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText name;
    private EditText rost;
    private TextView mResult;
    private Button manBtn;
    private Button womanBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name );
        rost=(EditText)findViewById(R.id.rost );
        mResult=(TextView)findViewById(R.id.result);
        manBtn=(Button)findViewById(R.id.man );
        womanBtn=(Button)findViewById(R.id.woman );

        manBtn.setOnClickListener(this);
        womanBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        int dopForMen = 100;
        int dopForWoman = 110;
        double result = 0;
        String pre = "";

        name = (EditText)findViewById( R.id.name );
        Editable nameRezult = name.getText();
        float rostUpp = Float.parseFloat(rost.getText().toString());
      switch (v.getId()) {
            case R.id.man:
                result = (rostUpp - dopForMen)* 1.15;
                pre = "Уважаемый ";
                break;
            case R.id.woman:
                result = (rostUpp - dopForWoman)* 1.15;
                pre = "Уважаемая ";
                break;
            default:
                break;
        }
        mResult.setText( pre + nameRezult +  ". Ваш нормальный вес = " + result);
    }

}
