package uk.ac.aber.myknajpa.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Store
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import uk.ac.aber.myknajpa.R
import uk.ac.aber.myknajpa.ui.theme.MyKnajpaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPageTopAppBar(
    onClickMenu: () -> Unit = {},
    onClickOffice: () -> Unit = {}
){
    CenterAlignedTopAppBar(
        title = { Text(stringResource(id = R.string.app_name)) },
        navigationIcon = {
            IconButton(onClick = onClickMenu) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = stringResource(R.string.nav_drawer_menu)
                )
            }
        },
        actions = { // Dodajemy ikonę "office" w sekcji akcji
            IconButton(onClick = onClickOffice) {
                Icon(
                    imageVector = Icons.Filled.Store, // Używamy przykładowej ikony, musisz dostosować
                    contentDescription = stringResource(R.string.office_icon_description) // Dodaj opis ikony do swoich zasobów
                )
            }
        }
    )
}

@Preview
@Composable
private fun MainPageTopAppBarPreview() {
    MyKnajpaTheme(dynamicColor = false) {
        MainPageTopAppBar()
    }
}