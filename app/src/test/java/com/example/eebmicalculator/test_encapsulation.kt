package com.example.eebmicalculator

class test_encapsulation {
      private var name:String = "Android"
//    for getting or accessing the name only we use get.
    fun getName():String{
        return name
    }
//    for setting or modifying the name  we use set.
    fun setName(input:String){
        this.name = input
    }

//    var name:String="hi"
//        private set

}
//If an external user can Access and modifies our privte class then it is said to be loosly encapsulated.
//If an external user can Access  our privte class then it is said to be tightly encapsulated.