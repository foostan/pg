object FizzBuzz {
  def main(args: Array[String]){
    (0 to 100).foreach { i =>
      println((if(i%3==0){"Fizz"}else{""}) + (if(i%5==0){"Buzz"}else{""}) match {
        case "" => i
        case x => x
      })
    }
  }
}
