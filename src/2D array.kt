import java.util.*

/** Array - Two Dimension
 * set 1 Task 1
 * Write a menu driven C++ program to do following operation on two dimensional array A of size m x n.
 * You should use user-defined functions which accept 2-D array A, and its size m and n as arguments. The options are:

To input elements into matrix of size m x n
To display elements of matrix of size m x n
Sum of all elements of matrix of size m x n
To display row-wise sum of matrix of size m x n
To display column-wise sum of matrix of size m x n
To create transpose of matrix B of size n x m
 */
fun matrixMenu() {
    println("Enter the number of ROWS")
    val rows = scanner.nextInt()

    println("Enter the number of COLUMNS")
    val columns = scanner.nextInt()

    val twoD = Array(rows) { IntArray(columns) }
    println("Table is filled automatically")

    for (row in 0 until twoD.size) {
        val columnArray = IntArray(columns)
        for (column in 0 until columnArray.size) {
            val inputNumbers = (0..100).random()
            columnArray[column] = inputNumbers
        }

        twoD[row] = columnArray
    }


    for (rowNumbers in twoD) {
        for (columnNumbers in rowNumbers) {
            print(columnNumbers)
            print(" ")
        }
        println()
    }

}


/** Array - Two Dimension
 * set 1 Task 2
Write user defined functions for square matrix to calculate

Left diagonal sum
Right diagonal sum
 */
fun calculateDiagonalSum() {
    println("Enter size of matrix")
    val sizeOfMatrix = readLine()!!.toInt()
    println("Size is ${sizeOfMatrix}x${sizeOfMatrix}")

    println("Fields are filled automatically")
    val row = sizeOfMatrix
    val column = sizeOfMatrix
    val userTwoArray = Array(row) { IntArray(column) }

    for (rows in 0 until userTwoArray.size) {
        val arrayColumn = IntArray(column)
        for (columns in 0 until arrayColumn.size) {
            val inputNumbers = (0..100).random()
            arrayColumn[columns] = inputNumbers
        }

        userTwoArray[rows] = arrayColumn
    }

    for (rowNumbers in userTwoArray) {
        for (columnNumbers in rowNumbers) {
            print(columnNumbers)
            print(" ")
        }
        println()
    }

    var sumLeft = 0

    for (rowIndex in 0 until userTwoArray.size) {
        sumLeft += userTwoArray[rowIndex][rowIndex]
    }
    println("Sum of left diagonal is $sumLeft")


    var sumRight = 0

    for (rowIndex in 0 until userTwoArray.size) {
        val lastPosition = userTwoArray[rowIndex].size - 1
        for (columnIndex in lastPosition downTo 0) {
            if (userTwoArray[rowIndex].size - 1 - columnIndex == rowIndex)
                sumRight += userTwoArray[rowIndex][columnIndex]
        }
    }
    println("Sum of right diagonal is $sumRight")


}


/** Array - Two Dimension
 * set 1 Task 3
 * Write a user-defined function in C++ to display the multiplication of row element of
 * two-dimensional array A[4][6] containing integer.
 */
fun multiplyRowToColumn() {
    println("Enter the number of rows")
    val rows = scanner.nextInt()

    println("Enter the number of columns")
    val columns = scanner.nextInt()

    val twoD = Array(rows) { IntArray(columns) }
    println("Table is filled automatically")

    for (row in 0 until twoD.size) {
        val columnArray = IntArray(columns)
        for (column in 0 until columnArray.size) {
            val inputNumbers = (0..100).random()
            columnArray[column] = inputNumbers
        }

        twoD[row] = columnArray
    }


    for (rowNumbers in twoD) {
        for (columnNumbers in rowNumbers) {
            print(columnNumbers)
            print(" ")
        }
        println()
    }

    println("The multiplication of rows and columns is: ")
    val result = rows * columns
    println(result)
}


