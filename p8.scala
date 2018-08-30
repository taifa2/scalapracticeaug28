object Demo {

  def main(args: Array[String]) {

     println( "Returned Value : " + divInt(30,3) );

  } ;

  def divInt( a:Int, b:Int ) : Int = {

     var div:Int = 0

     div = a / b  ;    return div

  }

}
