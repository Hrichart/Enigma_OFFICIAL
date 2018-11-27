package com.example.ricca.enigma;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.content.Intent;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Per aprire l'activity per cifrare
   public void openCrypt(View view){
       Rotors.enigma_preferences=getSharedPreferences(Rotors.ENIGMAPREFERENCES,Context.MODE_PRIVATE);
       SharedPreferences.Editor editor=Rotors.enigma_preferences.edit();
       editor.putInt("rotor_one_key",0);
       editor.putInt("rotor_two_key",0);
       editor.putInt("rotor_three_key",0);
       editor.putInt("rotor_four_key",0);
       editor.putInt("letter_one_key",0);
       editor.putInt("letter_two_key",0);
       editor.putInt("letter_three_key",0);
       editor.commit();
       Intent intent = new Intent(this, Crypt_decrypt.class);
       startActivity(intent);
   }
   //Per aprire l'activity per decifrare
    //public void openDecrypt(View view){
       // Intent intent = new Intent(this, Decrypt.class);
       // startActivity(intent);
   // }
}
