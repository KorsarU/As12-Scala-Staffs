/**
  * Created by Master on 22-Nov-16.
  */
object As12 {
  def main(args: Array[String]): Unit = {

    var more = 9;
    def trivialSum(x: Int, y: Int) = x + y;
    def makeMultiplier(x: Int) = x*more;
    def cutter(p: Int) = (x: Int) => if(p>x)p else x;
    def remover(p: Int) = (x: Int) => p<x;
    val listExternal = List.range(-10,10);
    for(limit <- List(-5,5)) {
      val checker = (list: List[Int]) => {for (l <- list) print(remover(limit)(makeMultiplier(cutter(limit)(l))).toString(){0} + "; "); println();}
      checker(listExternal);
    }

    def sum(a: Int, b: Int, c: Int) = a+b+c;
    var a = sum(1,2,3);
    var b = sum(1,_: Int, 3);
    print(a + " " + b(4));


  }
}
