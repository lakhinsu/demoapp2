package com.example.android.demoapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button toastButton;
    Button countButton;
    Button randomButton;
    TextView resultView;


    int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton = (Button) findViewById(R.id.countButton);
        randomButton=(Button)findViewById(R.id.randomButton);
        resultView=(TextView) findViewById(R.id.resultView);
        resultView.setText(""+count);
        countButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                count++;
                resultView.setText(""+count);
            }
        });
        randomButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
               Random random=new Random(count);
               int num=random.nextInt(count);
               Toast.makeText(getApplicationContext(),num + " ",Toast.LENGTH_LONG).show();
              // Toast.makeText(getApplicationContext(),num,Toast.LENGTH_LONG).show();
               //resultView = (TextView) findViewById(R.id.resultView);
               //resultView.setText(""+num);
                //Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                //intent.putExtra("n",count);
                //startActivity(intent);
            }
        });
    }
    public void popToast(View view)
    {
        toastButton = (Button) findViewById(R.id.toastButton);
        resultView = (TextView) findViewById(R.id.resultView);
        Random rand=new Random(count);
        int n=rand.nextInt(count);
        Toast.makeText(this,n + "random number",Toast.LENGTH_SHORT).show();
    }
}
