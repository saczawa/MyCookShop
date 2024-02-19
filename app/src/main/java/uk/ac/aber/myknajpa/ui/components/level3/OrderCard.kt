package uk.ac.aber.myknajpa.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.ui.unit.dp
import uk.ac.aber.myknajpa.HardcodedData.Order

@Composable
fun OrderCard(order: Order) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "${order.cost}")
                Text(text = "#: ${order.id}")
                Text(text = "00:00")
            }

            Spacer(modifier = Modifier.height(8.dp))  // Odstęp między wierszami

            Text(text = "Zamówienie:")
            order.items.forEach { item ->
                Text(text = "- $item", modifier = Modifier.padding(top = 4.dp))
            }
        }
    }
}
