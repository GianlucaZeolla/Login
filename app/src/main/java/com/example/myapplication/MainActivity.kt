package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edit_usuario : EditText
    private lateinit var edit_contraseña : EditText

    private lateinit var btn_aceptar : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




            edit_usuario = findViewById(R.id.edit_usuario)
            edit_contraseña = findViewById(R.id.edit_contraseña)

            /*La "R" es la carpeta de recursos*/
            /*va a la carpeta de recursos a buscar el id - R.id - */

            btn_aceptar = findViewById(R.id.btn_aceptar)

        btn_aceptar.setOnClickListener{
            val intent: Intent = Intent(this, Bienvenida_activity::class.java)
            intent.putExtra("user", "gianluca")
            intent.putExtra("password", "1234")
            startActivity(intent)


        }
    }
}