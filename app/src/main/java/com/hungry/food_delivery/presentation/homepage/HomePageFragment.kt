package com.hungry.food_delivery.presentation.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.hungry.food_delivery.R
import com.hungry.food_delivery.data.FoodDataSource
import com.hungry.food_delivery.data.FoodDataSourceImpl
import com.hungry.food_delivery.databinding.FragmentHomePageBinding
import com.hungry.food_delivery.model.Food
import com.hungry.food_delivery.presentation.homepage.adapter.AdapterLayoutMode
import com.hungry.food_delivery.presentation.homepage.adapter.HomePageAdapter


class HomePageFragment : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    private val dataSource: FoodDataSource by lazy { FoodDataSourceImpl() }

    private val gridLayoutManager: GridLayoutManager by lazy { GridLayoutManager(requireContext(), 2) }

    private val linearLayoutManager: LinearLayoutManager by lazy { LinearLayoutManager(requireContext())}

    private var isLinearMode = true

    private val adapter: HomePageAdapter by lazy {
        HomePageAdapter(AdapterLayoutMode.LINEAR) { food: Food ->
            navigateToDetail(food)
        }
    }

    private fun navigateToDetail(food: Food) {
        findNavController().navigate(
            HomePageFragmentDirections.actionHomePageFragmentToFoodDetailFragment(food)
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupList()
        setupUpdateIcon()
    }

    private fun setupList() {
        val span = if(adapter.adapterLayoutMode == AdapterLayoutMode.LINEAR) 1 else 2
        binding.inclFoodSelection.rvFood.apply {
            layoutManager = GridLayoutManager(requireContext(),span)
            adapter = this@HomePageFragment.adapter
        }
        adapter.submitData(dataSource.getFoods()
        )
    }

    private fun setupUpdateIcon() {
        binding.inclFoodSelection.ivButton.setOnClickListener {
            switchLayoutMode()
            updateIcon()
        }
    }

    private fun switchLayoutMode() {
        isLinearMode = !isLinearMode
        setLayoutManagerAndMode(if (isLinearMode) AdapterLayoutMode.LINEAR else AdapterLayoutMode.GRID)
    }

    private fun updateIcon() {
        val iconResource = if (isLinearMode) R.drawable.ic_grid else R.drawable.ic_list
        binding.inclFoodSelection.ivButton.setImageResource(iconResource)
    }


    private fun setLayoutManagerAndMode(mode: AdapterLayoutMode) {
        val layoutManager = if (mode == AdapterLayoutMode.LINEAR) linearLayoutManager else gridLayoutManager
        binding.inclFoodSelection.rvFood.layoutManager = layoutManager
        adapter.adapterLayoutMode = mode
        adapter.submitData(dataSource.getFoods())
    }


}
