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

    private val dataSource: FoodDataSource by lazy {
        FoodDataSourceImpl()
    }

    private val linearLayoutManager: LinearLayoutManager by lazy {
        LinearLayoutManager(requireContext())
    }

    private val gridLayoutManager: GridLayoutManager by lazy {
        GridLayoutManager(requireContext(), 2)
    }

    private val adapter: HomePageAdapter by lazy {
        HomePageAdapter(AdapterLayoutMode.LINEAR) { food: Food ->
            navigateToDetail(food)
        }
    }

    private var isLinearMode = true

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

    private fun setupUpdateIcon() {
        updateIcon()

        binding.inclFoodSelection.ivButton.setOnClickListener {
            isLinearMode = !isLinearMode
            updateIcon()
            if (isLinearMode) {
                switchToListMode()
            } else {
                switchToGridMode()

            }
        }
    }

    private fun updateIcon() {
        val iconResource = if (isLinearMode) R.drawable.ic_grid else R.drawable.ic_list
        binding.inclFoodSelection.ivButton.setImageResource(iconResource)
    }

    private fun switchToGridMode() {
        adapter.adapterLayoutMode = AdapterLayoutMode.GRID
        binding.inclFoodSelection.rvFood.layoutManager = gridLayoutManager
        adapter.submitData(dataSource.getFoods())
    }

    private fun switchToListMode() {
        adapter.adapterLayoutMode = AdapterLayoutMode.LINEAR
        binding.inclFoodSelection.rvFood.layoutManager = linearLayoutManager
        adapter.submitData(dataSource.getFoods())
    }

    private fun setupList() {
        binding.inclFoodSelection.rvFood.layoutManager = linearLayoutManager
        binding.inclFoodSelection.rvFood.adapter = adapter
        adapter.submitData(dataSource.getFoods())
    }

    private fun navigateToDetail(food: Food) {

    }
}
