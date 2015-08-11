object FizzBuzz {
  def main(args: Array[String]){
    (for(i <- (0 to 100)) yield (i%3, i%5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case (_, _) => i.toString
    }).foreach(println)
  }
}
