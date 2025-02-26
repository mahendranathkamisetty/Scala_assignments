object sumofseries2 {
  def main(args:Array[String]): Unit = {
    var sum=0
    for(i<-5 to 102 by 1){
      sum=sum+(i*i)
    }
    println(sum)
  }

}
