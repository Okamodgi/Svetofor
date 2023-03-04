package com.example.svetofor;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout main = (RelativeLayout) findViewById(R.id.main);

        Button RED = (Button) findViewById(R.id.RED);
        Button YELLOW = (Button) findViewById(R.id.Yellow);
        Button GREEn = (Button) findViewById(R.id.GREEN);

        RED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(getResources().getColor(R.color.R));
            }
        });
        YELLOW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(getResources().getColor(R.color.Y));
            }
        });
        GREEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(getResources().getColor(R.color.G));
            }
        });
    }


}