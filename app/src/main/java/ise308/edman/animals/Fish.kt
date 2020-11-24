package ise308.edman.animals

import android.util.Log

class Fish( Name: String, Color: String) : Animals(Name, Color) {

    var pattern: String="" // additional property of the child class fish
    override var Name="Nemo" // override setter of a property
    override fun getAge(age: Int) { //override a function from parent class
        Log.i(TAG, "getAge: A fish can live up to 12 to 70 years")
    }
    override fun getAge(age: Double) {
        Log.i(TAG, "getAge: A fish can live up to 12 to 70 years")
    }
    init {
        Log.i(TAG, "The gill pattern of $Name is $pattern : ")
    }
    companion object {
        const val TAG = " Animals "
    }
}