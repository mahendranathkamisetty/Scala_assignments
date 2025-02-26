object series9 {
  def main(args:Array[String]): Unit = {
    for(i<-1 to 24 by 1){
      if(i%3!=0){
        print(s"${i},")
      }
      else{
        print("factor of three,")
      }
    }
  }

}
