fun main(){

    val students = arrayListOf(
        Student("memet", 20, "Üniversite A"),
        Student("adile", 27, "Üniversite B"),
        Student("nese", 22, "Üniversite C"),
        Student("ceylan", 28, "Üniversite A"),
        Student("cevo", 29, "Üniversite B"),
        Student("halil", 24, "Üniversite A"),
        Student("yusuf", 22, "Üniversite B"),
        Student("mahir", 26, "Üniversite A")
    )

    val ageMax = students.maxBy { it.age }
    val ageMin = students.minBy { it.age }

    val maxIndex = students.indexOf(ageMax)
    val minIndex = students.indexOf(ageMin)

    println("Oldest student name is -> ${ageMax.name} | index is -> $maxIndex")
    println("The youngest student name is -> ${ageMin.name} | index is -> $minIndex")
    println()

    val filterStudent = students.filter { it.school == "Üniversite A"}
    println("Filter School -> ${filterStudent.joinToString("\n-> ")}")
    println()

    println("age > 25 --> ${filterStudent.filter { it.age>25 }}")
    println("age < 25 --> ${filterStudent.filter { it.age<25 }}")
}

data class Student(val name: String, val age: Int, val school: String)