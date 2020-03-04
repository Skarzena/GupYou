package com.ctbarbanza.gupyou;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.orhanobut.hawk.Hawk;

public class WallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_wall);
    }

    /*
    * Pese a llevar dos tardes no he conseguido que funcione.
    *
    * Pasos que debería seguir para que la aplicación muestre un muro con todos lo contactos y se pueda
    * acceder al perfil de cada uno de ellos:
    *
    * 1- Se pone un botón en alguna parte de la aplicación que nos lleve al Activity donde se muestre
    *   el muro con todos los usuarios guardados.
    *
    * 2- Saber el total de usuarios que hay en la aplicación:
    *   Para ello se usa la clase UserController, que con su método getAllUsers() devuelve un List con todos los usuarios,
    *   se recorre el list y por cada usuario se genera en el act_wall.xml una nueva línea con los datos de ese usuario;
    *   act_wall.xml muestra un ejemplo de cómo quedaría; de cada usuario recogemos su imagen y su nombre para añadirlo al XML.
    *
    * 3- Una vez se muestren todos los contactos en el muro habrá que hacer un Listener que al hacer click en
    *   la imagen de perfil del usuario (ImageButton) nos lleve a su perfil personal.
    *
    * */

}
