package com.example.ui.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.patikaweek3.R
import com.example.ui.mockdata.CoinData

class CoinAdapter(
    private val coinList: MutableList<CoinData>,
    private val listener: CoinLister
) :
    RecyclerView.Adapter<CoinAdapter.CoinViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.coin_item_list, parent, false)
        return CoinViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        holder.bind(coinList[position], listener)
    }

    override fun getItemCount(): Int {
        return coinList.size
    }

    class CoinViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvId = itemView.findViewById<TextView>(R.id.twId)
        private val twCoinName = itemView.findViewById<TextView>(R.id.twcoinName)
        private val twCoinPrice = itemView.findViewById<TextView>(R.id.twPrice)
        private var imgCoinImage = itemView.findViewById<ImageView>(R.id.ivLogo)


        fun bind(coin: CoinData, listener: CoinLister) {
            tvId.text = coin.id
            twCoinName.text = coin.coinName
            twCoinPrice.text = coin.coinPrice
            imgCoinImage.setImageResource(coin.image)



            itemView.setOnClickListener {
                listener.onClicked(coin)
            }

        }
    }
}

interface CoinLister {
    fun onClicked(coin: CoinData)
}