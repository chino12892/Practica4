package bamr.itics.tesoem.edu.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibeparametrosActivity extends AppCompatActivity {
    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibeparametros);

        vnombre = (TextView) findViewById(R.id.lblnombre);
        Bundle parametros = getIntent().getExtras();
        vnombre.setText("Bienvenid@ "+parametros.getString("nombre"));
    }
}
