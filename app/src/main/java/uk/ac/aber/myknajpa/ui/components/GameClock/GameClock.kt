package uk.ac.aber.myknajpa.ui.components.GameClock

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import uk.ac.aber.myknajpa.model.models.GameTime


@Composable
fun GameClock() {
    var gameTime by remember { mutableStateOf(GameTime()) }


    val list = listOf("Slow", "Normal", "Fast")
    var expanded by remember { mutableStateOf(false) }
    val currentValue = remember { mutableStateOf(list[1]) }

    GameClockUpdater(gameTime)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Day: ${gameTime.getDay()}")
        Text(text = "${secondsToTime(gameTime.getPlayTimeSeconds())}")

        // Dropdown menu for Multiplier
        Box(
            modifier = Modifier
        ) {
            Text(
                text = currentValue.value,
                modifier = Modifier
                    .clickable { expanded = !expanded }
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {


                DropdownMenuItem(
                    text = { Text("Slow") },
                    onClick = {
                        currentValue.value = list[0]
                        expanded = false

                    }
                )
                DropdownMenuItem(
                    text = { Text("Normal") },
                    onClick = {
                        currentValue.value = list[1]
                        expanded = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("Fast") },
                    onClick = {
                        currentValue.value = list[2]
                        expanded = false
                    }
                )
            }
        }
    }
}





@Composable
fun GameClockUpdater(gameTime: GameTime) {
    LaunchedEffect(Unit) {
        while (true) {
            withFrameNanos {
                gameTime.updatePlayTime()
            }
            delay(1000)
        }
    }
}

@Composable
fun secondsToTime(seconds: Long): String {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val formattedTime = String.format("%02d:%02d", hours, minutes)
    return formattedTime
}

@Composable
@Preview
fun GameClockPreview() {
    GameClock()
}