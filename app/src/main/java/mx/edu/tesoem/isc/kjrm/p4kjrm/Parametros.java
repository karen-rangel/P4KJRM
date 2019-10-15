package mx.edu.tesoem.isc.kjrm.p4kjrm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Parametros extends AppCompatActivity {
    TextView vnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros);

        Bundle parametros = getIntent().getExtras();
        vnombre = (TextView) findViewById(R.id.lblparametros);

        vnombre.setText("Bienvenido"+ parametros.getString("pnombre"));
    }
}
