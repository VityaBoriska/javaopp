package com.example.javaopp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(3, "Barsik", "Pudge", "blue");
        myCat.talk();

        Cat murzik = new Cat(2, "Murza", "pitbul", "Green");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.breed = "American";
        glasha.color = "brown";
        glasha.talk();


    }
}