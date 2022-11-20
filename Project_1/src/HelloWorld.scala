object HelloWorld {
  def main(args: Array[String]): Unit ={
    //String Interpolation
    val name = "mark"
    val age = 18.5
    println(name +" is "+ age + " years old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%f years old")
    println(s"Hello \nWorld")
    println(raw"Hello \nWorld")
  }

}
