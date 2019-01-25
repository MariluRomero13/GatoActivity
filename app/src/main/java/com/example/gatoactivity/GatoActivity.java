package com.example.gatoactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GatoActivity extends AppCompatActivity {

    boolean s = false;
    int ganador = 0;
    int contador = 0;
    String winner;
    Button btnuno, btndos, btntres, btncuatro, btncinco, btnseis,btnsiete,btnocho,btnnueve, btnrestart;
    TextView lblturno, lblwinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);

        btnuno = findViewById(R.id.btnuno);
        btndos = findViewById(R.id.btndos);
        btntres  = findViewById(R.id.btntres);
        btncuatro  = findViewById(R.id.btncuatro);
        btncinco  = findViewById(R.id.btncinco);
        btnseis  = findViewById(R.id.btnseis);
        btnsiete  = findViewById(R.id.btnsiete);
        btnocho  = findViewById(R.id.btnocho);
        btnnueve  = findViewById(R.id.btnnueve);
        lblturno   = findViewById(R.id.lblturn);
        lblwinner  = findViewById(R.id.lblwinner);
        btnrestart = findViewById(R.id.btnrestart);

        View.OnClickListener click = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.btnuno:
                        verdadero_falso(btnuno);
                        ganador();
                        break;

                    case R.id.btndos:
                        verdadero_falso(btndos);
                        ganador();
                        break;

                    case R.id.btntres:
                        verdadero_falso(btntres);
                        ganador();
                        break;

                    case R.id.btncuatro:
                        verdadero_falso(btncuatro);
                        ganador();
                        break;

                    case R.id.btncinco:
                        verdadero_falso(btncinco);
                        ganador();
                        break;

                    case R.id.btnseis:
                        verdadero_falso(btnseis);
                        ganador();
                        break;

                    case R.id.btnsiete:
                        verdadero_falso(btnsiete);
                        ganador();
                        break;

                    case R.id.btnocho:
                        verdadero_falso(btnocho);
                        ganador();
                        break;

                    case R.id.btnnueve:
                        verdadero_falso(btnnueve);
                        ganador();
                        break;

                    case  R.id.btnrestart:
                        restart();
                        btnrestart.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        };

        btnuno.setOnClickListener(click);
        btndos.setOnClickListener(click);
        btntres.setOnClickListener(click);
        btncuatro.setOnClickListener(click);
        btncinco.setOnClickListener(click);
        btnseis.setOnClickListener(click);
        btnsiete.setOnClickListener(click);
        btnocho.setOnClickListener(click);
        btnnueve.setOnClickListener(click);
        btnrestart.setOnClickListener(click);
    }

    public void verdadero_falso(Button btn)
    {
        if (s)
        {
            btn.setText("X");
            btn.setEnabled(false);
            btn.setTextSize(20);
            btn.setTextColor(Color.parseColor("#d50000"));
            btn.setBackgroundColor(Color.parseColor("#9e9e9e"));
            lblturno.setText("Turn: O");
            s = false;
            contador++;
        }
        else
            {
            btn.setText("O");
            btn.setEnabled(false);
            btn.setTextSize(20);
            btn.setTextColor(Color.parseColor("#1a237e"));
            btn.setBackgroundColor(Color.parseColor("#9e9e9e"));
            lblturno.setText("Turn: X");
            contador++;
            s = true;
        }

        if (ganador == 0 && contador == 9)
        {
            lblwinner.setText("Nadie ganó");
            btnrestart.setVisibility(View.VISIBLE);
        }
    }

    public void ganador()
    {
            if (!btnuno.getText().equals("") && btnuno.getText().equals(btndos.getText()) && btnuno.getText().equals(btntres.getText()))
            {
                btnuno.setBackgroundColor(Color.parseColor("#ffff00"));
                btndos.setBackgroundColor(Color.parseColor("#ffff00"));
                btntres.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btnuno.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btncuatro.getText().equals("") && btncuatro.getText().equals(btncinco.getText()) && btncuatro.getText().equals(btnseis.getText()))
            {
                btncuatro.setBackgroundColor(Color.parseColor("#ffff00"));
                btncinco.setBackgroundColor(Color.parseColor("#ffff00"));
                btnseis.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btncuatro.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btnsiete.getText().equals("") && btnsiete.getText().equals(btnocho.getText()) && btnsiete.getText().equals(btnnueve.getText()))
            {
                btnsiete.setBackgroundColor(Color.parseColor("#ffff00"));
                btnocho.setBackgroundColor(Color.parseColor("#ffff00"));
                btnnueve.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btnsiete.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btnuno.getText().equals("") && btnuno.getText().equals(btncuatro.getText()) && btnuno.getText().equals(btnsiete.getText()))
            {
                btnuno.setBackgroundColor(Color.parseColor("#ffff00"));
                btncuatro.setBackgroundColor(Color.parseColor("#ffff00"));
                btnsiete.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btnuno.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btndos.getText().equals("") && btndos.getText().equals(btncinco.getText()) && btndos.getText().equals(btnocho.getText()))
            {
                btndos.setBackgroundColor(Color.parseColor("#ffff00"));
                btncinco.setBackgroundColor(Color.parseColor("#ffff00"));
                btnocho.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btndos.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btntres.getText().equals("") && btntres.getText().equals(btnseis.getText()) && btntres.getText().equals(btnnueve.getText()))
            {
                btntres.setBackgroundColor(Color.parseColor("#ffff00"));
                btnseis.setBackgroundColor(Color.parseColor("#ffff00"));
                btnnueve.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btntres.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btnuno.getText().equals("") && btnuno.getText().equals(btncinco.getText()) && btnuno.getText().equals(btnnueve.getText()))
            {
                btnuno.setBackgroundColor(Color.parseColor("#ffff00"));
                btncinco.setBackgroundColor(Color.parseColor("#ffff00"));
                btnnueve.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btnuno.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();
            }

            if (!btnsiete.getText().equals("") && btnsiete.getText().equals(btncinco.getText()) && btnsiete.getText().equals(btntres.getText()))
            {
                btnsiete.setBackgroundColor(Color.parseColor("#ffff00"));
                btncinco.setBackgroundColor(Color.parseColor("#ffff00"));
                btntres.setBackgroundColor(Color.parseColor("#ffff00"));
                ganador = 1;
                winner = btnsiete.getText().toString();
                lblwinner.setText("You win " + winner);
                deshabilitar();

            }
    }

    public void deshabilitar()
    {
        btnrestart.setVisibility(View.VISIBLE);
        btnuno.setEnabled(false);
        btndos.setEnabled(false);
        btntres.setEnabled(false);
        btncuatro.setEnabled(false);
        btncinco.setEnabled(false);
        btnseis.setEnabled(false);
        btnsiete.setEnabled(false);
        btnocho.setEnabled(false);
        btnnueve.setEnabled(false);
    }

    public void restart()
    {
        s = false;
        ganador = 0;
        contador = 0;
        lblturno.setText("Turn:");
        lblwinner.setText("Winner:");
        btnuno.setEnabled(true);
        btndos.setEnabled(true);
        btntres.setEnabled(true);
        btncuatro.setEnabled(true);
        btncinco.setEnabled(true);
        btnseis.setEnabled(true);
        btnsiete.setEnabled(true);
        btnocho.setEnabled(true);
        btnnueve.setEnabled(true);
        btnuno.setBackgroundColor(Color.parseColor("#EDEDED"));
        btndos.setBackgroundColor(Color.parseColor("#EDEDED"));
        btntres.setBackgroundColor(Color.parseColor("#EDEDED"));
        btncuatro.setBackgroundColor(Color.parseColor("#EDEDED"));
        btncinco.setBackgroundColor(Color.parseColor("#EDEDED"));
        btnseis.setBackgroundColor(Color.parseColor("#EDEDED"));
        btnsiete.setBackgroundColor(Color.parseColor("#EDEDED"));
        btnocho.setBackgroundColor(Color.parseColor("#EDEDED"));
        btnnueve.setBackgroundColor(Color.parseColor("#EDEDED"));
        btnuno.setText("");
        btndos.setText("");
        btntres.setText("");
        btncuatro.setText("");
        btncinco.setText("");
        btnseis.setText("");
        btnsiete.setText("");
        btnocho.setText("");
        btnnueve.setText("");
    }

}
