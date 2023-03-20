package com.jarroyo.dropdownissue.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun DropDownIssueScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            DropdownMenu()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DropdownMenu() {
    val context = LocalContext.current
    var expanded by remember { mutableStateOf(false) }
    var optionSelected by remember { mutableStateOf("Option1") }
    val optionValues = listOf("Option1", "Option2", "Option3", "Option1", "Option2", "Option3", "Option1", "Option2", "Option3", "Option1", "Option2", "Option3", "Option1", "Option2", "Option3", "Option1", "Option2", "Option3")
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = {
            expanded = !expanded
        },
        modifier = Modifier.padding(16.dp),
    ) {
        OutlinedTextField(
            value = optionSelected,
            onValueChange = { },
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor(),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            },
        ) {
            optionValues.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        expanded = false
                        optionSelected = option
                    },
                )
            }
        }
    }
}