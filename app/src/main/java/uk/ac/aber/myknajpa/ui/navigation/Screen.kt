package uk.ac.aber.myknajpa.ui.navigation

sealed class Screen(val route: String) {
    object Orders: Screen("orders")
    object Cook : Screen("cook")
    object Mid : Screen("mid")
    object Front : Screen("front")
}

val screens = listOf(
    Screen.Orders,
    Screen.Cook,
    Screen.Mid,
    Screen.Front
)
