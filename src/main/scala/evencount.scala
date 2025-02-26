object evencount {
  def main(args:Array[String]): Unit = {
    var count=0
    for(i<- 50 to 200){
      if(i%2==0){
        count=count+1
      }
    }
    print(count)
  }

}
