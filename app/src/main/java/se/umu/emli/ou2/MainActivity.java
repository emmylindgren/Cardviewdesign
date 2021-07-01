package se.umu.emli.ou2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Days> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void fillData(){
        data = new ArrayList<>();

        Days day1 = new Days(getColor(R.color.colorYellowDay),"MÅN 28/6");
        day1.addEvent("13.00 - Lunchmöte",getColor(R.color.colorYellowDay));
        day1.addEvent("14.00 - Möte",getColor(R.color.colorYellowDay));
        day1.addEvent("16.00 - Träning",getColor(R.color.colorGreenDay));
        day1.addEvent("18.00 - Middag",getColor(R.color.colorBlueDay));

        data.add(day1);

        Days day2 = new Days(getColor(R.color.colorYellowDay),"TIS 29/6");
        day2.addEvent("13.00 - Lunchmöte",getColor(R.color.colorYellowDay));
        day2.addEvent("14.00 - Möte",getColor(R.color.colorYellowDay));
        day2.addEvent("16.00 - Träning",getColor(R.color.colorGreenDay));
        day2.addEvent("19.00 - Bio",getColor(R.color.colorBlueDay));

        data.add(day2);

        Days day3 = new Days(getColor(R.color.colorYellowDay),"ONS 30/6");
        day3.addEvent("08.00 - Möte",getColor(R.color.colorYellowDay));
        day3.addEvent("14.00 - Promenad",getColor(R.color.colorGreenDay));

        data.add(day3);

        Days day4 = new Days(getColor(R.color.colorTealDay),"TOR 1/7");
        day4.addEvent("13.00 - Skjutsa Olle",getColor(R.color.colorTealDay));
        day4.addEvent("14.00 - Hämta mat",getColor(R.color.colorTealDay));
        day4.addEvent("16.00 - Träning",getColor(R.color.colorGreenDay));
        day4.addEvent("18.00 - Middag",getColor(R.color.colorBlueDay));

        data.add(day4);

        Days day5 = new Days(getColor(R.color.colorYellowDay),"FRE 2/7");
        day5.addEvent("13.00 - Lunchmöte",getColor(R.color.colorYellowDay));
        day5.addEvent("14.00 - Möte",getColor(R.color.colorYellowDay));
        day5.addEvent("16.00 - Träning",getColor(R.color.colorGreenDay));

        data.add(day5);

        Days day6 = new Days(getColor(R.color.white),"LÖR 3/7");
        data.add(day6);

        Days day7 = new Days(getColor(R.color.colorGreenDay),"SÖN 3/7");
        day7.addEvent("18.00 - Träning",getColor(R.color.colorGreenDay));

        data.add(day7);
    }
}