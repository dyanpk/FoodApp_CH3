package com.hungry.food_delivery.presentation.fooddetail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.hungry.food_delivery.databinding.FragmentFoodDetailBinding
import com.hungry.food_delivery.model.Food
import java.text.NumberFormat
import java.util.Locale

class FoodDetailFragment : Fragment() {

    private lateinit var binding: FragmentFoodDetailBinding

    private val food: Food? by lazy {
        FoodDetailFragmentArgs.fromBundle(arguments as Bundle).food
    }

    private var quantity = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFoodDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
        showFoodDetail()
        val backButton = binding.ivBack
        backButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setClickListener() {
        binding.clLocation.setOnClickListener{
            navigateToGoogleMap()
        }
        binding.icMinus.setOnClickListener{
            minusQuantity()
        }
        binding.icPlus.setOnClickListener{
            plusQuantity()
        }
    }


    private fun navigateToGoogleMap() {
        val locationUrl = food?.locationUrlFood
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(locationUrl))
        startActivity(intent)
    }

    private fun minusQuantity() {
        if (quantity > 0) {
            quantity--
            updateQuantity()
            updatePrice()
        }
    }

    private fun plusQuantity() {
        quantity++
        updateQuantity()
        updatePrice()
    }

    private fun updateQuantity() {
        binding.tvItemQuantity.text = quantity.toString()
    }

    private fun updatePrice() {
        food?.let { selectedFood ->
            val totalPrice = quantity * selectedFood.priceOfFood
            val formattedTotalPrice = formatPrice(totalPrice)

            val cartButtonText = "Tambah ke Keranjang - $formattedTotalPrice"
            binding.btnAddToCart.text = cartButtonText
        }
    }

    private fun showFoodDetail() {
        food?.let { selectedFood ->
            binding.ivFood.load(selectedFood.imgUrlFood)
            binding.tvNameOfFood.text = selectedFood.nameOfFood

            val formattedPrice = formatPrice(selectedFood.priceOfFood)
            binding.tvPriceOfFood.text = formattedPrice

            binding.tvDescMenu.text = selectedFood.descOfFood
            binding.tvAddressDetail.text = selectedFood.locationOfFood
        }
    }

    private fun formatPrice(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        formatter.maximumFractionDigits = 0
        return formatter.format(price)
    }

}