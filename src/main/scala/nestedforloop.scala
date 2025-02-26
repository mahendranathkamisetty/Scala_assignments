object nestedforloop {
  def main(args:Array[String]): Unit = {
    for(i<-1 to 3){
      print(s"outer loop${i}: ")
      for(j<-1 to 2){
        println(s"inner loop${j}, ")
      }
      println()
    }
  }

}
