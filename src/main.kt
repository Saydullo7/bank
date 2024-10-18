import java.util.Scanner

fun main() {

    var myServace = MyServace()


    while (true){
        println("1->kamunal tolvlarga pull tolash;2->Kartadan kartaga pull otgazish;")
        when(Scanner(System.`in`).nextInt()){
            1->myServace.pulltolash()
            2->myServace.pullotkazish()

        }



      }


}