package com.example.scoring;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText[] count_1 = new EditText[10];
    EditText[] count_2 = new EditText[10];
    Button but_1;

    int sum_1, sum_2;
    int[] int_count_1 = new int[10];
    int[] int_count_2 = new int[10];

    String debug = "MyLog";

    TextView out_1, out_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_1 = (Button)findViewById(R.id.but_1);
        Log.v(debug,"Start APP");

        out_1 = (TextView)findViewById(R.id.res_1);
        out_2 = (TextView)findViewById(R.id.res_2);

//Инициализация массива с количесвтом карточек
        count_1[0] = (EditText)findViewById(R.id.home_1);
        count_1[1] = (EditText)findViewById(R.id.bal_1);
        count_1[2] = (EditText)findViewById(R.id.hotdog_1);
        count_1[3] = (EditText)findViewById(R.id.car_1);
        count_1[4] = (EditText)findViewById(R.id.lamp_1);
        count_1[5] = (EditText)findViewById(R.id.phone_1);
        count_1[6] = (EditText)findViewById(R.id.post_1);
        count_1[7] = (EditText)findViewById(R.id.fh_1);
        count_1[8] = (EditText)findViewById(R.id.box_1);
        count_1[9] = (EditText)findViewById(R.id.trash_1);

        count_2[0] = (EditText)findViewById(R.id.home_2);
        count_2[1] = (EditText)findViewById(R.id.bal_2);
        count_2[2] = (EditText)findViewById(R.id.hotdog_2);
        count_2[3] = (EditText)findViewById(R.id.car_2);
        count_2[4] = (EditText)findViewById(R.id.lamp_2);
        count_2[5] = (EditText)findViewById(R.id.phone_2);
        count_2[6] = (EditText)findViewById(R.id.post_2);
        count_2[7] = (EditText)findViewById(R.id.fh_2);
        count_2[8] = (EditText)findViewById(R.id.box_2);
        count_2[9] = (EditText)findViewById(R.id.trash_2);

    }



    @Override
    public void onClick(View view){

//        if (view.getId()==R.id.but_1){
//          Integer i = Integer.valueOf(ip_1.getText().toString());
//          String size = new StringBuilder().append(cities.size).toString();
//            int a = Integer.valueOf(count_1[0].getText().toString());
//            int b = Integer.valueOf(count_1[1].getText().toString());
//            sum_1 = a+b;
            sum_1 = 0;
            for (int i=0;i<10;i++)
            {
//                Log.v(debug, count_1[i].getText().toString());
                switch (Integer.valueOf(count_1[i].getText().toString())) {
                    case (0):
                        sum_1 += 0;
                        break;
                    case (1):
                        sum_1 += 3;
                        break;
                    case (2):
                        sum_1 += 5;
                        break;
                    case (3):
                        sum_1 += 6;
                        break;
                    case (4):
                        sum_1 += 7;
                        break;
                    case (5):
                        sum_1 += 8;
                        break;
                    case (6):
                        sum_1 += 9;
                        break;
                }

            }

        sum_2 = 0;
        for (int i=0;i<10;i++)
        {
//                Log.v(debug, count_1[i].getText().toString());
            switch (Integer.valueOf(count_2[i].getText().toString())) {
                case (0):
                    sum_2 += 0;
                    break;
                case (1):
                    sum_2 += 3;
                    break;
                case (2):
                    sum_2 += 5;
                    break;
                case (3):
                    sum_2 += 6;
                    break;
                case (4):
                    sum_2 += 7;
                    break;
                case (5):
                    sum_2 += 8;
                    break;
                case (6):
                    sum_2 += 9;
                    break;
            }

        }

            if (sum_1 > sum_2) {
                out_1.setTextColor(Color.parseColor("#3ca322"));
                out_2.setTextColor(Color.parseColor("#cf2e2b"));
            }
            if (sum_1 < sum_2) {
                out_2.setTextColor(Color.parseColor("#3ca322"));
                out_1.setTextColor(Color.parseColor("#cf2e2b"));
            }
            if (sum_1 == sum_2) {
                out_2.setTextColor(Color.parseColor("#2f47c2"));
                out_1.setTextColor(Color.parseColor("#2f47c2"));
            }

            out_1.setText(valueOf(sum_1));
            out_2.setText(valueOf(sum_2));
            String res = new StringBuilder().append(sum_1).toString();
            Log.v(debug, count_1[0].getText().toString());
            Log.v(debug, "Кнопка нажата");
            Log.v(debug, res);
//        }

    }


}
