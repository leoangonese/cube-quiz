package com.example.cubequiz.questions;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao4 extends AppCompatActivity implements SensorEventListener
{
    private SensorManager sensorManager;
    private WebView fogo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4);
        //remover actionbar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //mapeamento
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        fogo = findViewById(R.id.fogo);

        MainActivity.acertos++;

        //carregar gif/*

        WebSettings gif = fogo.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/fogo.gif";
        fogo.loadUrl(caminho);

    }

    //Sensor de movimentação
    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
        {
            getAccelerometter(event);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private void getAccelerometter(SensorEvent event)
    {
        float[] values = event.values;

        float x = values[0];
        float y = values[1];
        float z = values[2];

        float  accelationSquareRoot = (x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);

        Toast.makeText(getApplicationContext(),String.valueOf(accelationSquareRoot) + "" + SensorManager.GRAVITY_EARTH, Toast.LENGTH_SHORT).show();
        if(accelationSquareRoot >= 2)
        {
            abrirQ5();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    private void abrirQ5()
    {
        Intent janela = new Intent(this, Questao5.class);
        startActivity(janela);
        finish();
    }


}