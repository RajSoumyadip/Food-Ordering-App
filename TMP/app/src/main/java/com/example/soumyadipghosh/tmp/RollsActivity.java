package com.example.soumyadipghosh.tmp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.button;
import static android.os.Build.VERSION_CODES.M;


public class RollsActivity extends AppCompatActivity {

    Button BuyAlooVegRoll;
    Button BuyPaneerPasandaRoll;
    Button BuyEggRoll;
    Button BuyChickenCreamRoll;
    Button BuyDoubleEggChickenRoll;
    Button BuyChickenSeekhKababRoll;
    Button BuyChickenTikkaRoll;
    int TotalPrice=0;
    FloatingActionButton button;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolls);



        BuyAlooVegRoll = (Button) findViewById(R.id.buyAlooVegRoll);
        BuyPaneerPasandaRoll =(Button) findViewById(R.id.buyPaneerPasandaRoll);
        BuyEggRoll = (Button) findViewById(R.id.buyEggRoll);
        BuyChickenCreamRoll = (Button) findViewById(R.id.buyChickenCreamRoll);
        BuyDoubleEggChickenRoll = (Button) findViewById(R.id.buyDoubleEggChickenRoll);
        BuyChickenSeekhKababRoll = (Button) findViewById(R.id.buyChickenSeekhKababRoll);
        BuyChickenTikkaRoll = (Button) findViewById(R.id.buyChickenTikkaRoll);


        BuyAlooVegRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Aloo Veg Roll";
                String Quantity = String.valueOf(countAlooVegRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*50;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences SETALOOVEGROLL = getSharedPreferences("ALOOVEGROLL",0);
                SharedPreferences.Editor EDITORSETALOOVEGROLL = SETALOOVEGROLL.edit();
                EDITORSETALOOVEGROLL.putString("Detail",temp);
                EDITORSETALOOVEGROLL.putInt("Cost",tc);
                EDITORSETALOOVEGROLL.apply();

            }
        });

        BuyPaneerPasandaRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name= "Paneer Pasanda Roll";
                String Quantity = String.valueOf(countPaneerPasandaRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*70;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setPaneerPasandaRoll = getSharedPreferences("PAANERPASANDAROLL",0);
                SharedPreferences.Editor editorPaneerPasandaRoll = setPaneerPasandaRoll.edit();
                editorPaneerPasandaRoll.putString("Detail",temp);
                editorPaneerPasandaRoll.putInt("Cost",tc);
                editorPaneerPasandaRoll.apply();


            }
        });

        BuyEggRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Egg Roll";
                String Quantity = String.valueOf(countEggRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*60;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setEggRoll = getSharedPreferences("EGGROLL",0);
                SharedPreferences.Editor editorEggRoll = setEggRoll.edit();
                editorEggRoll.putString("Detail",temp);
                editorEggRoll.putInt("Cost",tc);
                editorEggRoll.apply();


            }
        });

        BuyChickenCreamRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name= "Chicken Cream Roll";
                String Quantity = String.valueOf(countChickenCreamRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*80;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCHICKENCREAMROLL = getSharedPreferences("CHICKENCREAMROLL",0);
                SharedPreferences.Editor editorCHICKENCREAMROLL = setCHICKENCREAMROLL.edit();
                editorCHICKENCREAMROLL.putString("Detail",temp);
                editorCHICKENCREAMROLL.putInt("Cost",tc);
                editorCHICKENCREAMROLL.apply();

            }
        });

        BuyDoubleEggChickenRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Double Egg Chicken Roll";
                String Quantity = String.valueOf(countDoubleEggChickenRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*60;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setDECROLL = getSharedPreferences("DECROLL",0);
                SharedPreferences.Editor editorDECROLL = setDECROLL.edit();
                editorDECROLL.putString("Detail",temp);
                editorDECROLL.putInt("Cost",tc);
                editorDECROLL.apply();


            }
        });

        BuyChickenSeekhKababRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Seekh Roll";
                String Quantity = String.valueOf(countSeekhKababRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*60;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCSKROLL = getSharedPreferences("CSKROLL",0);
                SharedPreferences.Editor editorCSKROLL = setCSKROLL.edit();
                editorCSKROLL.putString("Detail",temp);
                editorCSKROLL.putInt("Cost",tc);
                editorCSKROLL.apply();


            }
        });

        BuyChickenTikkaRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Tikka Roll";
                String Quantity = String.valueOf(countChickenTikkaRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*75;
                TotalPrice = TotalPrice + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCTROLL = getSharedPreferences("CTROLL",0);
                SharedPreferences.Editor editorCTROLL = setCTROLL.edit();
                editorCTROLL.putString("Detail",temp);
                editorCTROLL.putInt("Cost",tc);
                editorCTROLL.apply();
               
            }
        });
        button = (FloatingActionButton) findViewById(R.id.fabRolls);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TotalPrice = 0;
                Intent i = new Intent(RollsActivity.this,Summary.class);
                startActivity(i);

            }
        });



    }
    byte countAlooVegRoll=1;
    byte countPaneerPasandaRoll=1;
    byte countEggRoll=1;
    byte countChickenCreamRoll=1;
    byte countDoubleEggChickenRoll=1;
    byte countSeekhKababRoll=1;
    byte countChickenTikkaRoll=1;


    public void IncrementAlooVegRoll(View view) {
        countAlooVegRoll++;
        TextView DispCount=(TextView) findViewById(R.id.AlooVegRollQtyView);
        DispCount.setText(""+ countAlooVegRoll);


    }

    public void DecrementAlooVegRoll(View view) {
        if(countAlooVegRoll>1)
        {
            countAlooVegRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.AlooVegRollQtyView);
        DispCount.setText(""+ countAlooVegRoll);

    }

    public void IncrementPaneerPasandaRoll(View view) {
        countPaneerPasandaRoll++;
        TextView DispCount=(TextView) findViewById(R.id.PaneerPasandaRollQtyView);
        DispCount.setText(""+ countPaneerPasandaRoll);

    }

    public void DecrementPaneerPasandaroll(View view) {
        if(countPaneerPasandaRoll>1)
        {
            countPaneerPasandaRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.PaneerPasandaRollQtyView);
        DispCount.setText(""+ countPaneerPasandaRoll);
    }

    public void IncrementEggRoll(View view) {
        countEggRoll++;
        TextView DispCount=(TextView) findViewById(R.id.EggRollQtyView);
        DispCount.setText(""+ countEggRoll);
    }

    public void DecrementEggRoll(View view) {
        if(countEggRoll>1)
        {
            countEggRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.EggRollQtyView);
        DispCount.setText(""+ countEggRoll);
    }

    public void IncrementChickenCreamRoll(View view) {
        countChickenCreamRoll++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenCreamRollQtyView);
        DispCount.setText(""+ countChickenCreamRoll);
    }

    public void DecrementChickenCreamRoll(View view) {
        if(countChickenCreamRoll>1)
        {
            countChickenCreamRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenCreamRollQtyView);
        DispCount.setText(""+ countChickenCreamRoll);
    }

    public void IncrementDoubleEggChickenRoll(View view) {
        countDoubleEggChickenRoll++;
        TextView DispCount=(TextView) findViewById(R.id.DoubleEggChickenRollQtyView);
        DispCount.setText(""+ countDoubleEggChickenRoll);
    }

    public void DecrementDoubleEggChickenRoll(View view) {
        if(countDoubleEggChickenRoll>1)
        {
            countDoubleEggChickenRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.DoubleEggChickenRollQtyView);
        DispCount.setText(""+ countDoubleEggChickenRoll);
    }


    public void IncrementChickenSeekhKababRoll(View view) {
        countSeekhKababRoll++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenSeekhKababRollQtyView);
        DispCount.setText(""+ countSeekhKababRoll);
    }

    public void DecrementChickenSeekhKababRoll(View view) {
        if (countSeekhKababRoll>1)
        {
            countSeekhKababRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenSeekhKababRollQtyView);
        DispCount.setText(""+ countSeekhKababRoll);
    }

    public void IncrementChickenTikkaRoll(View view) {
        countChickenTikkaRoll++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenTikkaRollQtyView);
        DispCount.setText(""+ countChickenTikkaRoll);
    }

    public void DecrementChickenTikkaRoll(View view) {
        if(countChickenTikkaRoll>1)
        {
            countChickenTikkaRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenTikkaRollQtyView);
        DispCount.setText(""+ countChickenTikkaRoll);
    }

}
