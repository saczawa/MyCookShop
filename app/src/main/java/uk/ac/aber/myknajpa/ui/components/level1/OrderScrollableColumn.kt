package uk.ac.aber.myknajpa.ui.components.level1

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uk.ac.aber.myknajpa.HardcodedData.Order
import uk.ac.aber.myknajpa.ui.components.OrderCard


@Composable
fun OrderScrollableColumn(orders: List<Order>, grid: Int) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(grid),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp)
    ) {
        itemsIndexed(orders) { index, order ->
            OrderCard(order)
        }
    }
}