/** Array - Two Dimension
 * set 1 Task 4
 * Write a user defined function named Upper-half() which takes a two dimensional array A,
 * with size N rows and N columns as argument and prints the upper half of the array.

e.g.,
2 3 1 5 0                              2 3 1 5 0
7 1 5 3 1                                1 5 3 1
2 5 7 8 1   Output will be:                1 7 8
0 1 5 0 1                                    0 1
3 4 9 1 5                                      5
 */
fun showUpperHalf() {
    val rows: Int
    val column: Int

    val scanner = Scanner(System.`in`)

    print("Enter the number of rows and columns of matrix : ")
    rows = scanner.nextInt()
    column = rows

    if (rows != column) {
        println("Matrix should be Square matrix , Rows and Col size must be Same !!")
        return
    }

    val matrixA = Array(rows) { IntArray(column) }

    println("Enter the Elements of First Matrix ($rows X $column} ): ")
    for (i in matrixA.indices) {
        for (j in matrixA[i].indices) {
            matrixA[i][j] = (1..10).random()
        }
    }

    println("Matrix A : ")
    for (i in matrixA.indices) {
        println("${matrixA[i].contentToString()} ")
    }

    for (i in matrixA.indices) {
        for (j in matrixA[i].indices) {
            if(i<=j)
                print(""+ matrixA[i][j]+ " ")
            else
                print("  ")
        }
        println()
    }

}


/** Array - Two Dimension
 * set 1 Task 5
 * Write a function in C++ which accepts a 2D array of integers and its size as arguments and
 * displays the elements of middle row and the elements of middle column.
[Assuming the 2D Array to be a square matrix with odd dimension i.e. 3x3, 5x5, 7x7 etc...]
Example, if the array contents is

3  5  4
7  6  9
2  1  8

Output through the function should be :
Middle Row : 7 6 9
Middle column : 5 6 1
 */
fun calculateMiddleSumAndDisplay() {
    println("Enter ODD size of matrix")
    val sizeOfOddMatrix = readLine()!!.toInt()
    println("Size is ${sizeOfOddMatrix}x$sizeOfOddMatrix")

    println("Numbers are entered automatically")
    val row = sizeOfOddMatrix
    val column = sizeOfOddMatrix
    val userTwoArray = Array(row) { IntArray(column) }

    for (rows in 0 until userTwoArray.size) {
        val arrayColumn = IntArray(column)
        for (columns in 0 until arrayColumn.size) {
            val inputNumbers = (0..100).random()
            arrayColumn[columns] = inputNumbers
        }

        userTwoArray[rows] = arrayColumn
    }

    for (rowNumbers in userTwoArray) {
        for (columnNumbers in rowNumbers) {
            print(columnNumbers)
            print(" ")
        }
        println()
    }

    var sumRowMiddle = 0
    println("Middle row numbers are: ")
    for (rowIndex in 0 until userTwoArray.size) {
        val lastPosition = userTwoArray[rowIndex].size - 1
        for (columnIndex in lastPosition downTo 0) {
            if (userTwoArray[rowIndex].size / 2 == columnIndex) {
                sumRowMiddle += userTwoArray[rowIndex][columnIndex]

                print("${userTwoArray[rowIndex][columnIndex]}\t")
            }
        }
    }
    println()
    println("Sum of middle row diagonal is $sumRowMiddle")

    var sumColumnMiddle = 0
    println("Middle column numbers are: ")
    for (rowIndex in 0 until userTwoArray.size) {
        val lastPosition = userTwoArray[rowIndex].size - 1
        for (columnIndex in lastPosition downTo 0) {
            if (userTwoArray[rowIndex].size / 2 == columnIndex) {
                sumColumnMiddle += userTwoArray[columnIndex][rowIndex]

                print("${userTwoArray[columnIndex][rowIndex]}\t")
            }
        }
    }
    println()
    println("Sum of middle column diagonal is $sumColumnMiddle")
}


/** Array - Two Dimension
 * set 1 Task 6
 *Write a program to add two array A and B of size m x n.
 */
