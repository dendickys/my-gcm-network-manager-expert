package com.dendickys.mygcmnetworkmanagerexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSetSchedule, btnCancelSchedule;
    private SchedulerTask mSchedulerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSetSchedule = findViewById(R.id.btn_set_scheduler);
        btnCancelSchedule = findViewById(R.id.btn_cancel_scheduler);
        btnSetSchedule.setOnClickListener(this);
        btnCancelSchedule.setOnClickListener(this);

        mSchedulerTask = new SchedulerTask(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_set_scheduler) {
            mSchedulerTask.createPeriodicTask();
            Toast.makeText(this, "Periodic Task Created", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.btn_cancel_scheduler) {
            mSchedulerTask.cancelPeriodicTask();
            Toast.makeText(this, "Periodic Task Cancelled", Toast.LENGTH_SHORT).show();
        }
    }
}
