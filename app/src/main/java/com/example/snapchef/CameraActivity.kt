package com.example.snapchef

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import com.example.snapchef.R
import com.example.snapchef.RecipeListActivity
import java.util.ArrayList

class CameraActivity : AppCompatActivity() {

    private lateinit var previewView: PreviewView
    private var imageCapture: ImageCapture? = null
    private lateinit var cameraExecutor: ExecutorService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        previewView = findViewById(R.id.previewView)
        val btnCapture = findViewById<FloatingActionButton>(R.id.btnCapture)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)

        cameraExecutor = Executors.newSingleThreadExecutor()

        startCamera()

        btnCapture.setOnClickListener {
            captureImage()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun startCamera() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)

        cameraProviderFuture.addListener({
            val cameraProvider = cameraProviderFuture.get()

            val preview = Preview.Builder()
                .build()
                .also {
                    it.setSurfaceProvider(previewView.surfaceProvider)
                }

            imageCapture = ImageCapture.Builder()
                .build()

            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

            try {
                cameraProvider.unbindAll()
                cameraProvider.bindToLifecycle(
                    this, cameraSelector, preview, imageCapture
                )
            } catch (exc: Exception) {
                Toast.makeText(this, "Failed to start camera", Toast.LENGTH_SHORT).show()
            }

        }, ContextCompat.getMainExecutor(this))
    }

    private fun captureImage() {
        // Simulate image capture and ingredient detection
        Toast.makeText(this, "Analyzing ingredients...", Toast.LENGTH_SHORT).show()

        // In a real app, you would:
        // 1. Capture the image
        // 2. Send it to an ML model or API
        // 3. Get detected ingredients
        // For now, we'll use mock data

        android.os.Handler(mainLooper).postDelayed({
            val detectedIngredients = arrayListOf("Tomatoes", "Pasta", "Garlic", "Basil")

            val intent = Intent(this, RecipeListActivity::class.java)
            intent.putStringArrayListExtra("ingredients", detectedIngredients)
            startActivity(intent)
            finish()
        }, 1500)
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraExecutor.shutdown()
    }
}