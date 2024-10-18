import java.util.ArrayList
import java.util.Scanner

class MyServace() :MyServaceInterface {
    var input =Scanner(System.`in`)
    var list = ArrayList<MyCard>()
    override fun pulltolash() {

        println("qancha pull kiritasiz")
        val d  = input.nextInt()



        println("pull tolandi")
    }

    override fun pullotkazish() {

        println("qancha pull otkazasiz")
        val g = input.next()
        println("pull otgazildi")
    }


     }


