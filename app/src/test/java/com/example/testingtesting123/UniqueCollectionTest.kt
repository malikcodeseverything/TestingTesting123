package com.example.testingtesting123

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val currentSize = collection.size()

        collection.addItem(Item("item1"))

        val newSize = collection.size()
        assert(newSize == currentSize + 1 && collection.get(newSize - 1) == (Item("item1")))

    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("item2"))
        collection.addItem(Item("item3"))


        assert(collection.size() == 2) { "Third item was added" }
        assert(collection.get(0) != collection.get(1)) { "2 items match" }

    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}