package mtz.fernando.edu.mx.ipn.com.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void regresar(View v){
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);

    }
}
