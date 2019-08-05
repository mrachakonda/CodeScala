import scala.collection.mutable.ArrayBuffer
object WorkingArrayBuffer extends App{
  val ints = ArrayBuffer[Int]()
  ints += 1
  ints += 2
  println(ints)
  ints -= 2
  println(ints)
  ints.insert(1,8)
  println(ints)
}
