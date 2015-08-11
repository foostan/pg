object FizzBuzz {
  def main(args: Array[String]){
    (0 to 100).foreach { i =>
      println(
        (i%3, i%5) match {
          case (0, 0) => "FizzBuzz"
          case (0, _) => "Fizz"
          case (_, 0) => "Buzz"
          case (_, _) => i.toString
        }
      )
    }
  }
}
