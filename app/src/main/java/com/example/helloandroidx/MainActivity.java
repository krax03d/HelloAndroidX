package com.example.helloandroidx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import java.util.Date;
public class MainActivity extends AppCompatActivity implements View.0nClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.button);//Obtenemos el control del boton como un objeto, nos conectamos a xml y sacamos el boton para sacarlo como objeto


        private void updateTime(){
            button.setText(new Date().toString());
        }
        public void onClick(View view){
            updateTime();
        }
    }
}
