/**
  * Created by Master on 22-Nov-16.
  */
object As12 {
  def main(args: Array[String]): Unit = {

    print("Hello")
    var more = 9;
    more = 10;
    def makeMultiplier(x: Int) = x*more;
    println(makeMultiplier(10));

    def cutter(p: Int) = (x: Int) => if(p<x)p else x;
    val cut = cutter(100);
    var threshold = 50;
    println(cut(threshold));
    threshold = 150;
    println(cut(threshold));

    def remover(p: Int) = (x: Int) => p<x;
    val rem = remover(100);
    threshold = 50;
    println(rem(threshold));
    threshold = 150;
    println(rem(threshold));

    val list = List.range(-10,11);
    var limit = 5;
    val cutS = cutter(limit);
    val mul = (x: Int) => makeMultiplier(cutS(x));
    var sum = 0;
    for(l <- list)println(mul(Math.abs(l)))
    println(list)

    def trivialSum(x: Int, y: Int) = x + y;

  }
}
