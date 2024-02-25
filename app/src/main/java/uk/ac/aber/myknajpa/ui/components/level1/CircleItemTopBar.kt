package uk.ac.aber.myknajpa.ui.components

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import uk.ac.aber.myknajpa.R
import uk.ac.aber.myknajpa.model.Product

@Composable
fun CircleItemTopBar(product : Product) {

    Column(modifier = Modifier
        .width(60.dp))
    {
        Box(
            modifier = Modifier
                .size(50.dp)
                .padding(1.dp)
                .fillMaxSize()
                .background(Color.Transparent, CircleShape)
        ) {
            Image(
                painter = painterResource(product.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.7F), CircleShape),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "122",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
            )
        }
        Text(
            text = product.name,
            fontSize = 10.sp,
            color = Color.Black,
            modifier = Modifier


        )
    }
}