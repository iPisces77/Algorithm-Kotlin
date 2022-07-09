import ch1.linearsearch.LinearSearch
import ch1.linearsearch.Student

fun main() {
    val data = arrayOf(24, 18, 12, 9, 16, 66, 32, 4)
    val result = LinearSearch.linearSearch(data, 16)
    println("Linear Search: $result")
    val result2 = LinearSearch.linearSearch(data, 666)
    println("Linear Search: $result2")
    val students = arrayOf(Student("韩"), Student("付"), Student("郭"))
    val han = Student("韩")
    val result3 = LinearSearch.linearSearch(students, han)
    println("Linear Search: $result3")
}
