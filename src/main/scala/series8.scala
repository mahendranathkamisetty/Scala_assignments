object series8 {
  def main(args:Array[String]): Unit = {
    for(i<-1 to 36 by 1){
      if(i%2!=0){
        print(i)
      }
      else{
        print(",even,")
      }
    }
  }

}
