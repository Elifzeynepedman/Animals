package ise308.edman.animals

import android.util.Log

class Giraffe(Name: String, Color: String) : Animals(Name, Color) {
    var neckLength: Int =6 // additional property of child class giraffe
    override fun getAge(age: Int) {
        Log.i(TAG, "getAge: A giraffe can live upto 26 years")
    }
    override fun getAge(age: Double) {
        Log.i(TAG, "getAge: A fish can live up to 12 to 70 years")
    }
    init {
        Log.i(TAG, ": The neck length of $Name is $neckLength feet tall")
    }
    companion object {
        const val TAG = " Animals "
    }
}