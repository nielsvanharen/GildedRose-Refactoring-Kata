package com.gildedrose

data class Item(var name: String, var sellIn: Int, var quality: Int) {
    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}

open class CustomizableItem {
    internal var item: Item;

    constructor(item: Item) {
        this.item = item
    }

    open fun updateItem(): CustomizableItem {

        decreaseQuality()

        if (item.sellIn < 0) {
            decreaseQuality()
        }

        item.sellIn = item.sellIn - 1

        if (item.sellIn < 0) {
            decreaseQuality()
        }

        return this
    }

    internal fun increaseQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1
        }

    }

    internal fun decreaseQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1
        }
    }

    fun toItem(): Item {
        return Item(item.name, item.sellIn, item.quality)
    }

}

class AgedBrie(item: Item) : CustomizableItem(item) {
    override fun updateItem(): CustomizableItem {
        increaseQuality()

        item.sellIn = item.sellIn - 1

        if (item.sellIn < 0) {
            increaseQuality()
        }
        
        //for chaining
        return this
    }

}
