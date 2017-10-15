package edu.upc.eseiaat.pma.countrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryListActivity extends AppCompatActivity {

    private ArrayList<String> country_list; //contenedor secuencial, puedes mover objetos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        String[] countries = getResources().getStringArray(R.array.countries);
        country_list = new ArrayList<>(Arrays.asList(countries)); //conversor



    }
}
