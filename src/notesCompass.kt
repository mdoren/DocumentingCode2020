enum class notesCompass(var shortName: Char) {
    NORTH('N'){
        override fun displayIt(){
            println("This is North.")
        }
    },
    SOUTH('S') {
        override fun displayIt(){
            println("This is South.")
        }
    },
    WEST('W'){
        override fun displayIt() {
            println("This is West.")
        }
    },
    EAST('E'){
        override fun displayIt() {
            println("This is East.")
        }
    };

    abstract fun displayIt()
}