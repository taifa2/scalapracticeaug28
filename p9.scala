

object Demo {



  def main(args: Array[String]) {



     println( "Returned Value : " + addInt(5,7) );

println( "Returned Value : " + multiplyint(5,7) );
println( "Returned Value : " + divInt(14,7) );



  } ;



  def addInt( a:Int, b:Int ) : Int = {



     var sum:Int = 0



     sum = a + b  ;    return sum



  }





  def multiplyint( a:Int, b:Int ) : Int = {



     var mul:Int = 0



     mul = a * b  ;    return mul

  }








  def divInt( a:Int, b:Int ) : Int = {



     var div:Int = 0



     div = a / b  ;    return div

  }

}





