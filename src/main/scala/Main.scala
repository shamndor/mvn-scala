 

object Main{

def wordCount(str:String):Int = {
    str match{
        case emp if isEmpty(emp) => 0
        case str=> str.split("\\W+").length
    }
     println("Scala Sandbox Fail")
}

def isEmpty(str:String) = str == null || str.trim.isEmpty

 
  
}