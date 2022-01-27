import kotlin.math.abs
import kotlin.math.sign


import java.util.*

fun forFun() {
    /**

    do {
    println(
    "\nMENU" +
    "\n1. Accept elements of Matrix" +
    "\n2. Display elements of  Matrix" +
    "\n3. Sum of all elements of matrix" +
    "\n4. Display row-wise sum of matrix" +
    "\n5. Display column-wise sum of matrix" +
    "\n6. Exit"
    )
    println("Enter your choice")
    val userChoice = scanner.nextInt()

    when (userChoice) {
    1 -> acceptElementsOfMatrix()
    2 -> displayNumbersOfMatrix()
    3 -> insertionMethod()
    4 -> selectionSort()
    5 -> bubbleSort()
    6 -> println("You EXIT the program")
    }

    } while (userChoice != 6)
    }

    fun acceptElementsOfMatrix(twoD: IntArray) {

    println("Enter the number of ROWS")
    val rows = scanner.nextInt()

    println("Enter the number of COLUMNS")
    val columns = scanner.nextInt()


    println("Table is filled automatically")

    for (row in 0 until twoD.size) {
    val columnArray = IntArray(columns)
    for (column in 0 until columnArray.size) {
    val inputNumbers = (0..100).random()
    columnArray[column] = inputNumbers
    }

    twoD[row] = columnArray
    }
    }


    fun displayNumbersOfMatrix(twoD: IntArray) {
    for (rowNumbers in twoD){
    for (columnNumbers in rowNumbers){
    print(columnNumbers)
    print(" ")
    }
    println()
    }

*/

}