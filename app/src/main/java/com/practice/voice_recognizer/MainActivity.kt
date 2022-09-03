package com.practice.voice_recognizer

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.*

private val permissions : Array<String> = arrayOf(
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkPermissions()
    }

    private fun checkPermissions(): Boolean {
        val requiredPermissions = ArrayList<String>()
        for (p in permissions)
            if (ContextCompat.checkSelfPermission(this, p)
                    != PackageManager.PERMISSION_GRANTED)
                requiredPermissions.add(p)
        return if (requiredPermissions.isNotEmpty()) {
            ActivityCompat.requestPermissions(
                    this,
                    requiredPermissions.toTypedArray(),
                    100
            )
            true
        } else false
    }

}