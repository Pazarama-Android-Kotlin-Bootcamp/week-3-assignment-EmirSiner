package com.example.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.patikaweek3.R
import com.example.ui.mockdata.CoinData


class DetailFragment : Fragment() {
    private lateinit var twCoinName: TextView
    private lateinit var twCoinprice: TextView
    private lateinit var twImageView: ImageView
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
        setCoinData()
    }

    private fun setCoinData() {
        val coinData=args.coinData
        twCoinName.text=coinData.coinName
        twCoinprice.text=coinData.coinPrice
        twImageView.setImageResource(coinData.image)
    }

    private fun setupViews(view: View) {
        twCoinName = view.findViewById(R.id.twDetailCoinname)
        twCoinprice = view.findViewById(R.id.twDetailPrice)
        twImageView = view.findViewById(R.id.ivDetail)


    }
}