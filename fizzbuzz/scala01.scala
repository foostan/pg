object FizzBuzz {
  def main(args: Array[String]){
    (0 to 100).foreach { i =>
      println(if(i % 15 == 0) {
        "FizzBuzz"
      } else if(i % 3 == 0) {
        "Fizz"
      } else if(i % 5 == 0) {
        "Buzz"
      } else {
        i.toString
      })
    }
  }
}
