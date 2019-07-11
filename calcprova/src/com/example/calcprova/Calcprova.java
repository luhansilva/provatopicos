package com.example.calcprova;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.app.*;

public class Calcprova extends Activity {
	TextView mostra, mostra1 = null;
	EditText tempgasto, vel, kmlitro;
	Button botao, bt2;
	double litros, tempo, velocidade, kmlitros, distancia = 0.0;

	public void onCreate(Bundle savedInstanceState) {
		double litros = 0.0;
		super.onCreate(savedInstanceState);
		CarregarTelaPrincipal();
	}

	public void CarregarTelaPrincipal() {
		setContentView(R.layout.activity_calcprova);

		tempgasto = (EditText) findViewById(R.id.tempgasto);
		vel = (EditText) findViewById(R.id.vel);
		kmlitro = (EditText) findViewById(R.id.kmporlit);
		botao = (Button) findViewById(R.id.botao);

		botao.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				tempo = Double.parseDouble(tempgasto.getText().toString());
				velocidade = Double.parseDouble(vel.getText().toString());
				kmlitros = Double.parseDouble(kmlitro.getText().toString());
				distancia = tempo * velocidade;
				litros = distancia / kmlitros;

				CarregarTela2();

			}
		});
	}

	public void CarregarTela2() {
		setContentView(R.layout.telaresult);
		bt2 = (Button) findViewById(R.id.bt2);
		mostra = (TextView) findViewById(R.id.mostra);
		mostra1 = (TextView) findViewById(R.id.mostra1);
		mostra.setText("A distância percorrida: " + distancia + "km");
		mostra1.setText("Quantidade de litros gastos: " + litros + " litros");

		bt2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				CarregarTelaPrincipal();

			}
		});
	}

	/*
	 * protected void onCreate(Bundle savedInstanceState) {
	 * super.onCreate(savedInstanceState); Carregartelaprincipal();
	 * 
	 * }
	 * 
	 * public void Carregartelaprincipal () {
	 * setContentView(R.layout.activity_calcprova); tempgasto = (EditText)
	 * findViewById(R.id.tempgasto); vel = (EditText) findViewById(R.id.vel);
	 * kmlitro = (EditText) findViewById(R.id.kmporlit);
	 * 
	 * Button btcalc = (Button) findViewById(R.id.botao);
	 * 
	 * double tempo = Double.parseDouble(tempgasto.getText().toString()); double
	 * velocidade = Double.parseDouble(vel.getText().toString()); double
	 * kmlitros = Double.parseDouble(kmlitro.getText().toString());
	 * 
	 * double distancia = tempo*velocidade; double litros = distancia/kmlitros;
	 * 
	 * btcalc.setOnClickListener(new View.OnClickListener() {
	 * 
	 * @Override public void onClick(View arg0) { CarregarTela2();
	 * 
	 * } }); }
	 * 
	 * 
	 * public void CarregarTela2(){ setContentView(R.layout.telaresult); bt2 =
	 * (Button) findViewById (R.id.bt2); bt2.setOnClickListener(new
	 * View.OnClickListener() {
	 * 
	 * @Override public void onClick(View v) { Carregartelaprincipal();
	 * 
	 * } }); }
	 */

	/*
	 * btcalc.setOnClickListener(new View.OnClickListener() {
	 * 
	 * @Override public void onClick(View arg0) { double tempo =
	 * Double.parseDouble(tempgasto.getText().toString()); double velocidade =
	 * Double.parseDouble(vel.getText().toString()); double kmlitros =
	 * Double.parseDouble(kmlitro.getText().toString());
	 * 
	 * double distancia = tempo*velocidade; double litros = distancia/kmlitros;
	 * 
	 * txtresp.setText("A distância percorrida: " +distancia);
	 * 
	 * AlertDialog.Builder dialogo = new AlertDialog.Builder(Calcprova.this);
	 * 
	 * dialogo.setTitle("Resultados");
	 * 
	 * dialogo.setMessage("A distância percorrida: " + distancia);
	 * 
	 * dialogo.setNeutralButton("OK", null);
	 * 
	 * dialogo.show();
	 * 
	 * }
	 * 
	 * });
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calcprova, menu);
		return true;
	}

}
