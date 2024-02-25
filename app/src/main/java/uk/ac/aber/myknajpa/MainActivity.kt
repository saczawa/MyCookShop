package uk.ac.aber.myknajpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uk.ac.aber.myknajpa.model.ProductionViewModel
import uk.ac.aber.myknajpa.ui.navigation.Navig
import uk.ac.aber.myknajpa.ui.screens.cook.ProductionScreen
import uk.ac.aber.myknajpa.ui.screens.orders.OrderScreen
import uk.ac.aber.myknajpa.ui.theme.MyKnajpaTheme

class MainActivity : AppCompatActivity() {

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
        startDestination = Navig.Cook.route
    ) {
        composable(Navig.Orders.route) { OrderScreen(navController) }
        composable(Navig.Cook.route) {
            ProductionScreen(navController, productionViewModel, "cook") }
        composable(Navig.Mid.route) { ProductionScreen(navController, productionViewModel, "mid") }
        composable(Navig.Front.route) { ProductionScreen(navController, productionViewModel, "front") }

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