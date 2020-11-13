fun main(){
    notesCompass.NORTH
    println("${goDirection(notesCompass.SOUTH)}")
    println(notesCompass.EAST.displayIt())
}

fun goDirection(dir:notesCompass): String{
    when (dir){
        notesCompass.NORTH -> return "North"
        notesCompass.SOUTH -> return "South"
        notesCompass.WEST -> return "West"
        notesCompass.EAST -> return "East"
        else -> return "Go Nowhere"
    }
}