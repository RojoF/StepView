package com.example.stepview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.shuhart.stepview.StepView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StepView stepView = (StepView) findViewById(R.id.step_view);
        stepView.getState()
                .animationType(StepView.ANIMATION_ALL)
                .steps(new ArrayList<String>() {{
            add("Paso 1");
            add("Paso 2");
            add("Paso 3");
            add("Paso 4");
            add("Paso 5");
            add("Paso 6");
            add("Paso 7");
        }})
                .stepsNumber(7)
                .animationDuration(getResources().getInteger(android.R.integer.config_longAnimTime))
                .commit();
        stepView.setOnStepClickListener(new StepView.OnStepClickListener() {
            @Override
            public void onStepClick(int step) {
                Toast.makeText(MainActivity.this, "Step " + step, Toast.LENGTH_LONG).show();
            }
        });



    }
}
