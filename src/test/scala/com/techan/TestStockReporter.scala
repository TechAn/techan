package com.techan

import org.scalatest.FunSuite

class TestScalaReporter extends FunSuite {
  
  test("test the loadStocks method") {
	val stocks = StockReporter.loadQuotes
	assert(stocks.length == 2)
  }

  test("test the getStocks method") {
	assert(StockReporter.getStocks("MYSTK").length == 1)
	assert(StockReporter.getStocks("nostocks").length == 0)
	
  }
  
  
}