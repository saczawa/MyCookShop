package uk.ac.aber.myknajpa.ui.components


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.OutdoorGrill
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.OutdoorGrill
import androidx.compose.material.icons.outlined.Receipt
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import uk.ac.aber.myknajpa.R
import uk.ac.aber.myknajpa.model.IconGroup
import uk.ac.aber.myknajpa.ui.navigation.Screen
import uk.ac.aber.myknajpa.ui.navigation.screens
import uk.ac.aber.myknajpa.ui.theme.MyKnajpaTheme

@Composable
fun MainPageNavigationBar(
    navController: NavController,
) {
    val icons = mapOf(

        Screen.Orders to IconGroup(
            filledIcon = Icons.Filled.List,
            outlineIcon = Icons.Outlined.List,
            label = stringResource(id = R.string.bottom_nav_cook)
        ),

        Screen.Cook to IconGroup(
            filledIcon = Icons.Filled.OutdoorGrill,
            outlineIcon = Icons.Outlined.OutdoorGrill,
            label = stringResource(id = R.string.bottom_nav_cook)
        ),
        Screen.Mid to IconGroup(
            filledIcon = Icons.Filled.Receipt,
            outlineIcon = Icons.Outlined.Receipt,
            label = stringResource(id = R.string.bottom_nav_mid)
        ),
        Screen.Front to IconGroup(
            filledIcon = Icons.Filled.Receipt,
            outlineIcon = Icons.Outlined.Receipt,
            label = stringResource(id = R.string.bottom_nav_front)
        )
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        screens.forEach { screen ->
            val isSelected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
            val labelText = icons[screen]!!.label
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = (if (isSelected)
                            icons[screen]!!.filledIcon
                        else
                            icons[screen]!!.outlineIcon),
                        contentDescription = labelText
                    )
                },
                label = { Text(labelText) },
                selected = isSelected,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Preview
@Composable
private fun MainPageNavigationBarPreview() {
    val navController = rememberNavController()
    MyKnajpaTheme(dynamicColor = false) {
        MainPageNavigationBar(navController)
    }
}