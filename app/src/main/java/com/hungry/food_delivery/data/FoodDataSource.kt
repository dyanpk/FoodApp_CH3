package com.hungry.food_delivery.data

import com.hungry.food_delivery.model.Food

interface FoodDataSource{
    fun getFoods(): List<Food>
}

class FoodDataSourceImpl : FoodDataSource {
    override fun getFoods(): List<Food> = listOf(
        Food(
            nameOfFood = "Ayam Bakar",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_grilled_chicken.jpg?raw=true",
            priceOfFood = 50000.0,
            descOfFood = "Ayam Bakar adalah hidangan lezat dengan ayam yang dipanggang dan bumbu khas Indonesia.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Ayam Goreng",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_fried_chicken.jpg?raw=true",
            priceOfFood = 45000.0,
            descOfFood = "Ayam Goreng adalah hidangan klasik dengan ayam yang digoreng garing dan renyah.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Ayam Geprek",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_geprek_chicken.jpg?raw=true",
            priceOfFood = 48000.0,
            descOfFood = "Ayam Geprek adalah hidangan ayam yang digeprek dan disajikan dengan sambal pedas.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Burger",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_burger.jpg?raw=true",
            priceOfFood = 55000.0,
            descOfFood = "Burger adalah hidangan cepat saji yang terdiri dari daging, sayuran, dan saus di dalam roti.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Dimsum",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_dimsum.jpg?raw=true",
            priceOfFood = 30000.0,
            descOfFood = "Dimsum adalah hidangan Cina yang terdiri dari berbagai jenis makanan kecil seperti pangsit dan bakpao.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Pizza",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_pizza.jpg?raw=true",
            priceOfFood = 65000.0,
            descOfFood = "Pizza adalah hidangan Italia yang terdiri dari adonan tipis yang diisi dengan berbagai topping seperti keju, tomat, dan daging.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Sate Ayam",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_chicken_satay.jpg?raw=true",
            priceOfFood = 40000.0,
            descOfFood = "Sate Ayam adalah hidangan Indonesia yang terdiri dari potongan-potongan ayam yang ditusuk dan dipanggang dengan bumbu kacang.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Sate Kambing",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_lamb_satay.jpg?raw=true",
            priceOfFood = 60000.0,
            descOfFood = "Sate Kambing adalah hidangan Indonesia yang terbuat dari daging kambing yang dipanggang dengan bumbu kacang.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Sate Kulit Ayam",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_chicken_skin_satay.jpg?raw=true",
            priceOfFood = 35000.0,
            descOfFood = "Sate Kulit Ayam adalah hidangan Indonesia yang terbuat dari kulit ayam yang dipanggang dengan bumbu kacang.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Kentang Goreng",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_french_fries.jpg?raw=true",
            priceOfFood = 25000.0,
            descOfFood = "Kentang Goreng adalah hidangan kentang yang digoreng garing dan sering disajikan dengan saus.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Latte",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_latte.jpg?raw=true",
            priceOfFood = 35000.0,
            descOfFood = "Latte adalah minuman kopi yang terbuat dari espresso dan susu, sering dihiasi dengan foam susu di atasnya.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Susu Stroberi",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_strawberry_milk.jpg?raw=true",
            priceOfFood = 30000.0,
            descOfFood = "Susu Stroberi adalah minuman susu dengan rasa stroberi yang manis dan segar.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Sushi",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_sushi.jpg?raw=true",
            priceOfFood = 70000.0,
            descOfFood = "Sushi adalah hidangan Jepang yang terdiri dari nasi yang dibentuk dengan topping seperti ikan, sayuran, atau telur.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        ),
        Food(
            nameOfFood = "Spaghetti",
            imgUrlFood = "https://github.com/dyanpk/FoodApp_CH3/blob/feature/feature_page_home/asset/food_image/img_spaghetti.jpg?raw=true",
            priceOfFood = 40000.0,
            descOfFood = "Spaghetti adalah hidangan Italia yang terdiri dari pasta yang disajikan dengan berbagai jenis saus.",
            locationOfFood = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
            locationUrlFood = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"
        )
    )
}
