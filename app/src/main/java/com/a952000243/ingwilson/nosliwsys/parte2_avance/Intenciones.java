package com.a952000243.ingwilson.nosliwsys.parte2_avance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Intenciones extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intenciones);
    }
    public void web(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://developer.android.com/guide/components/intents-common?hl=es-419"));
        startActivity(intent);
    }
    public void Llamar(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:952000243"));
        startActivity(intent);
    }
    public void maps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:-18.013739816,-70.2510593169"));
        startActivity(intent);
    }
    public void foto(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Duda de Android");
        intent.putExtra(Intent.EXTRA_TEXT, "Buen día Ing. Wilson tengo la siguiente duda...");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"nosliwsys@gmail.com"});
        startActivity(intent);
    }
}
