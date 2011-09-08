package com.techan

object StockReporter {

  val usage = "Usage: stockShortCode"

  def main(args: Array[String]) {

    if (args.length == 0) println(usage)
    else {
      //filter the stock quote list by stock short code
      val matchedStocks = getStocks(args(0)) 
      if (matchedStocks.length != 0)
        matchedStocks.foreach(println)
      else
        println("No match for shortcode " + args(0))
    }
  }
  
  def getStocks(stockName: String) : Array[StockQuote] = {
	loadQuotes.filter(s => s.shortCode.contains(stockName))
  }
  

  def loadQuotes() : Array[StockQuote] = {
    Array(StockQuote("My Stock", "MYSTK", 1.26, 1.24), StockQuote("AnyStock", "ANYSTK", 5.45, 5.43))
 }
}