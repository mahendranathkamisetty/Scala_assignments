object numberCheck {
  def main(args:Array[String]): Unit = {
    val number=90
    if(number<0 || number>100) {
      println("Invalid input")
    }
     else
      {
        if (number > 90 && number <= 100) {
          println("Super Smart")
        }
        if(number>80 && number<=90){
          println("Smart")
        }
        if(number>70 && number<=80){
          println("smart enough")
        }
        if(number>60 && number<=70){
          println("just smart")
        }
        if(number>35 && number<=60){
          println("no smart")
        }
        if(number>0 && number<=35){
          println("dump")
        }
      }
  }

}
