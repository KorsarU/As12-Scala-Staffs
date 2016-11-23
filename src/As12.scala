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
    println(a + " " + b(4));

    def twice(op: Double => Double, x: Double) = op(op(x));
    var output = twice(_+1, 5);
    println(output);

    var assertionEnable = true;

    def myAssertWithPre(predicate: () => Boolean) =
      if(assertionEnable && !predicate())
        throw new AssertionError;

    def myAssertWithOut(predicate: => Boolean) = //calculate boolean in function
      if(assertionEnable && !predicate)
        throw new AssertionError;

    def myAssertExampleThree(predicate: Boolean) = //calculate before call
      if(assertionEnable && !predicate)
        throw new AssertionError;

    var ok = (x:Int, y: Int) => myAssertWithPre(()=> x/y < 0.5);
    var notOk = (x: Int, y: Int) => myAssertWithOut(x/y < 0.5);

    def myWhile(predicate: () => Boolean)(action: () => AnyVal) =
      if(predicate())
        action();

    var test = (x: Int) => myWhile(() => x >= 0)(() => {
      print(x+ " ");
      x = x-1;
    });
  }
}
