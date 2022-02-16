import java.lang.reflect.Array.get

/**
1. Define a class student with the following specification
Private members of class student
admno                        integer
sname                        20 character
eng. math, science       float
total                            float
ctotal()                        a function to calculate eng + math + science with float return type.
Public member function of class student
Takedata()                   Function to accept values for admno, sname, eng, science and invoke ctotal() to calculate total.
Showdata()                   Function to display all the data members on the screen. solution
 */

abstract class DataCollector(
    _admno: Int,
    _sname: String,
    _engStudents: Float,
    _mathStudents: Float,
    _sciStudents: Float,
    _total: Float
) {
//    init {
//        var admno = _admno
//        var sname = _sname
//        var engStudents = _engStudents
//        var
//    }


    class DataDisplayer (
        _admno: Int,
        _sname: String,
        _engStudents: Float,
        _mathStudents: Float,
        _sciStudents: Float,
        _total: Float
    ) : DataCollector(_admno, _sname, _engStudents, _mathStudents, _sciStudents, _total) {

        fun takeData() {

        }


        fun showData() {

        }

    }
}