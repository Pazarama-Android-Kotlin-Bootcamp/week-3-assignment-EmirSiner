package com.example.ui.mockdata

import android.os.Parcelable
import com.bumptech.glide.Glide
import com.example.patikaweek3.R
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class CoinData(
    val id: String,
    val coinName: String,
    val coinPrice: String,
    val image:Int

) : Parcelable

//atılacak dosyaları kendim yazdım.
val coinListData = mutableListOf<CoinData>(
    CoinData(
        "1",
        "Bitcoin",
        "100$",
        //R.drawable drawable klasöründen image çekmek için kullandım.
       R.drawable.bitcoin
    ),
    CoinData(
        "2",
        "Mana",
        "200$",
        R.drawable.mana

    ),
    CoinData(
        "3",
        "Ethereum",
        "400$",
        R.drawable.ethereum

    ),
    CoinData(
        "4",
        "Luna",
        "400$",
        R.drawable.luna
    ),
    CoinData(
        "5",
        "Enjin",
        "400$",
        R.drawable.enjin
    ),
    CoinData(
        "6",
        "Litecoin",
        "400$",
        R.drawable.ltc
    ),
    CoinData(
        "7",
        "Shiba",
        "400$",
        R.drawable.shiba
    ),
    CoinData(
        "8",
        "Doge",
        "400$",
        R.drawable.dogecoin
    ),

)

