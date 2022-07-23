package com.example.pedrapapeltesouralagartospock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        ResultadoEmbate(0);
    }

    public void selecionadoPapel(View view){
        ResultadoEmbate(1);
    }

    public void selecionadoTesoura(View view){
        ResultadoEmbate(2);
    }

    public void selecionadoLagarto(View view){
        ResultadoEmbate(3);
    }

    public void selecionadoSpock(View view){
        ResultadoEmbate(4);
    }


    public void ResultadoEmbate(int escolhaUser){

        ImageView escolhaUsuario = findViewById(R.id.escolhaUsuario);
        ImageView escolhaOponente = findViewById(R.id.escolhaOponente);
        TextView textResultado = findViewById(R.id.textResultado);

        int escolhaOpon = new Random().nextInt(5);


        switch (escolhaUser){
            case 0:
                escolhaUsuario.setImageResource(R.drawable.pedra);
                break;

            case 1:
                escolhaUsuario.setImageResource(R.drawable.papel);
                break;

            case 2:
                escolhaUsuario.setImageResource(R.drawable.tesoura);
                break;

            case 3:
                escolhaUsuario.setImageResource(R.drawable.lagarto);
                break;

            case 4:
                escolhaUsuario.setImageResource(R.drawable.spock);
                break;
        }


        switch (escolhaOpon){
            case 0:
                escolhaOponente.setImageResource(R.drawable.pedra);
                break;

            case 1:
                escolhaOponente.setImageResource(R.drawable.papel);
                break;

            case 2:
                escolhaOponente.setImageResource(R.drawable.tesoura);
                break;

            case 3:
                escolhaOponente.setImageResource(R.drawable.lagarto);
                break;

            case 4:
                escolhaOponente.setImageResource(R.drawable.spock);
                break;
        }


        if(
                (escolhaOpon == 0 && ( escolhaUser == 2 || escolhaUser == 3)) ||
                (escolhaOpon == 1 && ( escolhaUser == 0 || escolhaUser == 4)) ||
                (escolhaOpon == 2 && ( escolhaUser == 1 || escolhaUser == 3)) ||
                (escolhaOpon == 3 && ( escolhaUser == 1 || escolhaUser == 4)) ||
                (escolhaOpon == 4 && ( escolhaUser == 0 || escolhaUser == 2))

        ){
            textResultado.setText("PERDEU JACU!");


        }else if(
                (escolhaUser == 0 && ( escolhaOpon == 2 || escolhaOpon == 3)) ||
                (escolhaUser == 1 && ( escolhaOpon == 0 || escolhaOpon == 4)) ||
                (escolhaUser == 2 && ( escolhaOpon == 1 || escolhaOpon == 3)) ||
                (escolhaUser == 3 && ( escolhaOpon == 1 || escolhaOpon == 4)) ||
                (escolhaUser == 4 && ( escolhaOpon == 0 || escolhaOpon == 2))
        ){
            textResultado.setText("GANHOU MISERAVI!");

        }else {
            textResultado.setText("EMPATE TÉCNICO!");

        }

        System.out.println("User " + escolhaUser + "- op " + escolhaOpon);

    }

}
