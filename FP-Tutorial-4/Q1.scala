def calculateInterest(Amount: Double): Double = {

    var actualInterest: Double =0;

    if (Amount<20001) {actualInterest=Amount*0.02}
    else if (Amount<200001) {actualInterest=Amount*0.04}
    else if (Amount<2000001) {actualInterest=Amount*0.035}
    else {actualInterest=Amount*0.065}
    actualInterest
  }

def main(args: Array[String]): Unit = {
      println("Enter amount you wish to deposit:")
      val amount = scala.io.StdIn.readDouble()

      println("Your amount is : " + amount)

      
      val ActualAmountofInterest = calculateInterest(amount)
      println("Your Actual Amount of Interest is : " + ActualAmountofInterest)
    }