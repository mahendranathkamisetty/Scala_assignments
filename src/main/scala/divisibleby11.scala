object divisibleby11 {
  def main(args:Array[String]): Unit = {
    for(i<- 250 to 550 by 1){
      if(i%11==0){
        println(i)
      }
    }
  }

}
