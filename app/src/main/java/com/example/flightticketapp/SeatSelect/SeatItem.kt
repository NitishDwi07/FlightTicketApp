package com.example.flightticketapp.SeatSelect

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightticketapp.R


@Composable
fun SeatItem(
    seat: Seat,
    onSeatClick: () -> Unit
){
    val backgroundColor = when (seat.status) {
        SeatStatus.AVAILABLE -> colorResource(R.color.greem)
        SeatStatus.SELECTED -> colorResource(R.color.orange)
        SeatStatus.UNAVAILABLE -> colorResource(R.color.grey)
        SeatStatus.EMPTY -> _root_ide_package_.androidx.compose.ui.graphics.Color.Transparent
    }

    val textColor =  when(seat.status){
        SeatStatus.AVAILABLE -> _root_ide_package_.androidx.compose.ui.graphics.Color.White
        SeatStatus.SELECTED -> _root_ide_package_.androidx.compose.ui.graphics.Color.Black
        SeatStatus.UNAVAILABLE -> _root_ide_package_.androidx.compose.ui.graphics.Color.Gray
        SeatStatus.EMPTY -> _root_ide_package_.androidx.compose.ui.graphics.Color.Transparent
    }

    val clickableEnabled=seat.status== SeatStatus.AVAILABLE||seat.status== SeatStatus.SELECTED

    Box(
        modifier = Modifier
            .size(28.dp)
            .padding(4.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(backgroundColor)
            .clickable(enabled = clickableEnabled){onSeatClick()},
        contentAlignment = Alignment.Center
    ){
        Text(
            text=seat.name,
            color= textColor,
            fontSize = 12.sp
        )
    }
}