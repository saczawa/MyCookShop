package uk.ac.aber.myknajpa.ui.components.level4

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uk.ac.aber.myknajpa.model.Product

@Composable
fun ProductBar(items: List<Product>) {
    var isExpanded by remember { mutableStateOf(false) }
    var number by remember { mutableStateOf("") }

    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        items.forEach { index ->
            item {
                    ProductCard(index)
                }



//        item {
//            LazyRow(
//                horizontalArrangement = Arrangement.SpaceEvenly,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(bottom = 16.dp) // Dodaj padding od dołu
//
//            ) {
//                for (i in 0 until 5) {
//                    ProductCard()
//                }
//            }
//            Spacer(modifier = Modifier.fillMaxSize())
//        }


        }
    }
}