package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private Button buttonPlus;
  private Button buttonMinus;
  private TextView textViewCounter;
  public int szam = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    init();

    buttonPlus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        szam++;
        textViewCounter.setText(String.valueOf(szam));
      }
    });

    buttonMinus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        szam--;
        textViewCounter.setText(String.valueOf(szam));
      }
    });

    textViewCounter.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        szam = 0;
        textViewCounter.setText(String.valueOf(szam));
      }
    });

  }

  public void init() {
    buttonPlus = findViewById(R.id.buttonPlus);
    buttonMinus = findViewById(R.id.buttonMinus);
    textViewCounter = findViewById(R.id.textViewCounter);
  }
}