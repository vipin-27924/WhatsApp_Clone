package com.example.whatsappclone.presentation.bottomnavigation

import androidx.compose.foundation.layout.Arrangement
import com.example.whatsappclone.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview(showBackground = true)
@Composable
fun BottomNavigation() {
    BottomAppBar(tonalElevation = 11.dp, containerColor = Color.White) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ){
                    Icon(
                        painter = painterResource(R.drawable.message),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = "Chats", fontWeight = FontWeight.Bold)
                }

                        Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.update_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "Update")
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ){
                    Icon(
                        painter = painterResource(R.drawable.communities_icon),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp))
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Community")
                }

                        Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "Calls")
            }
        }
    }
}