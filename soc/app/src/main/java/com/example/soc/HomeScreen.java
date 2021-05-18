package com.example.soc;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button buttonStartQuiz = findViewById(R.id.startbut);
        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });
        // получаем TabHost
      //  TabHost tabHost = getTabHost();

        // инициализация была выполнена в getTabHost
        // метод setup вызывать не нужно

      //  TabHost.TabSpec tabSpec;

       // tabSpec = tabHost.newTabSpec("tag1");
        //tabSpec.setIndicator("Вкладка 1");
        //tabSpec.setContent(new Intent(this, MainActivity.class));
        //tabHost.addTab(tabSpec);

        //tabSpec = tabHost.newTabSpec("tag2");
        //tabSpec.setIndicator("Вкладка 2");
        //tabSpec.setContent(new Intent(this, Test.class));
        //tabHost.addTab(tabSpec);
        //TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        // инициализация
        //tabHost.setup();

        // вторая вкладка будет выбрана по умолчанию
        //tabHost.setCurrentTabByTag("tag2");

        // обработчик переключения вкладок
        //tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
          //  public void onTabChanged(String tabId) {
            //    Toast.makeText(getBaseContext(), "tabId = " + tabId, Toast.LENGTH_SHORT).show();
            //}
        //});
    }
    private void startQuiz() {

        Intent intent = new Intent(getApplicationContext(),Test.class);
        startActivity(intent);
    }
}