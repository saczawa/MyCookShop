package uk.ac.aber.myknajpa.ui.components.level2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uk.ac.aber.myknajpa.HardcodedData.ProductList
import uk.ac.aber.myknajpa.model.Product
import uk.ac.aber.myknajpa.model.ProductionViewModel

@Composable
fun ProductRows(
    productionViewModel: ProductionViewModel,
    items: List<Product>
)
{
    LazyColumn(
        modifier = Modifier
            .padding(start = 5.dp, end = 5.dp, top = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        items.forEach { index ->
            item {
                ProductRow(productionViewModel, index)
            }
        }

    }
}