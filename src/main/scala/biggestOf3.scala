object biggestOf3 {
  def main(args:Array[String]): Unit = {
    var a=10
    var b=30
    var c=20
    if(a>b && a>c){
      print("a is bigger")
    }
    else if(b>a && b>c){
      print("b is bigger")
    }
    else{
      print("c is bigger")
    }
  }

}
