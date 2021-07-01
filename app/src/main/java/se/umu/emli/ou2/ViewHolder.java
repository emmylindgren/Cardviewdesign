package se.umu.emli.ou2;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView day;
    View daycolor;
    ImageButton appointment1Button;
    ImageButton appointment2Button;
    ImageButton appointment3Button;
    ImageButton appointment4Button;
    ImageButton appointment5Button;
    ImageButton appointment6Button;

    TextView appointment1;
    TextView appointment2;
    TextView appointment3;
    TextView appointment4;
    TextView appointment5;
    TextView appointment6;

    ViewHolder(View itemView) {
        super(itemView);
        daycolor = itemView.findViewById(R.id.dayColor);
        day =itemView.findViewById(R.id.day_text);

        appointment1Button = itemView.findViewById(R.id.appointment1Button);
        appointment2Button = itemView.findViewById(R.id.appointment2Button);
        appointment3Button = itemView.findViewById(R.id.appointment3Button);
        appointment4Button = itemView.findViewById(R.id.appointment4Button);
        appointment5Button = itemView.findViewById(R.id.appointment5Button);
        appointment6Button = itemView.findViewById(R.id.appointment6Button);

        appointment1 = itemView.findViewById(R.id.appointment1);
        appointment2 = itemView.findViewById(R.id.appointment2);
        appointment3 = itemView.findViewById(R.id.appointment3);
        appointment4 = itemView.findViewById(R.id.appointment4);
        appointment5 = itemView.findViewById(R.id.appointment5);
        appointment6 = itemView.findViewById(R.id.appointment6);

    }
}