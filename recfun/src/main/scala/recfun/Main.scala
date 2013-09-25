package recfun

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0) 0
    else if (c > r) 0
    else {
      if (r < 0) 0
      else if (r == 0) 1
      else {
        val r1 = r - 1
        pascal(c - 1, r1) + pascal(c, r1)
      }
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def count(chList: List[Char], cnt: Int): Int = {
      if (cnt < 0 || chList.isEmpty) cnt
      else {
        if (chList.head == '(')
          count(chList.tail, cnt + 1)
        else if (chList.head == ')')
          count(chList.tail, cnt - 1)
        else
          count(chList.tail, cnt)
      }
    }

    0 == count(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    //    if (money <= 0) 0
    //    else if (coins.isEmpty) 0
    //    else {
    //      val h: Int = coins.head
    //      val t: List[Int] = coins.tail
    //      var count = 0
    //      for (i <- 0 to (money / h)){
    //        count += countChange
    //      }
    //
    //      (money / h)
    //    }
    0
  }
}