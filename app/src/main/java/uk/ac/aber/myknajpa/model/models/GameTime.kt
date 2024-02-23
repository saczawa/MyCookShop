package uk.ac.aber.myknajpa.model.models

class GameTime(
    private var _day: Int = 1,
    private var _multiplier: Int = 1,
    private var _playTimeSeconds: Long = 0
) {

    // Getter dla całego obiektu GameTime
    fun getGameTime(): GameTime {
        return this
    }

    // Getter dla pola multiplier
    fun getMultiplier(): Int {
        return _multiplier
    }

    // Setter dla pola _multiplier
    fun setMultiplier(newMultiplier: Int) {
        _multiplier = newMultiplier
    }

    // Metoda do zwiekszania dnia o 1
    fun increaseDay() {
        _day++
    }
}