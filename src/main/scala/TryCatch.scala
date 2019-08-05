class TryCatch {

  def tryCatch = {

    val people = List(
      "Bill",
      "Candy",
      "Karen",
      "Leo",
      "Regina"
    )
    // Trying to access element outside range without try/block. Code will fail
    println(people(6))

    // Trying to access element outside range inside try/block. Code won't fail
    try {
        println(people(6))
      }
    catch{
      case e: IndexOutOfBoundsException => println("index")
      case _: Throwable => println("error in printing")
    }
  } // End of TryCatch
}
