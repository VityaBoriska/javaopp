package com.example.javaopp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements Printable{

    //private
    //package access
    //protected
    //public

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Lion();
        cat.talk();

        Printable printable = new Puma();
        printable.print();
        ((Puma) printable).move();

        printAnyObject(new MainActivity());


    }

    void printAnyObject(Printable printable){

    }

    void printAnyObject(Puma puma){

    }

    @Override
    public void print() {

    }
}

