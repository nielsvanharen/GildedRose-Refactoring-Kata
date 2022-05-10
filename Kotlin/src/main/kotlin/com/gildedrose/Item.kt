package com.gildedrose

open class Item(var name: String, var sellIn: Int, var quality: Int) {
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

        item.sellIn = item.sellIn - 1

        //Once the sell by date has passed, Quality degrades twice as fast
        if (item.sellIn < 0) {
            decreaseQuality()
        }

        return this
    }

    internal fun increaseQuality() {
        //The Quality of an item is never more than 50
        if (item.quality < 50) {
            item.quality = item.quality + 1
        }

    }

    internal fun decreaseQuality() {
        //The Quality of an item is never negative
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
        //"Aged Brie" actually increases in Quality the older it gets
        increaseQuality()

        item.sellIn = item.sellIn - 1

        //Once the sell by date has passed, Quality degrades twice as fast
        //unsure if the quality for brie increases twice as much when aging??
        if (item.sellIn < 0) {
            increaseQuality()
        }

        //for chaining
        return this
    }

}

class BackStagePass(item: Item) : CustomizableItem(item) {
    override fun updateItem(): CustomizableItem {
        //"Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
        increaseQuality()

        //Quality increases by 2 when there are 10 days or less
        if (item.sellIn < 11) {
            increaseQuality()
        }

        //and by 3 when there are 5 days or less
        if (item.sellIn < 6) {
            increaseQuality()
        }

        item.sellIn = item.sellIn - 1

        //Quality drops to 0 after the concert
        if (item.sellIn < 0) {
            item.quality = 0
        }

        //for chaining
        return this
    }

}

class HandOfRagnaros(item: Item) : CustomizableItem(item) {
    //"Sulfuras", being a legendary item, never has to be sold or decreases in Quality
    //is actually an immutable item
    override fun updateItem(): CustomizableItem {
        return this
    }
}

class ConjuredItem(item: Item) : CustomizableItem(item) {
    //"Conjured" items degrade in Quality twice as fast as normal items
    override fun updateItem(): CustomizableItem {
        decreaseQuality()

        item.sellIn = item.sellIn - 1

        decreaseQuality()

        // i assumed that te quality also decreases twice as fast after the expiry date
        if (item.sellIn < 0) {
            decreaseQuality()
            decreaseQuality()
        }
        return this
    }
}
