 object PrintOptions {
   def main(args: Array[String]) =
     println("Выбраны опции:" +: (args filter (_ startsWith "-") map (" " + _.drop(1))) mkString "\n")
 }