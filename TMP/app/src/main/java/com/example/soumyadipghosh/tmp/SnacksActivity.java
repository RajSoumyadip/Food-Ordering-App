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
import static com.example.soumyadipghosh.tmp.R.drawable.c;
import static com.example.soumyadipghosh.tmp.R.drawable.p;

public class SnacksActivity extends AppCompatActivity {


    Button BuyPlainMaggie;
    Button BuyCheesemaggie;
    Button BuyChilliPotato;
    Button BuyVegmomo;
    Button BuyChickenMomo;
    Button BuySpringRoll;
    Button BuyBreadOmlette;
    Button BuyCheesePaneerBurger;
    Button BuyDoubleChickenBurger;
    Button BuyChickenCutlet;
    Button BuyChickenPopcorn;
    Button BuyChickenSeekhKabab;
    Button BuyChickenReshmiKabab;
    Button BuyChickenShamiKabab;
    Button BuyChickenSandwich;
    FloatingActionButton button;
    List<String> word =new ArrayList<>();
    int i=0;
    int TotalSnacks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);


        BuyPlainMaggie = (Button) findViewById(R.id.buyPlainMaggie);
        BuyCheesemaggie =(Button) findViewById(R.id.buyCheeseMaggie);
        BuyChilliPotato=(Button) findViewById(R.id.buyChilliPotato);
        BuyVegmomo = (Button) findViewById(R.id.buyVegMomo);
        BuyChickenMomo = (Button) findViewById(R.id.buyChickenMomo);
        BuySpringRoll = (Button) findViewById(R.id.buySpringRoll);
        BuyBreadOmlette = (Button) findViewById(R.id.buyBreadOmlette);
        BuyCheesePaneerBurger = (Button) findViewById(R.id.buyCheesePaneerBurger);
        BuyDoubleChickenBurger = (Button) findViewById(R.id.buyDoubleChickenBurger);
        BuyChickenCutlet = (Button) findViewById(R.id.buyChickenCutlet);
        BuyChickenPopcorn = (Button) findViewById(R.id.buyChickenPopcorn);
        BuyChickenSeekhKabab = (Button) findViewById(R.id.buyChickenSheekhKabab);
        BuyChickenReshmiKabab = (Button) findViewById(R.id.buyChickenReshmiKabab);
        BuyChickenShamiKabab = (Button) findViewById(R.id.buyChickenShamiKabab);
        BuyChickenSandwich = (Button) findViewById(R.id.buyChickenSandwich);




        BuyPlainMaggie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Plain Maggie";
                String Quantity = String.valueOf(countPlainMaggie);
                int q = Integer.parseInt(Quantity);
                int tc = q*20;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setPM = getSharedPreferences("PM",0);
                SharedPreferences.Editor editorPM = setPM.edit();
                editorPM.putString("Detail",temp);
                editorPM.putInt("Cost",tc);
                editorPM.apply();
                word.add(i++,temp);


            }
        });

        BuyCheesemaggie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Cheese Maggie";
                String Quantity = String.valueOf(countCheeseMaggie);
                int q = Integer.parseInt(Quantity);
                int tc = q*40;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCM = getSharedPreferences("CM",0);
                SharedPreferences.Editor editorCM = setCM.edit();
                editorCM.putString("Detail",temp);
                editorCM.putInt("Cost",tc);
                editorCM.apply();
                word.add(i++,temp);
            }
        });

        BuyChilliPotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chilli Potato";
                String Quantity = String.valueOf(countChilliPotato);
                int q = Integer.parseInt(Quantity);
                int tc = q*40;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCP = getSharedPreferences("CP",0);
                SharedPreferences.Editor editorCP = setCP.edit();
                editorCP.putString("Detail",temp);
                editorCP.putInt("Cost",tc);
                editorCP.apply();
                word.add(i++,temp);

            }
        });

        BuyVegmomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Veg Momo";
                String Quantity = String.valueOf(countVegMomo);
                int q = Integer.parseInt(Quantity);
                int tc = q*40;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setVMomo = getSharedPreferences("VMomo",0);
                SharedPreferences.Editor editorVMomo = setVMomo.edit();
                editorVMomo.putString("Detail",temp);
                editorVMomo.putInt("Cost",tc);
                editorVMomo.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenMomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String Name= "Chicken Momo";
                String Quantity = String.valueOf(countChickenMomo);
                int q = Integer.parseInt(Quantity);
                int tc = q*50;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCMomo = getSharedPreferences("CMomo",0);
                SharedPreferences.Editor editorCMomo = setCMomo.edit();
                editorCMomo.putString("Detail",temp);
                editorCMomo.putInt("Cost",tc);
                editorCMomo.apply();
                word.add(i++,temp);

            }
        });

        BuySpringRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Spring Roll";
                String Quantity = String.valueOf(countSpringRoll);
                int q = Integer.parseInt(Quantity);
                int tc = q*70;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setSR = getSharedPreferences("SR",0);
                SharedPreferences.Editor editorSR = setSR.edit();
                editorSR.putString("Detail",temp);
                editorSR.putInt("Cost",tc);
                editorSR.apply();
                word.add(i++,temp);

            }
        });

        BuyBreadOmlette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Bread Omlettee";
                String Quantity = String.valueOf(countBreadomlette);
                int q = Integer.parseInt(Quantity);
                int tc = q*30;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setBO = getSharedPreferences("BO",0);
                SharedPreferences.Editor editorBO = setBO.edit();
                editorBO.putString("Detail",temp);
                editorBO.putInt("Cost",tc);
                editorBO.apply();
                word.add(i++,temp);

            }
        });

        BuyCheesePaneerBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Cheese Paneer Burger";
                String Quantity = String.valueOf(countCheesePaneerBurger);
                int q = Integer.parseInt(Quantity);
                int tc = q*35;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCPB = getSharedPreferences("CPB",0);
                SharedPreferences.Editor editorCPB = setCPB.edit();
                editorCPB.putString("Detail",temp);
                editorCPB.putInt("Cost",tc);
                editorCPB.apply();
                word.add(i++,temp);

            }
        });

        BuyDoubleChickenBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Double Chicken Burger";
                String Quantity = String.valueOf(countDoubleChickenBurger);
                int q = Integer.parseInt(Quantity);
                int tc = q*70;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setDCB = getSharedPreferences("DCB",0);
                SharedPreferences.Editor editorDCB = setDCB.edit();
                editorDCB.putString("Detail",temp);
                editorDCB.putInt("Cost",tc);
                editorDCB.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenCutlet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Cutlet";
                String Quantity = String.valueOf(countChickenCutlet);
                int q = Integer.parseInt(Quantity);
                int tc = q*80;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCC = getSharedPreferences("CC",0);
                SharedPreferences.Editor editorCC = setCC.edit();
                editorCC.putString("Detail",temp);
                editorCC.putInt("Cost",tc);
                editorCC.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenPopcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Popcorn";
                String Quantity = String.valueOf(countChickenPopcorn);
                int q = Integer.parseInt(Quantity);
                int tc = q*80;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCPopcorn = getSharedPreferences("CPopcorn",0);
                SharedPreferences.Editor editorCPopcorn = setCPopcorn.edit();
                editorCPopcorn.putString("Detail",temp);
                editorCPopcorn.putInt("Cost",tc);
                editorCPopcorn.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenSeekhKabab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Seekh Kabab";
                String Quantity = String.valueOf(countChickenSeekhKabab);
                int q = Integer.parseInt(Quantity);
                int tc = q*100;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCSK = getSharedPreferences("CSK",0);
                SharedPreferences.Editor editorCSK = setCSK.edit();
                editorCSK.putString("Detail",temp);
                editorCSK.putInt("Cost",tc);
                editorCSK.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenReshmiKabab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Reshmi Kabab";
                String Quantity = String.valueOf(countChickenReshiKabab);
                int q = Integer.parseInt(Quantity);
                int tc = q*90;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCRK = getSharedPreferences("CRK",0);
                SharedPreferences.Editor editorCRK = setCRK.edit();
                editorCRK.putString("Detail",temp);
                editorCRK.putInt("Cost",tc);
                editorCRK.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenShamiKabab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Cheese Shami Kabab";
                String Quantity = String.valueOf(countChickenShamiKabab);
                int q = Integer.parseInt(Quantity);
                int tc = q*50;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCShamiKabab = getSharedPreferences("CShamiKabab",0);
                SharedPreferences.Editor editorCShamiKabab = setCShamiKabab.edit();
                editorCShamiKabab.putString("Detail",temp);
                editorCShamiKabab.putInt("Cost",tc);
                editorCShamiKabab.apply();
                word.add(i++,temp);

            }
        });

        BuyChickenSandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= "Chicken Sandwich";
                String Quantity = String.valueOf(countChickenSandwich);
                int q = Integer.parseInt(Quantity);
                int tc = q*80;
                TotalSnacks = TotalSnacks + tc;
                String tem = Integer.toString(tc);
                String temp = "Name: "+Name+"             \t"+"Quantity: "+Quantity+"             \tPrice Rs."+ tem;
                SharedPreferences setCSandwich = getSharedPreferences("CSandwich",0);
                SharedPreferences.Editor editorCSandwich = setCSandwich.edit();
                editorCSandwich.putString("Detail",temp);
                editorCSandwich.putInt("Cost",tc);
                editorCSandwich.apply();
                word.add(i++,temp);

            }
        });

        button = (FloatingActionButton) findViewById(R.id.fabSnacks);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TotalSnacks=0;
                Intent i = new Intent(SnacksActivity.this,Summary.class);
                startActivity(i);
            }
        });






    }

    byte countPlainMaggie = 1;
    byte countCheeseMaggie=1;
    byte countChilliPotato=1;
    byte countVegMomo=1;
    byte countChickenMomo=1;
    byte countSpringRoll=1;
    byte countBreadomlette=1;
    byte countCheesePaneerBurger=1;
    byte countDoubleChickenBurger=1;
    byte countChickenCutlet=1;
    byte countChickenPopcorn=1;
    byte countChickenSeekhKabab=1;
    byte countChickenReshiKabab=1;
    byte countChickenShamiKabab=1;
    byte countChickenSandwich=1;


    public void IncrementPlainMaggie(View view) {

        countPlainMaggie++;
        TextView DispCount=(TextView) findViewById(R.id.PlainMaggieQtyView);
        DispCount.setText(""+ countPlainMaggie);
    }

    public void DecrementPlainMaggie(View view) {
        if (countPlainMaggie > 1)
        {
            countPlainMaggie--;
        }
        TextView DispCount=(TextView) findViewById(R.id.PlainMaggieQtyView);
        DispCount.setText(""+ countPlainMaggie);
    }

    public void IncrementCheeseMaggie(View view) {

        countCheeseMaggie++;
        TextView DispCount=(TextView) findViewById(R.id.CheeseMaggieQtyView);
        DispCount.setText(""+ countCheeseMaggie);

    }

    public void DecrementCheeseMaggie(View view) {
        if (countCheeseMaggie > 1)
        {
            countCheeseMaggie--;
        }
        TextView DispCount=(TextView) findViewById(R.id.CheeseMaggieQtyView);
        DispCount.setText(""+ countCheeseMaggie);
    }

    public void IncrementChilliPotato(View view) {
        countChilliPotato++;
        TextView DispCount=(TextView) findViewById(R.id.ChilliPotatoQtyView);
        DispCount.setText(""+ countChilliPotato);

    }

    public void DecrementChilliPotato(View view) {

        if (countChilliPotato > 1)
        {
            countChilliPotato--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChilliPotatoQtyView);
        DispCount.setText(""+ countChilliPotato);
    }

    public void IncrementVegMomo(View view) {

        countVegMomo++;
        TextView DispCount=(TextView) findViewById(R.id.VegMomoQtyView);
        DispCount.setText(""+ countVegMomo);
    }

    public void DecrementVegMomo(View view) {
        if (countVegMomo > 1)
        {
            countVegMomo--;
        }
        TextView DispCount=(TextView) findViewById(R.id.VegMomoQtyView);
        DispCount.setText(""+ countVegMomo);
    }

    public void IncrementChickenMomo(View view) {

        countChickenMomo++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenMomoQtyView);
        DispCount.setText(""+ countChickenMomo);
    }

    public void DecrementChickenMomo(View view) {

        if (countChickenMomo > 1)
        {
            countChickenMomo--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenMomoQtyView);
        DispCount.setText(""+ countChickenMomo);
    }

    public void IncrementSpringRoll(View view) {

        countSpringRoll++;
        TextView DispCount=(TextView) findViewById(R.id.SpringRollQtyView);
        DispCount.setText(""+ countSpringRoll);

    }

    public void DecrementSpringRoll(View view) {

        if (countSpringRoll > 1)
        {
            countSpringRoll--;
        }
        TextView DispCount=(TextView) findViewById(R.id.SpringRollQtyView);
        DispCount.setText(""+ countSpringRoll);

    }

    public void IncrementBreadOmlette(View view) {

        countBreadomlette++;
        TextView DispCount=(TextView) findViewById(R.id.BreadOmletteQtyView);
        DispCount.setText(""+ countBreadomlette);

    }

    public void DecrementBreadOmlette(View view) {
        if (countBreadomlette > 1)
        {
            countBreadomlette--;
        }
        TextView DispCount=(TextView) findViewById(R.id.BreadOmletteQtyView);
        DispCount.setText(""+ countBreadomlette);

    }

    public void IncrementCheesePaneerBurger(View view) {
        countCheesePaneerBurger++;
        TextView DispCount=(TextView) findViewById(R.id.CheesePaneerBurgerQtyView);
        DispCount.setText(""+ countCheesePaneerBurger);
    }

    public void DecrementCheesePaneerBurger(View view) {

        if (countCheesePaneerBurger > 1)
        {
            countCheesePaneerBurger--;
        }
        TextView DispCount=(TextView) findViewById(R.id.CheesePaneerBurgerQtyView);
        DispCount.setText(""+ countCheesePaneerBurger);

    }

    public void IncrementDoubleChickenBurger(View view) {

        countDoubleChickenBurger++;
        TextView DispCount=(TextView) findViewById(R.id.DoubleChickenBurgerQtyView);
        DispCount.setText(""+ countDoubleChickenBurger);
    }

    public void DecrementDoubleChickenBurger(View view) {

        if (countDoubleChickenBurger > 1)
        {
         countDoubleChickenBurger--;
        }
        TextView DispCount=(TextView) findViewById(R.id.DoubleChickenBurgerQtyView);
        DispCount.setText(""+ countDoubleChickenBurger);
    }

    public void IncrementChickenCutlet(View view) {
        countChickenCutlet++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenCutletQtyView);
        DispCount.setText(""+ countChickenCutlet);
    }

    public void DecrementChickenCutlet(View view) {
        if (countChickenCutlet > 1)
        {
            countChickenCutlet--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenCutletQtyView);
        DispCount.setText(""+ countChickenCutlet);
    }

    public void IncrementChickenPopcorn(View view) {
        countChickenPopcorn++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenPopcornQtyView);
        DispCount.setText(""+ countChickenPopcorn);
    }

    public void DecrementChickenPopcorn(View view) {
        if (countChickenPopcorn > 1)
        {
            countChickenPopcorn--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenPopcornQtyView);
        DispCount.setText(""+ countChickenPopcorn);

    }

    public void IncrementChickenSeekhKabab(View view) {
        countChickenSeekhKabab++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenSheekhKababQtyView);
        DispCount.setText(""+ countChickenSeekhKabab);
    }

    public void DecrementChickenSeekhKabab(View view) {

        if (countChickenSeekhKabab > 1)
        {
            countChickenSeekhKabab--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenSheekhKababQtyView);
        DispCount.setText(""+ countChickenSeekhKabab);

    }

    public void IncrementChickenReshmiKabab(View view) {

        countChickenReshiKabab++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenReshmiKababQtyView);
        DispCount.setText(""+ countChickenReshiKabab);
    }

    public void DecrementChickenReshmiKabab(View view) {
        if (countChickenReshiKabab > 1)
        {
            countChickenReshiKabab--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenReshmiKababQtyView);
        DispCount.setText(""+ countChickenReshiKabab);
    }

    public void IncrementChickenShamiKabab(View view) {
        countChickenShamiKabab++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenShamiKababQtyView);
        DispCount.setText(""+ countChickenShamiKabab);
    }

    public void DecrementChickenShamiKabab(View view) {

        if (countChickenShamiKabab > 1)
        {
            countChickenShamiKabab--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenShamiKababQtyView);
        DispCount.setText(""+ countChickenShamiKabab);
    }

    public void IncrementChickenSandwich(View view) {

        countChickenSandwich++;
        TextView DispCount=(TextView) findViewById(R.id.ChickenSandwichQtyView);
        DispCount.setText(""+ countChickenSandwich);
    }

    public void DecrementChickenSandwich(View view) {

        if (countChickenSandwich > 1)
        {
            countChickenSandwich--;
        }
        TextView DispCount=(TextView) findViewById(R.id.ChickenSandwichQtyView);
        DispCount.setText(""+ countChickenSandwich);
    }

}
