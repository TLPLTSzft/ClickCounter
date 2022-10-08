package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.RED;
import static android.graphics.Color.rgb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private RelativeLayout relativeLayout;
  private Button buttonPlus;
  private TextView textViewCounter;
  private Button buttonMinus;
  private int szam = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    relativeLayout = findViewById(R.id.relativeLayout);
    buttonPlus = findViewById(R.id.buttonPlus);
    textViewCounter = findViewById(R.id.textViewCounter);
    buttonMinus = findViewById(R.id.buttonMinus);

    init();


    buttonPlus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        szam++;
        init();
      }
    });

    buttonMinus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        szam--;
        init();
      }
    });

    textViewCounter.setOnLongClickListener(new View.OnLongClickListener() {
      @Override
      public boolean onLongClick(View view) {
        szam = 0;
        init();
        return false;
      }
    });
  }

  public void init() {
    int primOszto = 0;
    for (int i = 3; i < szam; i++) {
      if (szam % i == 0) {
        primOszto++;
      }
    }
    if (szam < 0) {
      textViewCounter.setTextColor(RED);
    } else if (szam == 0) {
      textViewCounter.setTextColor(0xff0000ff);
    } else if (szam == 1 || szam == 4 || primOszto != 0) {
      textViewCounter.setTextColor(rgb(0, 255, 0));
    } else if (szam <= 3 || primOszto == 0) {
      textViewCounter.setTextColor(rgb(255, 255, 255));
    }
    textViewCounter.setText(String.valueOf(szam));
  }
}