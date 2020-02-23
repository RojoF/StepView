package com.example.stepview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.shuhart.stepview.StepView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtContenido;
    ImageView imgHospi;
    int contadorB = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtContenido = (TextView) findViewById(R.id.txtIndicacion);
        imgHospi = (ImageView) findViewById(R.id.imageView);
        final StepView stepView = (StepView) findViewById(R.id.step_view);
        stepView.getState()
                .steps(new ArrayList<String>() {{
                 for (int i = 1; i<=contadorB; i++) {
                     add("Paso" + i);
                 }
                }})
                .stepsNumber(contadorB)
                .commit();

        stepView.setOnStepClickListener(new StepView.OnStepClickListener() {
            @Override
            public void onStepClick(int step) {
                Toast.makeText(MainActivity.this, "Step " + step, Toast.LENGTH_LONG).show();


                if (step == 0) {

                    stepView.go(step, true);
                    stepView.getState()
                            .selectedCircleColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                            .commit();
                    txtContenido.setText(getString(R.string.ruta_uno));
                    imgHospi.setImageResource(R.drawable.pasillo_uno);
                }

                if (step == 1) {

                    stepView.go(step, true);
                    stepView.getState()
                            .selectedCircleColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                            .commit();
                    txtContenido.setText(getString(R.string.ruta_dos));
                    imgHospi.setImageResource(R.drawable.pasillo_dos);
                }

                if (step == 2) {

                    stepView.go(step, true);
                    stepView.getState()
                            .selectedCircleColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                            .commit();
                    txtContenido.setText(getString(R.string.ruta_tres));
                    imgHospi.setImageResource(R.drawable.pasillo_tres);
                }
                if (step == 2) {

                    stepView.go(step, true);
                    stepView.getState()
                            .selectedCircleColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                            .commit();
                    txtContenido.setText(getString(R.string.ruta_tres));
                    imgHospi.setImageResource(R.drawable.pasillo_tres);
                }
                if (step == 3) {

                    stepView.go(step, true);
                    stepView.getState()
                            .selectedCircleColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary))
                            .commit();
                    txtContenido.setText(getString(R.string.ruta_cuatro));
                    imgHospi.setImageResource(R.drawable.pasillo_cuatro);
                }

            }


        });


    }
}
