package com.hungry.food_delivery.data

import com.hungry.food_delivery.model.Food

interface FoodDataSource{
    fun getFoods(): List<Food>
}

class FoodDataSourceImpl() : FoodDataSource {
    override fun getFoods(): List<Food> = listOf(
        Food(
            nameOfFood = "Ayam Bakar",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_grilled_chicken.jpg?raw=true",
            priceOfFood = 50000.0
        ),
        Food(
            nameOfFood = "Ayam Goreng",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_fried_chicken.jpg?raw=true",
            priceOfFood = 45000.0
        ),
        Food(
            nameOfFood = "Ayam Geprek",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_geprek_chicken.jpg?raw=true",
            priceOfFood = 48000.0
        ),
        Food(
            nameOfFood = "Burger",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_burger.jpg?raw=true",
            priceOfFood = 55000.0
        ),
        Food(
            nameOfFood = "Dimsum",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_dimsum.jpg?raw=true",
            priceOfFood = 30000.0
        ),
        Food(
            nameOfFood = "Pizza",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_pizza.jpg?raw=true",
            priceOfFood = 65000.0
        ),
        Food(
            nameOfFood = "Sate Ayam",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_chicken_satay.jpg?raw=true",
            priceOfFood = 40000.0
        ),
        Food(
            nameOfFood = "Sate Kambing",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_lamb_satay.jpg?raw=true",
            priceOfFood = 60000.0
        ),
        Food(
            nameOfFood = "Sate Kulit Ayam",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_chicken_skin_satay.jpg?raw=true",
            priceOfFood = 35000.0
        ),
        Food(
            nameOfFood = "Kentang Goreng",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_french_fries.jpg?raw=true",
            priceOfFood = 25000.0
        ),
        Food(
            nameOfFood = "Latte",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_latte.jpg?raw=true",
            priceOfFood = 35000.0
        ),
        Food(
            nameOfFood = "Susu Stroberi",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_strawberry_milk.jpg?raw=true",
            priceOfFood = 30000.0
        ),
        Food(
            nameOfFood = "Sushi",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_sushi.jpg?raw=true",
            priceOfFood = 70000.0
        ),
        Food(
            nameOfFood = "Spaghetti",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_spaghetti.jpg?raw=true",
            priceOfFood = 40000.0
        )
    )
}