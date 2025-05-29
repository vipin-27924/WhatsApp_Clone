package com.example.whatsappclone.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ContextualFlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.colorResource
import com.example.whatsappclone.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Composable

fun MyStatusIcon() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically){

        Box() {

            Image(
                painter = painterResource(R.drawable.myimage), contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                    tint = Color.White,
                modifier = Modifier.size(25.dp)
                    .align(Alignment.BottomEnd)
                    .padding(2.dp)
                    .background(
                        color = colorResource( R.color.dark_green),
                        shape = RoundedCornerShape(12.dp)
                    )
            )

        }
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = "My Status",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(text = "Tap to add status update",
                fontSize = 12.sp,
                color = Color.Gray
                )
        }
    }

}

data class StatusData(
    val Image: Int,
    val name: String,
    val Time: String
)


@Composable
fun Status(statusData: StatusData){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically){
        Image(painter = painterResource(statusData.Image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(4.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop)

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(text = statusData.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(text = statusData.Time)
        }
    }

}