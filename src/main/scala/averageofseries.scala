object averageofseries {
  def main(args:Array[String]): Unit = {
    var sum=0
    var count=0
    for(i<-24 to 100 by 2){
      sum=sum+i
      count=count+1
    }
    println("sum= " +sum)
    println("Count= " +count)
    val avg=sum/count
    print("average= " + avg)

  }

}
