package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Bienvenida_activity : AppCompatActivity() {

    private lateinit var TextView_nombre : TextView
    private lateinit var TextView_contraseña : TextView
    private lateinit var btn_volver :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        val bundle = intent.extras
        val user = bundle?.getString("user", "gianluca")?: "hola" /*si no es nulo, busca el valor*/
        val password = bundle?.getString("password", "1234")?: "hola1"

        TextView_nombre = findViewById(R.id.TextView_nombre)
        TextView_contraseña = findViewById(R.id.TextView_contraseña)
        btn_volver = findViewById(R.id.btn_volver)

        TextView_nombre.text = user
        TextView_contraseña.text = password

        btn_volver.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity::class.java)


            startActivity(intent)
            finish() /*sin el starActivity y solo el finish, cierra el programa*/

        }
    }
}