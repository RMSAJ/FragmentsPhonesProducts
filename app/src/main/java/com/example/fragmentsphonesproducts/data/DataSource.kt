package com.example.fragmentsphonesproducts.data

import com.example.fragmentsphonesproducts.R
import com.example.fragmentsphonesproducts.model.Product

object DataSource{
    val products: List<Product> = listOf(
        Product( R.drawable.iphone,
            "Iphone 12",
            "Price: 4500 SR",
            true,
            5
        ),  Product(
            R.drawable.samsung_galaxy_z_flip,
            "Samsung Galaxy S21 Ultra",
            "Price: 4500 SR",
            false,
            5
        ),Product( R.drawable.xiaomi_pro,
            "Xiaomi 11T Pro",
            "Price: 2000 SR",
            true,
            0
        ),Product( R.drawable.huawei_yp,
            "Huawei Y6p",
            "Price: 500 SR",
            false,
            0
        ),Product( R.drawable.samsung_galaxy_z_flip,
            "Samsung Galaxy S21 Ultra",
            "Price: 4500 SR",
            false,
            5
        ),Product(
            R.drawable.samsung_galaxy_z_flip,
            "Samsung Galaxy Z Flip3",
            "Price: 5000 SR",
            true,
            70
        ),Product( R.drawable.iphone13,
            "Iphone 13",
            "Price: 6000 SR",
            true,
            36
        )

    )

}