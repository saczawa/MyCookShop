package uk.ac.aber.myknajpa.model.models

class CallHistory {
    private val history: MutableList<Status> = mutableListOf()

    // Metoda dodająca nowy status do historii
    fun addStatus(status: Status) {
        history.add(status)
    }

    // Metoda zwracająca całą historię
    fun getHistory(): List<Status> {
        return history.toList()
    }
}