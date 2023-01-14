package org.techtown.kellog_homekalender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    CalendarView calenderView;
    TextView chosendate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calenderView=findViewById(R.id.calendarView);
        chosendate=findViewById(R.id.chosendate);


        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDaychange(@NonNull CalendarView calendarView, int year, int monte, int day);
        });
        /*
        calendarView = findViewById(R.id.calendarview);

        // 첫 시작 요일이 월요일이 되도록 설정
        calendarView.state()
                .edit()
                .setFirstDayOfWeek(DayOfWeek.of(Calendar.MONDAY))
                .commit(); */
    }
}