fun addTwoMatrices() {
    val rows: Int
    val column: Int

    val scanner = Scanner(System.`in`)

    print("Enter the number of rows and columns of matrix : ")
    rows = scanner.nextInt()
    column = scanner.nextInt()

    val matrixA = Array(rows) { IntArray(column) }
    val matrixB = Array(rows) { IntArray(column) }
    val matrixSum = Array(rows) { IntArray(column) }


    println("Enter the Elements of First Matrix ($rows X $column} ): ")
    for (i in matrixA.indices) {
        for (j in matrixA[i].indices) {
            print("matrixA[$i][$j]: ")
            matrixA[i][j] = scanner.nextInt()
        }
    }

//Input Matrix
    println("Enter the Elements of Second Matrix ($rows X $column} ): ")
    for (i in matrixB.indices) {
        for (j in matrixB[i].indices) {
            print("matrixB[$i][$j]: ")
            matrixB[i][j] = scanner.nextInt()
        }
    }

//print Matrix A
    println("Matrix A : ")
    for (i in matrixA.indices) {
        println("${matrixA[i].contentToString()} ")
    }

//print Matrix B
    println("Matrix B : ")
    for (i in matrixB.indices) {
        println("${matrixB[i].contentToString()} ")
    }

//Perform Addition
    for (i in matrixSum.indices) {
        for (j in matrixSum[i].indices) {
            matrixSum[i][j] = matrixA[i][j] + matrixB[i][j]
        }
    }

//Print Sum of Matrices
    println("Sum of the Matrices:")
    for (i in matrixSum.indices) {
        println("${matrixSum[i].contentToString()} ")
    }

}


/** Array - Two Dimension
 * set 1 Task 7
 *Write a program to multiply array A and B of order NxL and LxM
 */
fun multiplyTwoMatrices() {
    //Input Stream
    val scanner = Scanner(System.`in`)

    //Input no of rows and column
    print("Enter the number of rows and columns of First matrix : ")
    val rows1 = scanner.nextInt()
    val column1 = scanner.nextInt()

    //Input no of rows and column
    print("Enter the number of rows and columns of Second matrix : ")
    val rows2 = scanner.nextInt()
    val column2 = scanner.nextInt()

    //No of Col in first Matrix must be Equal to no of rows in second Matrix
    if (column1 != rows2) {
        println("Size of Column in first Matrix must be Equal to size of rows in second Matrix !!")
        return
    }

    //Create First Matrix Array
    val matrixA = Array(rows1) { IntArray(column1) }

    //Create Second Matrix Array
    val matrixB = Array(rows2) { IntArray(column2) }

    // create Product Matrix Array
    val productMatrix = Array(rows1) { IntArray(column2) }


    //Input Matrix
    println("Enter the  elements of First Matrix ($rows1 X $column1} ): ")
    for (i in matrixA.indices) {
        for (j in matrixA[i].indices) {
            print("matrixA[$i][$j]: ")
            matrixA[i][j] = scanner.nextInt()
        }
    }

    //Input Matrix
    println("Enter the Elements of Second Matrix ($rows2 X $column2} ): ")
    for (i in matrixB.indices) {
        for (j in matrixB[i].indices) {
            print("matrixB[$i][$j]: ")
            matrixB[i][j] = scanner.nextInt()
        }
    }

    //print Matrix A
    println("Matrix A : ")
    for (i in matrixA.indices) {
        println("${matrixA[i].contentToString()} ")
    }

    //print Matrix B
    println("Matrix B : ")
    for (i in matrixB.indices) {
        println("${matrixB[i].contentToString()} ")
    }

    //Product of Matrices
    for (i in productMatrix.indices) {
        for (j in productMatrix[i].indices) {
            for (k in matrixB.indices)
                productMatrix[i][j] = productMatrix[i][j] + (matrixA[i][k] * matrixB[k][j])
        }
    }

    //Print Product of Matrices
    println("Product of the Matrices:")
    for (i in productMatrix.indices) {
        println("${productMatrix[i].contentToString()} ")
    }
}