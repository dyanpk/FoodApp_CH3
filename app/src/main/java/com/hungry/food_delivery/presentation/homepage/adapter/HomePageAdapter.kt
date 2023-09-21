package com.hungry.food_delivery.presentation.homepage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.hungry.food_delivery.core.ViewHolderBinder
import com.hungry.food_delivery.databinding.ItemGridFoodBinding
import com.hungry.food_delivery.databinding.ItemLinearFoodBinding
import com.hungry.food_delivery.model.Food

class HomePageAdapter(
    var adapterLayoutMode: AdapterLayoutMode,
    private val onClickListener: (Food) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    private val dataDiffer = AsyncListDiffer(this,object : DiffUtil.ItemCallback<Food>(){
        override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.id == newItem.id &&
                    oldItem.nameOfFood == newItem.nameOfFood &&
                    oldItem.imgUrlFood == newItem.imgUrlFood &&
                    oldItem.priceOfFood == newItem.priceOfFood

        }

        override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    })

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when (viewType){
            AdapterLayoutMode.LINEAR.ordinal -> {
                LinearFoodItemViewHolder(
                    binding = ItemLinearFoodBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false
                    ), onClickListener
                )
            }
            else ->{
                GridFoodItemViewHolder(
                    binding = ItemGridFoodBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false
                    ), onClickListener
                )
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as ViewHolderBinder<Food>).bind(dataDiffer.currentList[position])
    }

    override fun getItemCount(): Int = dataDiffer.currentList.size

    override fun getItemViewType(position: Int): Int {
        return adapterLayoutMode.ordinal
    }

    fun submitData(data : List<Food>){
        dataDiffer.submitList(data)
    }

    fun refreshList() {
        notifyItemRangeChanged(0,dataDiffer.currentList.size)
    }
}