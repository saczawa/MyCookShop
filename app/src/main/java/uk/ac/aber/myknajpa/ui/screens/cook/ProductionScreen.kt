package uk.ac.aber.myknajpa.ui.screens.cook

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import uk.ac.aber.myknajpa.HardcodedData.ProductList.productList
import uk.ac.aber.myknajpa.model.Product
import uk.ac.aber.myknajpa.model.ProductionViewModel
import uk.ac.aber.myknajpa.ui.components.GameClock.GameClock
import uk.ac.aber.myknajpa.ui.components.WasteBoard
import uk.ac.aber.myknajpa.ui.components.TopLevelScaffold
import uk.ac.aber.myknajpa.ui.components.level2.ProductRows
import uk.ac.aber.myknajpa.ui.components.level4.ProductBar

@Composable
fun ProductionScreen(
    navController: NavHostController,
    productionViewModel: ProductionViewModel,
    name : String
) {
    val coroutineScope = rememberCoroutineScope()

    val subList: List<Product> = when {
        name == "cook" -> productList.subList(0, 7)
        name == "mid" -> productList.subList(7, 12)
        name == "front" -> productList.subList(12, productList.size)
        else -> emptyList() // Domyślna lista, jeśli name nie pasuje do żadnego przypadku
    }

    TopLevelScaffold(
        navController = navController,
        coroutineScope = coroutineScope,
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(bottom = 25.dp, top = 60.dp)
                .fillMaxSize()

        ) {
            Column(
                modifier = Modifier
                    .padding(1.dp)
            ) {
                Row (
                    modifier = Modifier
                        .padding(4.dp)
                        ){
                    GameClock()
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .padding(6.dp)
                ){
                    WasteBoard()
                    ProductRows(productionViewModel, subList)
                 }
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .padding(start = 6.dp, end = 6.dp)
//                        .border(width = 2.dp, color = Color.Black)
//                        .padding(6.dp)
                ){
                    ProductBar(subList)
                }
            }
        }
    }
}