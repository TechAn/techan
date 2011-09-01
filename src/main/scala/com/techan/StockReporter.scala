package com.techan

object StockReporter {
  
  val usage = "Usage: stockShortCode"
    
  def main(args: Array[String]) {
		
    if (args.length == 0) println(usage)
    
    for (a <- args) a match {
      case "MYSTK" =>
        println("My Stock")
      case "ANYSTK" =>
        println("Any Stock")
      case x =>
        println("Unknown stock " + x )
    }
 
  }
  
}