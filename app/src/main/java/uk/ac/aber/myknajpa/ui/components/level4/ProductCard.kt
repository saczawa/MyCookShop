package uk.ac.aber.myknajpa.ui.components.level4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.aber.myknajpa.R
import uk.ac.aber.myknajpa.model.Product

@Composable
fun ProductCard(product : Product) {

    val img = product.image

    Column(modifier = Modifier
        .size(90.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
//                .align(Alignment.TopCenter)
                .padding(1.dp)
                .fillMaxSize()
                .background(Color.Transparent)
        ) {
            Image(
                painter = painterResource(product.image),
                contentDescription = product.name,
                modifier = Modifier
                    .fillMaxSize().border(2.dp, color = Color.Black)
                    .background(Color.Black.copy(alpha = 0.7F)),
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = product.name,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black,
            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .padding(top = 40.dp)

        )
    }
}