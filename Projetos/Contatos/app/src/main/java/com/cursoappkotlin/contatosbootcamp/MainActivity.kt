package com.cursoappkotlin.contatosbootcamp

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    val REQUEST_CONTACT = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ActivityCompat.checkSelfPermission(this,Manifest.permission.READ_CONTACTS)
            != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.READ_CONTACTS),
                REQUEST_CONTACT)
        }else{
            setContacts()
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<out String>,
                                            grantResults: IntArray) {

        if (requestCode == REQUEST_CONTACT) setContacts()

    }

    private fun setContacts() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
