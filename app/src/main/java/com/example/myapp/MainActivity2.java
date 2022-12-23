package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapp.Model.myModel;
import com.example.myapp.Model.vehicle;


import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private final String VehiclesType[] = {"E-Scooters", "E-bikes", "E-mopeds"};
    private ListView VehiclesList;
    ArrayList<vehicle> result;
    String[] msg;
    vehicle[] newRes;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner spinner = findViewById(R.id.type_spinner);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_dropdown_item, VehiclesType);
        spinner.setAdapter(spinnerAdapter);

        VehiclesList = findViewById(R.id.Vehicles_List);
        CustomAdapter customAdapter = new CustomAdapter();


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity2.this ,MainActivity3.class);
                startActivity(intent);
            }
        });



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {


                CustomAdapter listAdapt;
                if (position == 0) {

                    myModel model = new myModel();

                    result = model.getVehiclesByType(VehiclesType[0].toString());
                    msg = new String[100];
                    newRes = new vehicle[100];

                    if (!result.isEmpty()) {
                        for (int i = 0; i < result.size(); i++) {
                            msg[i] = result.get(i).getName() + result.get(i).getType();
                            newRes[i] = result.get(i);
                        }
                        listAdapt = new CustomAdapter();
                    } else {
                        listAdapt = new CustomAdapter();
                    }
                    VehiclesList.setAdapter(listAdapt);


                }

                if (position == 1) {

                    myModel model = new myModel();

                    ArrayList<vehicle> result = model.getVehiclesByType(VehiclesType[1].toString());
                    String[] msg = new String[result.size()];

                    if (!result.isEmpty()) {
                        for (int i = 0; i < result.size(); i++) {
                            msg[i] = result.get(i).getName() + result.get(i).getType();
                            newRes[i] = result.get(i);
                        }
                        listAdapt = new CustomAdapter();
                    } else {
                        listAdapt = new CustomAdapter();
                    }
                    VehiclesList.setAdapter(listAdapt);


                }

                if (position == 2) {
                    myModel model = new myModel();

                    result = model.getVehiclesByType(VehiclesType[2].toString());
                    String[] msg = new String[result.size()];


                    if (!result.isEmpty()) {
                        for (int i = 0; i < result.size(); i++) {
                            msg[i] = result.get(i).getName() + result.get(i).getType();
                            newRes[i] = result.get(i);
                        }
                        listAdapt = new CustomAdapter();
                    } else {
                        listAdapt = new CustomAdapter();
                    }
                    VehiclesList.setAdapter(listAdapt);


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }

    private class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return result.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.data, null);
            //getting view in row_data
            TextView vehicleName = view1.findViewById(R.id.title);
            TextView vehicleType = view1.findViewById(R.id.type);
            TextView cost = view1.findViewById(R.id.cost);
            ImageView image = view1.findViewById(R.id.img);

            vehicleName.setText(newRes[i].getName());
            vehicleType.setText("Type: " + newRes[i].getType());
            cost.setText(newRes[i].getCost() + "$ per min ");
            image.setImageResource(newRes[i].getImg());
            return view1;
        }

    }

}