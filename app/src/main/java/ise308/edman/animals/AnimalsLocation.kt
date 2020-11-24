package ise308.edman.animals

import java.security.KeyStore

class AnimalsLocation {
    val location: Array<String> = arrayOf("Land","Water")
   // Sea", "Desert", "Savannah", "Arctic", "Farm", "Jungle


    fun getLocation(origin: String): String{
        if(origin=="Land")
        {
            return "animal lives on land"
        }
        else
        {
            return "animal lives in Water"
        }
    }

}