package com.example.myapp.Model;

import com.example.myapp.R;
import java.util.ArrayList;

public class myModel {
    private ArrayList<vehicle> Vehicles = new ArrayList<>();

    public myModel(){
        //Vehicles Types = E-Scooters,E-bikes,E-mopeds
        Vehicles.add(new vehicle("E-XR 0","E-Scooters",2, R.drawable.imgg));
        Vehicles.add(new vehicle("TEN 02","E-Scooters",3,R.drawable.ihgg));
        Vehicles.add(new vehicle("SPEed 0F12","E-Scooters",4,R.drawable.blac));
        Vehicles.add(new vehicle("E-Light8","E-Scooters",1, R.drawable.imgg));

        Vehicles.add(new vehicle("Bike 002T","E-bikes",4,R.drawable.ebike));
        Vehicles.add(new vehicle("Bike 17Gen","E-bikes",4,R.drawable.ebike2));
        Vehicles.add(new vehicle("Bike CG0-F12","E-bikes",4,R.drawable.ebike3));
        Vehicles.add(new vehicle("Bike 006T","E-bikes",4,R.drawable.ebike));

        Vehicles.add(new vehicle("Thor 38AH Red","E-mopeds",5,R.drawable.moo));
        Vehicles.add(new vehicle("48V 12AH","E-mopeds",5,R.drawable.mooo));
        Vehicles.add(new vehicle("TDA Trink","E-mopeds",5,R.drawable.bpo));
    }
    public ArrayList<vehicle> getVehiclesByType(String type){
        ArrayList<vehicle> result = new ArrayList<>();
        for(vehicle w : Vehicles){
            if(w.getType().equals(type)){
                result.add(w);
            }
        }
        return result;
    }

}
