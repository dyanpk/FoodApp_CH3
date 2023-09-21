package com.hungry.food_delivery.presentation.homepage.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.hungry.food_delivery.core.ViewHolderBinder
import com.hungry.food_delivery.databinding.ItemGridFoodBinding
import com.hungry.food_delivery.databinding.ItemLinearFoodBinding
import com.hungry.food_delivery.model.Food
import java.text.NumberFormat
import java.util.Locale

class LinearFoodItemViewHolder(
    private val binding: ItemLinearFoodBinding,
    private val onClickListener: (Food) -> Unit
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Food> {

    override fun bind(item: Food){
        binding.ivFood.load(item.imgUrlFood)
        binding.tvNameOfFood.text = item.nameOfFood

        val formattedPrice = formatPrice(item.priceOfFood)
        binding.tvPriceOfFood.text = formattedPrice

        binding.root.setOnClickListener{
            onClickListener.invoke(item)
        }
    }

    private fun formatPrice(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        formatter.maximumFractionDigits = 0
        return formatter.format(price)
    }
}

class GridFoodItemViewHolder(
    private val binding: ItemGridFoodBinding,
    private val onClickListener: (Food) -> Unit
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Food> {

    override fun bind(item: Food){
        binding.ivFood.load(item.imgUrlFood)
        binding.tvNameOfFood.text = item.nameOfFood

        val formattedPrice = formatPrice(item.priceOfFood)
        binding.tvPriceOfFood.text = formattedPrice

        binding.root.setOnClickListener{
            onClickListener.invoke(item)
        }

    }

    private fun formatPrice(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        formatter.maximumFractionDigits = 0
        return formatter.format(price)
    }
}