package com.example.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.patikaweek3.R
import com.example.ui.mockdata.CoinData
import com.example.ui.mockdata.coinListData
import com.example.ui.recyclerview.CoinAdapter
import com.example.ui.recyclerview.CoinLister



class ListFragment : Fragment(), CoinLister {
    private lateinit var rvCoinList: RecyclerView
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvCoinList = view.findViewById(R.id.rvCoinList)
        setupAdapter()

    }

    private fun setupAdapter() {
        rvCoinList.adapter = CoinAdapter(coinListData, this)

    }

    override fun onClicked(coin: CoinData) {
        navController.navigate(ListFragmentDirections.actionListFragmentToDetailFragment(coin))
    }



}
