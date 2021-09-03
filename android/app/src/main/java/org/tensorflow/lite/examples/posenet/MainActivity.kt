package org.tensorflow.lite.examples.posenet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun passToFitness(view: View) {startActivity(Intent(this, FitnessActivity::class.java))}
    fun passToWorkout(view: View) {startActivity(Intent(this, WorkoutActivity::class.java))}
}