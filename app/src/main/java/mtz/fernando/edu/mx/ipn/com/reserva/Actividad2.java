package mtz.fernando.edu.mx.ipn.com.reserva;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends Activity {

    String nombre = "", fecha = "", hora = "", materno="", paterno="", edad="";
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");
        paterno = recibe.getString("paterno");
        materno = recibe.getString("materno");
        edad = recibe.getString("edad");

        muestraDatos.setText("Reservacion a nombre de :" + nombre + "\nApellido Paterno: "+ paterno+ "\nApellido Materno : "+
                materno + "\nedad: "+edad+" años"+"\n" + personas
                + " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");

    }

    public void irActivity3(View v) {
        Intent envia = new Intent(this, Actividad3.class);
        finish();
        startActivity(envia);
    }

}
