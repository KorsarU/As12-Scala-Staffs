/**
  * Created by Master on 22-Nov-16.
  */
class Main {

  def main(args: Array[String]): Unit = {
    print("Hello")
  }

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

  def trivialSum(x: Int, y: Int) = x + y;


}
