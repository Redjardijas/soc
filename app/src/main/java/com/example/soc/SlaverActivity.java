package com.example.soc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SlaverActivity extends AppCompatActivity {
    String[] items;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slovar);
        listView = (ListView) findViewById(R.id.listview);
        editText = (EditText) findViewById(R.id.txtsearch);
        initList();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    // reset listview;
                    initList();
                } else {
                    // perform search
                    searchItem(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    public void searchItem(String textToSearch) {
        for (String item : items) {
            if (!item.contains(textToSearch)) {
                listItems.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }

    public void initList() {
        items = new String[]{"Агенты социализации",// – социальные субъекты (индивиды и социальные институты), связанные с социализацией и ответственные за ее результаты. \n" +
                "Анимизм",// – вера в существование духов и одушевленность природных сил. \n" +
                "Анкетирование",// – письменная форма опроса, которая проводится опосредованно с помощью анкеты. \n" +
                "Аудитория",// – группа, объединенная взаимодействием с коммуникатором, который доносит определенную информацию до членов группы, и характеризуется слабой обратной связью и односторонним взаимодействием (студенты на лекции). \n" +
                "Брак",// – это юридическая форма организации отношений между мужчиной и женщиной, порождающее их права и обязанности по отношению друг к другу и к детям. \n" +
                "Выборочная совокупность (выборка)",// – формируемая по определенным правилам микромодель генеральной совокупности, состоящая из респондентов. \n" +
                "Выборочный метод",// – научно обоснованный подход, в результате которого делают вывод про объект исследования как целое, опираясь на данные анализа его части. \n" +
                "Группа большая",// – это большая совокупность людей, не имеющих между собой непосредственных контактов, но объединенных осознанием принадлежности к группе, образом жизни, принятыми нормами поведения (сословие, национальное меньшинство). \n" +
                "Группа внешняя",// – это группа, к которой индивид не принадлежит и с которой себя не идентифицирует (чужая семья, конкуренты). \n" +
                "Группа внутренняя",// – это группа, к которой индивид непосредственно принадлежит и с которой себя идентифицирует (своя семья, своя нация). \n" +
                "Группа малая"};
                // – это непосредственно контактирующая немногочисленная группа людей, объединенная совместной деятельностью, характеризующаяся стабильностью состава, интенсивностью межличностных отношений, высокой степенью сплочения (семья, друзья). \n@"};
        listItems = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, listItems);
        listView.setAdapter(adapter);
    }
}