package com.example.josbo.utilesescolares;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class Empezar extends AppCompatActivity {
private Button comprobar2;
    private int random2;
    private TextView nombre;
    private ImageView imagen;
    private EditText respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empezar);
        imagen=(ImageView)findViewById(R.id.imgAleatorio);
        imagenAleatorio();
        nombre=(TextView)findViewById(R.id.textView2);
        comprobar2=(Button)findViewById(R.id.btnComprobar);
        comprobar2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view)
                                         {
                                            imagenAleatorio();

                                         }
                                     }

        );



    }

    private void imagenAleatorio()
    {
        Random random=new Random();
        random2= random.nextInt(15);
        switch (random2)
        {
            case 1:

                imagen.setImageResource(R.drawable.boligrafo);
                nombre.setText("Boligrafo");
                break;

            case 2:

                imagen.setImageResource(R.drawable.cuaderno);
                nombre.setText("Cuaderno");
                break;
            case 3:

                imagen.setImageResource(R.drawable.diccionario);
                nombre.setText("Diccionario");
                break;
            case 4:

                imagen.setImageResource(R.drawable.estuche);
                nombre.setText("Estuche");
                break;
            case 5:

                imagen.setImageResource(R.drawable.goma);
                nombre.setText("Goma");
                break;
            case 6:

                imagen.setImageResource(R.drawable.lapiz);
                nombre.setText("Lapiz");
                break;
            case 7:

                imagen.setImageResource(R.drawable.libro);
                nombre.setText("Libro");
                break;
            case 8:

                imagen.setImageResource(R.drawable.mochila);
                nombre.setText("Mochila");
                break;
            case 9:

                imagen.setImageResource(R.drawable.pagina);
                nombre.setText("Pagina");
                break;
            case 10:

                imagen.setImageResource(R.drawable.pegante);
                nombre.setText("Pegante");
                break;
            case 11:

                imagen.setImageResource(R.drawable.pluma);
                nombre.setText("Pluma");
                break;
            case 12:

                imagen.setImageResource(R.drawable.regla);
                nombre.setText("Regla");
                break;
            case 13:

                imagen.setImageResource(R.drawable.rotulador);
                nombre.setText("Rotulador");
                break;
            case 14:

                imagen.setImageResource(R.drawable.sacapuntas);
                nombre.setText("Sacapuntas");
                break;
            case 15:

                imagen.setImageResource(R.drawable.tijeras);
                nombre.setText("Tijeras");
                break;
        }
    }

    public void comprobar()
    {



    }
    public void salir(View v)
    {
        finish();
    }
}

