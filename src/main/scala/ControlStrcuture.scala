class ControlStrcuture {

  def forLoop = {
    println("Looping Through List of Integer")
    val nums = List(1,2,3)
    for (n <- nums) println(n)

    println("Looping Through List of Strings")
    val people = List(
      "Bill",
      "Candy",
      "Karen",
      "Leo",
      "Regina"
    )
    for ( p <- people) println(p)
    // Converting List of String to List [String,Int]
    var newpeople = people.map( elem => ( elem, elem.length)).toList
    newpeople.sortBy(_._2)

  } // End of For loop

  def forExpression = {
    println("For Expression will be adding soon")
    val nums = Seq(1,2,3)
    val makeDouble = for (n <- nums) yield n * 2

    var names = List("adam", "david", "frank")
    var capNames = for (name <- names) yield name.capitalize

    names = List("_adam", "_david", "_frank")
    capNames = for (name <- names) yield {
      val nameWithoutUnderscore = name.tail
      val capName = nameWithoutUnderscore.capitalize
      capName
    }
    // short version
    capNames = for (name <- names) yield name.tail.capitalize
  }


}
