package com.tavor.todoorg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Select extends AppCompatActivity {
    private Spinner spinnerInter;
    private List<String> listInterval= new ArrayList<>();
    private NotifyService ns;
    private Button btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        addItemsOnSpinnerCategory();
        btnSelect = (Button) findViewById(R.id.buttonSelect);

        ns=new NotifyService();

    }

    public void addItemsOnSpinnerCategory() {
        spinnerInter = (Spinner) findViewById(R.id.spinnerInter);
        listInterval.add("50");
        listInterval.add("60");
        listInterval.add("70");
        listInterval.add("80");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, listInterval);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerInter.setAdapter(dataAdapter);
    }
    public void onClickSelect(View v)
    {
        int interv = Integer.parseInt(spinnerInter.getSelectedItem().toString());
        ns.changeInterval(interv);
        finish();
    }

}
