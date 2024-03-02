/*
* Author: Nikoloz Robakidze
* Date: 2 Feb 2024
* Description: Making Science | Sweeft Acceleration Program / Android II Step task
*/

package robakidze.nikoloz

import robakidze.nikoloz.tasks.*

fun main() {

    // Task 1

    println("--- Task 1 start ---")

    val numbs = arrayOf(4, 1, 2, 1, 2)
    val foundNumber = FirstTask().singleNumber(numbs)

    println("Result: $foundNumber")
    println("--- Task 1 end\n")

    // Task 2

    println("--- Task 2 start ---")

    val amount = 24
    println("Min monets count is ${SecondTask().minSplit(amount)}")
    println("--- Task 2 end\n")

    // Task 3

    println("---Task 3 start ---")

    val wordList = arrayOf("extract", "exhale", "excavate")
    println("Longest prefix: ${ThirdTask().longestPrefix(wordList)}")

    println("---Task 3 end ---\n")

    // Task 4

    println("---Task 4 start ---")

    val a = "1010"
    val b = "1011"

    println("$a + $b = ${FourthTask().addBinary(a, b)}")

    println("---Task 4 end ---\n")

    // Task 5

    println("---Task 5 start ---")

    val stairsCount = 7
    println("Ways count $stairsCount stairs: ${FiftiethTask().countVariants(stairsCount)}")

    println("---Task 5 end ---\n")

    // Task 6

    println("---Task 6 start ---")

    val linkedList = LinkedList()

    linkedList.insert(1, 10)
    linkedList.insert(2, 20)
    linkedList.insert(3, 30)

    linkedList.print()

    println("Delete 2")
    linkedList.delete(2)

    linkedList.print()

    println("---Task 6 end ---\n")
}