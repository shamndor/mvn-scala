 

object Main{

def wordCount(str:String):Int = {
    str match{
        case emp if isEmpty(emp) => 0      
        case input=> input.split("\\W+").length
    }
     
}

def isEmpty(str:String) = str == null || str.trim.isEmpty

 
  
}