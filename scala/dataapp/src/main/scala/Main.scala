@main def dataApp() = 

  val numbers:List[Int] = List(10,20,30,20,50)

  println("The head of the list is "+numbers.head)

  println(numbers.indexOf(20))
  numbers.foreach{println}