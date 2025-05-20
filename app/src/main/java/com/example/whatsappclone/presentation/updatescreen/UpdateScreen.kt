package com.example.whatsappclone.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.whatsappclone.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.presentation.bottomnavigation.BottomNavigation
import java.nio.file.WatchEvent

@Preview(showBackground = true, showSystemUi = true)
@Composable

fun updateScreen() {
    val SampleChannel = listOf(
        channelContent(channelname = "Android",
            ChannelDis = "Android Developers",
            ChannelImage = R.drawable.img),

        channelContent(channelname = "Android",
        ChannelDis = "Android Developers",
        ChannelImage = R.drawable.img),

        channelContent(channelname = "Android",
            ChannelDis = "Android Developers",
            ChannelImage = R.drawable.img),

        channelContent(channelname = "Android",
            ChannelDis = "Android Developers",
            ChannelImage = R.drawable.img)
    )

    val ScrollState = rememberScrollState()
    val SampleStatus= listOf(
        StatusData(Image = R.drawable.disha_patani, name = "disha patani", Time = "Just Now"),
        StatusData(Image = R.drawable.kartik_aaryan, name = "rtik aryan", Time = "20 Min Ago"),
        StatusData(Image = R.drawable.carryminati, name = "carry minarti", Time = "2 hour Ago")
    )
    Scaffold (
        floatingActionButton =
            {
                FloatingActionButton(onClick = {},
                    containerColor = colorResource(id = R.color.light_green),
                    modifier = Modifier.size(65.dp)) {

                    Icon(painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp),
                        tint = Color.White)

                }
            },
        bottomBar = {
            BottomNavigation()
        },
        topBar = {
            TopBar()
        }

    ){
        Column (modifier = Modifier
            .padding(it)
            .fillMaxSize()
            .verticalScroll(ScrollState)
        ){
            Text(text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatusIcon()
            SampleStatus.forEach {
                Status(statusData = it)
            }
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(color = Color.Gray)
            Text(text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp))

            Spacer(modifier = Modifier.height(8.dp))
            Column (modifier = Modifier.padding(horizontal = 16.dp)){
                Text(text = "Stay updated On Topics That Matters To You. Find Channels To Follow Below")
                Spacer(modifier = Modifier.height(32.dp))
                Text(text = "Find Channels To Follow")
            }
            Spacer(modifier = Modifier.height(16.dp))

           SampleChannel.forEach {
               ChannelItem(channelContent = it)
           }

        }
    }
}