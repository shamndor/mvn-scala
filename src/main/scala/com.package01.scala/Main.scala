 package com.package01.scala  
object Main{

/*
*this count funtion
*@params str: string represent the input string we are going to count its word
*@return integer represent number of word in the input string

*/
def wordCount(str:String):Int = {
    str match{
        case emp if isEmpty(emp) => 0 
          
        case input=> input.split("\\W+").length
    }
     
}

def isEmpty(str:String) = str == null || str.trim.isEmpty

 
  
}