object series10 {
  def main(args:Array[String]): Unit = {
    for(i<-1 to 25 by 2){
      if(i%5==0){
        print("divisible by 5,")
      }
      else{
        print(s"${i},")
      }

    }
  }

}
