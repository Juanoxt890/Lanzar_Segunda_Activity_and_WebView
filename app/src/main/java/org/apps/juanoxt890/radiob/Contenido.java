package org.apps.juanoxt890.radiob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
public class Contenido extends AppCompatActivity {
    private WebView Webinternet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        Toast toas_animation= Toast.makeText(this,"Ingreso correcto",Toast.LENGTH_LONG);
        toas_animation.show();

        Webinternet = (WebView) findViewById(R.id.Webinternet);

        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        Webinternet.loadUrl("http://" + dato);
    }
    public void acercade(View acerca_de) {
        Intent j = new Intent(this, Acerca_de.class );
        startActivity(j);

    }
    public void finalizar(View v) {
        finish();
    }
}
