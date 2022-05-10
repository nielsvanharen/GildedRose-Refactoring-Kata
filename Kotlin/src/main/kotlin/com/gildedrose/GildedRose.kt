package com.gildedrose

class GildedRose(var items: Array<Item>) {


    fun updateQuality() {
        for (i in items.indices) {
            if (items[i].name.equals("Aged Brie")) {
                items[i] = AgedBrie(items[i]).updateItem().toItem()
            }
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                items[i] = BackStagePass(items[i]).updateItem().toItem()
            }
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i] = HandOfRagnaros(items[i]).updateItem().toItem()
            }
            if (items[i].name.equals("Elixir of the Mongoose")) {
                items[i] = CustomizableItem(items[i]).updateItem().toItem()
            }
            if (items[i].name.equals("Conjured Mana Cake")) {
                items[i] = ConjuredItem(items[i]).updateItem().toItem()
            }
        }
    }
}

