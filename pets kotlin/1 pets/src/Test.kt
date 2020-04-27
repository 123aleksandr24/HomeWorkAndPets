//
//fun main() {
//
//    val playername = "Estragon"
//    var experiencePoints = 5
//    experiencePoints += 5
//    val hasSteed = true
//    val tavern = "Eastern"
//    val tavernchik = "Vas"
//    val money = 50
//    println(hasSteed)
//    println(experiencePoints)
//    println(playername)
//    println(money)
//    println(tavern)
//    println(tavernchik)
//    // страница 52 сделать дз
//}

enum class StudentStatus {
    NOT_ENROLLED,
    ACTIVE,
    GRADUATED
}

class Student(var status: StudentStatus) {

}

fun main(args: Array<String>) {
    val student = Student(StudentStatus.NOT_ENROLLED)
    studentMessage(student.status)   //310
}

fun studentMessage(status: StudentStatus): String {
    return when (status) {
        StudentStatus.NOT_ENROLLED -> "Please choose a course."
        StudentStatus.ACTIVE -> "Welcome, student!"
        StudentStatus.GRADUATED -> "Congratulations!"
    }
}



