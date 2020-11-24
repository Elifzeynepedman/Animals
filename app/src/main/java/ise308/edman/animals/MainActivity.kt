package ise308.edman.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textclassifier.TextClassifierEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

private fun animalInformation()
{
    var goldFish=Fish(Name="Nemo", Color= "orange.")
    goldFish.getBreathStyle(origin="Water")

    var northernGiraffe=Giraffe(Name = "Giraffey", Color= "Orange")
    northernGiraffe.getBreathStyle(origin="Land")
}
}