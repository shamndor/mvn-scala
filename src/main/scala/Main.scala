 

object Main{

def wordCount(str:String):Int = {
    str match{
        case emp if isEmpty(emp) => 0
        case emp if emp=="-1" => -1
        case str=> str.split("\\W+").length
    }
     
}

def isEmpty(str:String) = str == null || str.trim.isEmpty

 
  
}