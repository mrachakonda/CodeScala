import scala.io.StdIn.readLine
object ReadInput extends App {

  print("Enter your first name: ")
  val firstName = readLine()
  print("Enter your last name: ")
  val lastName = readLine()
  println(s"Your name is $firstName $lastName")


}