package utspemrorgramanmobile.mobilelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tp = findViewById(R.id.button);
        Button pp = findViewById(R.id.button2);
        Button pk = findViewById(R.id.button3);
        Button a = findViewById(R.id.button4);
        Button kk = findViewById(R.id.button5);
        Button m = findViewById(R.id.button6);
        Button ta = findViewById(R.id.button7);

        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent_t = new Intent(MainActivity.this, TujuanPembelajaran.class);
                startActivity(intent_t);
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_p = new Intent(MainActivity.this, PertanyaanPemantik.class);
                startActivity(intent_p);
            }
        });
        pk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_pk = new Intent(MainActivity.this, PetaKonsep.class);
                startActivity(intent_pk);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_a = new Intent(MainActivity.this, Apersepsi.class);
                startActivity(intent_a);
            }
        });
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_kk = new Intent(MainActivity.this, KataKunci.class);
                startActivity(intent_kk);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent_m = new Intent(MainActivity.this, Materi.class);
                startActivity(intent_m);
            }
        });
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ta = new Intent(MainActivity.this, TentangAplikasi.class);
                startActivity(intent_ta);
            }
        });
    }
}