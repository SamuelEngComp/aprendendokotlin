package br.com.aprendendoandroidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butaoTelaInicial = findViewById<Button>(R.id.btn_01)
        butaoTelaInicial.setOnClickListener{
            IrParaTelaDeSelecao()
        }

    }

    private fun IrParaTelaDeSelecao() {
        val telaDeSelecao = Intent(this, TelaSelecao::class.java)
        startActivity(telaDeSelecao)
    }
}