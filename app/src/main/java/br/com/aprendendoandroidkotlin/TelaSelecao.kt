package br.com.aprendendoandroidkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity



class TelaSelecao : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_selecao)

        validarBotaoSeRadioSelecionado(false)

    }

    private fun IrParaTelaDeInserirDados() {
        val telaDeInserirDados = Intent(this, TelaInserirDados::class.java)
        startActivity(telaDeInserirDados)
    }

    private fun radioClicado(){

        val radioUm = findViewById<RadioButton>(R.id.valorRadioUm)
        val radioDois = findViewById<RadioButton>(R.id.valorRadioDois)
        radioDois.isChecked = true


        println(" --------------------------------- ")
        println("Radio Um: " + radioUm)
        println("Radio Dois: " + radioDois)
        println(" --------------------------------- ")
        println("Radio Um: " + radioUm.isChecked)
        println("Radio Dois: " + radioDois.isChecked)
        println(" --------------------------------- ")
        println("Radio Um: " + radioUm.isSelected)
        println("Radio Dois: " + radioDois.isSelected)


        validarBotaoSeRadioSelecionado(true)





    }

    private fun validarBotaoSeRadioSelecionado(ativaDesativaBotao: Boolean){

        // quando acessar essa tela na primeira vez, o botão estara desabilitado
        val botaoTelaSelecao = findViewById<Button>(R.id.btn_nome_numero)
        botaoTelaSelecao.isEnabled = ativaDesativaBotao

        if(botaoTelaSelecao.isEnabled){
            botaoTelaSelecao.setOnClickListener{
                IrParaTelaDeInserirDados()
            }
        }else{
            onStart()
        }



    }

    /*
    override fun onStart() {
        super.onStart()
        radioClicado()
    }*/
}






















