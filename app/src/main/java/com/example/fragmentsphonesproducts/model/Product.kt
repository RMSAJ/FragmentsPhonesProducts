package com.example.fragmentsphonesproducts.model

import androidx.annotation.DrawableRes

data class Product (
    @DrawableRes val imageResourceId: Int,
    val productName: String,
    val productPrice: String,
    val isVip: Boolean,
    val quantityNumber: Int
)