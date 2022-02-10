package com.cursoappkotlin.fotosbootcamp

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.content.contentValuesOf
import kotlinx.android.synthetic.main.activity_main.*
import java.security.Permission
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    var image_uri: Uri? = null

    companion object{
        private val PERMISSION_CODE_IMAGE_PICK = 1000
        private val IMAGE_PICK_CODE = 1001

        private val PERMISSION_CODE_CAMERA_CAPTURE = 2000
        private val OPEN_CAMERA_CODE = 2001
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pick_button.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if (checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                    val permission = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE)
                    requestPermissions(permission,PERMISSION_CODE_IMAGE_PICK)
                }
                else{
                    pickImageFromGallery()
                }
            }
            else{
                pickImageFromGallery()
            }
        }
        
        open_camera_button.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if (checkSelfPermission(android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED ||
                  checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                    val permissions = arrayOf(android.Manifest.permission.CAMERA,
                                                            android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    requestPermissions(permissions,PERMISSION_CODE_CAMERA_CAPTURE)
                }
                else{
                    openCamera()
                }
            }
            else{
                openCamera()
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<out String>,
                                            grantResults: IntArray) {
          when (requestCode){
              PERMISSION_CODE_IMAGE_PICK -> {
                  if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                      pickImageFromGallery()
                  }
                  else{
                      Toast.makeText(this,"Permissão Negada",Toast.LENGTH_SHORT).show()
                  }
              }
              PERMISSION_CODE_CAMERA_CAPTURE -> {
                  if (grantResults.size > 1 &&
                      grantResults[0] == PackageManager.PERMISSION_GRANTED &&
                      grantResults[1] == PackageManager.PERMISSION_GRANTED){
                      openCamera()
                  }
                  else{
                      Toast.makeText(this,"Permissão Negada",Toast.LENGTH_SHORT).show()
                  }
              }
          }
    }

    private fun openCamera() {
        val values = ContentValues()

        values.put(MediaStore.Images.Media.TITLE,"Nova Foto")
        values.put(MediaStore.Images.Media.DESCRIPTION,"Imagem capturada pela camera")
        image_uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values)

        val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        camera_intent.putExtra(MediaStore.EXTRA_OUTPUT,image_uri)

        startActivityForResult(camera_intent, OPEN_CAMERA_CODE)
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"

        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE){
            image_view.setImageURI(data?.data)
        }
        if (resultCode == Activity.RESULT_OK && requestCode == OPEN_CAMERA_CODE){
            image_view.setImageURI(image_uri)
        }
    }

}
