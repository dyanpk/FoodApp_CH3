package com.hungry.food_delivery.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Food(
    val id: String = UUID.randomUUID().toString(),
    val nameOfFood: String,
    val imgUrlFood: String,
    val priceOfFood: Double
) : Parcelable
