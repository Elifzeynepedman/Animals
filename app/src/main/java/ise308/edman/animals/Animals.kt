package ise308.edman.animals

import android.util.Log

open class Animals(open var Name: String, var Color: String) {//primary constructor

    var breathingStyle: String= ""

            constructor( Name: String,Color: String, breathingStyle: String ): this(Name,Color) //secondary constructor
            {
                this.breathingStyle=breathingStyle
            }
            init
            {
                Log.i(TAG, ": $Name 's color is $Color.")
            }

   fun getBreathStyle(origin:String)
   {
       val animalsLocation: AnimalsLocation= AnimalsLocation()
       val style= animalsLocation.getLocation(breathingStyle)

       if(style==breathingStyle)
       {
           Log.i(TAG, "getBreathStyle: $Name with the $Color skin breathes in through lungs ")
       }
       else if( style!=breathingStyle)
       {
           Log.i(TAG, "getBreathStyle: $Name with the $Color skin breathes through gill membranes")
       }
   }

    open fun getAge(age: Int){ // an animal can have a whole age or half an age there for there needs to be a function over load
        Log.i(TAG, "getAge: Every animal has an age")
    }

     open fun  getAge(age: Double)
     {
         Log.i(TAG, "getAge: Every animal can have half an age for example 2.5 years old")
     }
    companion object {
        const val TAG = " Animals "
    }

}