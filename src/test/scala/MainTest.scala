import org.scalatest._

class MainTest Extends FunSuite {

   test(testName = "happy scanario") {

       assert(Main.wordCount("Hello World") == 2)
   }

  test(testName = "Test Count with Null input") {

       assert(Main.wordCount(null) == 0)
   }
}