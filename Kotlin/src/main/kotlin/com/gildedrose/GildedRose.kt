package com.gildedrose

class GildedRose(var items: Array<Item>) {


    fun updateQuality() {
        for (i in items.indices) {
            items[i] = ItemFactory.createCustomizableItem(items[i]).updateItem().toItem()
        }
    }
}

//static object
object ItemFactory {
    fun createCustomizableItem(item: Item): CustomizableItem = when (item.name) {
        "Aged Brie" -> AgedBrie(item)
        "Sulfuras, Hand of Ragnaros" -> HandOfRagnaros(item)
        "Conjured Mana Cake" -> ConjuredItem(item)
        "Backstage passes to a TAFKAL80ETC concert" -> BackStagePass(item)
        else -> CustomizableItem(item)
    }
}

