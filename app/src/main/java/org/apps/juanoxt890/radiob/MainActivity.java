package org.apps.juanoxt890.radiob;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ETWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETWeb=(EditText)findViewById(R.id.ETWeb);
    }




    public void checar_password(View checar){


        //-------------------------------------------------------//
        EditText recibe_usuario=(EditText)findViewById(R.id.editText2);
        EditText recibe_password= (EditText)findViewById(R.id.editText3);
        //TextView resultado=(TextView)findViewById(R.id.textView2);

        //Button realizar_accion=(Button)findViewById(R.id.button3);
        //-------------------------------------------------------//
        //resultado.setText(recibe_password.getText());
        String usuario=recibe_usuario.getText().toString();
        String clave=recibe_password.getText().toString();

        if (usuario.equals("Juanoxt890") && clave.equals("1379")) {
            Intent ir_acontenido = new Intent(this,Contenido.class);
            startActivity(ir_acontenido);
        }
        else{

            Toast.makeText(MainActivity.this, "'Revisa tu contraseña e intentalo denuevo.'", Toast.LENGTH_LONG).show();

            /*Toast notificacion= Toast.makeText(this,"Clave incorrecta",Toast.LENGTH_LONG);
            notificacion.show();*/
        }


        }
    public void ver(View vista) {
        Intent i=new Intent(this,Contenido.class);
        i.putExtra("direccion", ETWeb.getText().toString());
        startActivity(i);
    }
}




