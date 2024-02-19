package uk.ac.aber.myknajpa.ui.components.level3


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Help
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.aber.myknajpa.model.CallItem
import uk.ac.aber.myknajpa.model.ProductionViewModel


@Composable
fun CallNewOrderBar(
    productionViewModel: ProductionViewModel
) {
    var isExpanded by remember { mutableStateOf(false) }
    var number by remember { mutableStateOf("") }

    val screenWidth = LocalConfiguration.current.screenWidthDp


    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally

            ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Product Name",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.weight(1f))

            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .clickable { /** TO DO **/ }
                    .size(16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Help,
                    contentDescription = "Help",
                    modifier = Modifier
                        .size(16.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .size(Dp(screenWidth / 2.8f))
                    .background(Color.Blue)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.White)
                            .size(Dp(screenWidth / 8f))
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.White)
                            .size(Dp(screenWidth / 8f))
                    ) {

                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.White)
                            .size(Dp(screenWidth / 8f))
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.White)
                            .size(Dp(screenWidth / 8f))
                    ) {

                    }
                }
            }


        }
    }
}

//    Row(
//        modifier = Modifier
//            .wrapContentHeight()
//            .background(Color.Yellow)
//            .padding(16.dp),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.Bottom
//
//    ) {
//
//        TextField(
//            value = number,
//            modifier = Modifier
//                .padding(16.dp)
//                .weight(1f),
//            onValueChange = {
//                val input = it.toIntOrNull()
//                if (input != null && input in 0..99) {
//                    number = input.toString()
//                } else {
//                    number = "" // Ustawiamy pusty ciąg znaków, jeśli wartość nie jest liczbą lub nie jest w zakresie 0..99
//                }
//            },
//            singleLine = true,
//            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
//        )
//
//        Button(
//            onClick = { /*TODO*/ },
//            modifier = Modifier
//                .padding(16.dp)
//                .weight(1f)
//        ) {
//            Text(
//                text = "Cook",
//                fontSize = 16.sp,
//                color = Color.White
//            )
//        }

