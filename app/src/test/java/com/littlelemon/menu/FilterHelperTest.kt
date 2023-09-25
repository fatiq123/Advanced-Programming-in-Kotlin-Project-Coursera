package com.littlelemon.menu

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class FilterHelperTest {

    @org.junit.jupiter.api.Test
    fun filterProducts() {

    }

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        // Declare a variable list with several items of different categories
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )

        // Execute FilterHelper.filterProducts and pass Dessert as FilterType
        val filteredList = FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        // Test the result, expect the result to contain only croissant
        assertEquals(1, filteredList.size) // Expecting only one item
        assertEquals(7.00, filteredList[0].price, 0.01) // Use delta for double comparison
        assertEquals("Dessert", filteredList[0].category)
        assertEquals(R.drawable.croissant, filteredList[0].image)
    }
}