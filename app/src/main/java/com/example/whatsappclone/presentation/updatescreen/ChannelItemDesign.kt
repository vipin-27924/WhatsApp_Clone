package com.example.whatsappclone.presentation.updatescreen

import android.graphics.Color
import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.whatsappclone.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class channelContent(
    val channelname:String,
    val ChannelDis:String,
    val ChannelImage:Int
)

@Composable

fun ChannelItem(channelContent: channelContent){

    var IsClickedChannel by remember {
        mutableStateOf(false)
    }
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp , vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically

    ){
        Image(painter = painterResource(channelContent.ChannelImage),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(4.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(text = channelContent.channelname,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                )

            Text(text = channelContent.ChannelDis,
                fontSize = 16.sp,
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {
                // Use proper state management with remember/mutableStateOf
                IsClickedChannel = !IsClickedChannel
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (IsClickedChannel) {
                    colorResource(R.color.gray)
                } else {
                    colorResource(id = R.color.light_green)
                }
            )
        ) {
            if (IsClickedChannel){
                Text("Following",
                    color = colorResource(R.color.black))
            }else{
                Text("Follow")
            }
        }
        }
}