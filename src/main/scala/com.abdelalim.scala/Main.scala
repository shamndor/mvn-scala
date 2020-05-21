import  com.abdelalim.scala

object Main{

def wordCount(str:string):Int={
    str match{
        case emp if isEmpty(emp) => 0
        case str=> str.split("\\W+").length
    }
}

def isEmpty(str:string)=> str ==null || str.trim.isEmpty

}