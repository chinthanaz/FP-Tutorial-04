def main(args: Array[String]): Unit = {
  println("Enter your Int:")
  val Intval = scala.io.StdIn.readInt()
  val Intval2 = Intval.toString

  println("You Entered Int is: " + Intval)

  Intval2 match {
    case _ if Intval2.head == '-' => println("It is a negative value")
    case "0" => println("It is Zero")
    case _ if Intval2.last=='1'||Intval2.last=='3'||Intval2.last=='5'||Intval2.last=='7'||Intval2.last=='9' => println("It is an odd value")
    case _ if Intval2.last=='0'||Intval2.last=='4'||Intval2.last=='6'||Intval2.last=='8'||Intval2.last=='0' => println("It is an even value")
    case _ => println("Your value is not in the scope")
  }
}
