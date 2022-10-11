package com.example.unacalculadora;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends Activity {

    private AppBarConfiguration appBarConfiguration;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float resulta = 0.0f;
    boolean igual =false;
    String operacion = "";
    Button boton;
    TextView ResultadoFinal;
    Double resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ResultadoFinal = findViewById(R.id.mostrarResultadod);
        //System.out.println(Integer.parseInt(resultado.toString()));

    }

    public void escribir7(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("7");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "7");
        }
    }

    public void escribir8(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("8");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "8");
        }
    }

    public void escribir9(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("9");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "9");
        }
    }

    public void escribir4(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("4");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "4");
        }
    }

    public void escribir5(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("5");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "5");
        }
    }

    public void escribir6(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("6");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "6");
        }
    }

    public void escribir3(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("3");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "3");
        }
    }

    public void escribir2(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("2");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "2");
        }
    }

    public void escribir1(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("1");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "1");
        }
    }

    public void escribir0(View vista) {
        float valor = Float.parseFloat(ResultadoFinal.getText().toString());
        if (valor == 0.0) {
            ResultadoFinal.setText("0");
        } else {
            ResultadoFinal.setText(ResultadoFinal.getText() + "0");
        }
    }

    public void resetear(View vista) {
        ResultadoFinal.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void operacionDividir(View vista) {
         numero1 = Float.parseFloat(ResultadoFinal.getText().toString());
        ResultadoFinal.setText("0");
        operacion = "/";

        }
    public void operacionSumar(View vista) {
        numero1 = Float.parseFloat(ResultadoFinal.getText().toString());
        ResultadoFinal.setText("0");
        operacion = "+";

    }
    public void operacionRestar(View vista) {
        numero1 = Float.parseFloat(ResultadoFinal.getText().toString());
        ResultadoFinal.setText("0");
        operacion = "-";

    }
    public void operacionMultiplicar(View vista) {
        numero1 = Float.parseFloat(ResultadoFinal.getText().toString());
        ResultadoFinal.setText("0");
        operacion = "*";

    }

    public void accionarIgual(View vista) {
        float valor2 = Float.parseFloat(ResultadoFinal.getText().toString());
    if (operacion.equals("/")){
        if (valor2==0.0f){
            Toast.makeText(this,"Operacion no valida",Toast.LENGTH_SHORT).show();
        }else{
            double restul = numero1 / valor2;
            BigDecimal bd = new BigDecimal(restul).setScale(2, RoundingMode.HALF_UP);
            restul = bd.doubleValue();  //EL BIG DECIMAL ES PARA REDOndEAR A DOS DECIMALES
            ResultadoFinal.setText(restul+"");
        }}
        if (operacion.equals("+")){
            float restul = numero1 + valor2;
            BigDecimal bd = new BigDecimal(restul).setScale(2, RoundingMode.HALF_UP);
            restul = bd.floatValue();  //EL BIG DECIMAL ES PARA REDOndEAR A DOS DECIMALES
            ResultadoFinal.setText(restul+"");
        }
        if (operacion.equals("-")){
            double restul = numero1 - valor2;
            BigDecimal bd = new BigDecimal(restul).setScale(2, RoundingMode.HALF_UP);
            restul = bd.doubleValue();  //EL BIG DECIMAL ES PARA REDOndEAR A DOS DECIMALES
            ResultadoFinal.setText(restul+"");
        }
        if (operacion.equals("*")){
            double restul = numero1 * valor2;
            BigDecimal bd = new BigDecimal(restul).setScale(2, RoundingMode.HALF_UP);
            restul = bd.doubleValue();  //EL BIG DECIMAL ES PARA REDOndEAR A DOS DECIMALES
            ResultadoFinal.setText(restul+"");
        }


    }
}