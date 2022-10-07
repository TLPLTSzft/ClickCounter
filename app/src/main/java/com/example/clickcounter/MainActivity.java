package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private Button buttonPlus;
  private Button buttonMinus;
  private TextView textViewCounter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();


  }

  public void init() {
    buttonPlus = findViewById(R.id.buttonPlus);
    buttonMinus = findViewById(R.id.buttonMinus);
    textViewCounter = findViewById(R.id.textViewCounter);
  }
}