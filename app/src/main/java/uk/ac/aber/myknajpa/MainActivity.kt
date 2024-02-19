package uk.ac.aber.myknajpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uk.ac.aber.myknajpa.model.ProductionViewModel
import uk.ac.aber.myknajpa.ui.navigation.Screen
import uk.ac.aber.myknajpa.ui.screens.cook.CookScreen
import uk.ac.aber.myknajpa.ui.screens.orders.OrdersScreen
import uk.ac.aber.myknajpa.ui.theme.MyKnajpaTheme

class MainActivity : AppCompatActivity() {


//    private val productionViewModel = ProductionViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyKnajpaTheme(dynamicColor = false) {

                val productionViewModel = viewModel<ProductionViewModel>()
//                    remember {
//                    viewModel<ProductionViewModel>()
//                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BuildNavigationGraph(productionViewModel)
                }
            }
        }
    }
}

@Composable
private fun BuildNavigationGraph(
    productionViewModel: ProductionViewModel
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Cook.route
    ) {
        composable(Screen.Orders.route) { OrdersScreen(navController) }
        composable(Screen.Cook.route) {
            CookScreen(navController, productionViewModel, "cook") }
        composable(Screen.Mid.route) { CookScreen(navController, productionViewModel, "mid") }
        composable(Screen.Front.route) { CookScreen(navController, productionViewModel, "front") }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val productionViewModel = ProductionViewModel()
    MyKnajpaTheme(dynamicColor = false) {
        BuildNavigationGraph(productionViewModel)
    }
}