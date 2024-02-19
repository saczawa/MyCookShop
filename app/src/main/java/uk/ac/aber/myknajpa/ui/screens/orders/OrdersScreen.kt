package uk.ac.aber.myknajpa.ui.screens.orders

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import uk.ac.aber.myknajpa.HardcodedData.Order
import uk.ac.aber.myknajpa.HardcodedData.OrderList
import uk.ac.aber.myknajpa.ui.components.OrderCard
import uk.ac.aber.myknajpa.ui.components.ScrollableListWithCircles
import uk.ac.aber.myknajpa.ui.components.TopLevelScaffold
import uk.ac.aber.myknajpa.ui.components.level1.OrderScrollableColumn


@Composable
fun OrdersScreen(
    navController: NavHostController,
) {

    val coroutineScope = rememberCoroutineScope()

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
                    .fillMaxSize()
                    .padding(7.dp)
            ) {
                ScrollableListWithCircles()
                OrderScrollableColumn(OrderList.orders, 1)
            }

        }
    }
}
