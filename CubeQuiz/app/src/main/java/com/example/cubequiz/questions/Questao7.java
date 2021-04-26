package com.example.cubequiz.questions;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao7 extends AppCompatActivity implements SensorEventListener
{
    private Sensor proximidade;
    private SensorManager medir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao7);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        medir = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        proximidade = medir.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        MainActivity.acertos++;

    }

    @Override
    protected void onResume()
    {
        medir.registerListener(this, proximidade, SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        medir.unregisterListener(this, proximidade);
        super.onPause();
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if(event.values[0] == 0)
        {
            abrirQ8();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture)
    {
    }

    @Override
    public void onBackPressed()
    {
        Toast.makeText(this, "", Toast.LENGTH_LONG).show();
        super.onBackPressed();
    }

    private void abrirQ8()
    {
        Intent janela = new Intent(this, Questao8.class);
        startActivity(janela);
        finish();
    }
}