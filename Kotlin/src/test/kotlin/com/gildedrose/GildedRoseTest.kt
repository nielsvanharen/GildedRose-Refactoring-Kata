package com.gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun test1Day() {
        val items = arrayOf(
            Item("Aged Brie", 2, 0),
            Item("Elixir of the Mongoose", 5, 7),
            Item("Sulfuras, Hand of Ragnaros", 0, 80),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            Item("Conjured Mana Cake", 3, 6)
        )
        val app = GildedRose(items)
        app.updateQuality()
        //Aged Brie
        assertEquals("Aged Brie", app.items[0].name)
        assertEquals(1, app.items[0].quality)
        assertEquals(1, app.items[0].sellIn)

        //Elixir of the Mongoose
        assertEquals("Elixir of the Mongoose", app.items[1].name)
        assertEquals(6, app.items[1].quality)
        assertEquals(4, app.items[1].sellIn)

        //Sulfuras, Hand of Ragnaros
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name)
        assertEquals(80, app.items[2].quality)
        assertEquals(0, app.items[2].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name)
        assertEquals(21, app.items[3].quality)
        assertEquals(14, app.items[3].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name)
        assertEquals(50, app.items[4].quality)
        assertEquals(9, app.items[4].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[5].name)
        assertEquals(50, app.items[5].quality)
        assertEquals(4, app.items[5].sellIn)

        //Conjured Mana Cake
        assertEquals("Conjured Mana Cake", app.items[6].name)
        assertEquals(4, app.items[6].quality)
        assertEquals(2, app.items[6].sellIn)
    }

    @Test
    fun test5Day() {
        val items = arrayOf(
            Item("Aged Brie", 2, 0),
            Item("Elixir of the Mongoose", 5, 7),
            Item("Sulfuras, Hand of Ragnaros", 0, 80),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            Item("Conjured Mana Cake", 3, 6)
        )
        val app = GildedRose(items)
        for (i in 1..5) {
            app.updateQuality()
        }
        //Aged Brie
        assertEquals("Aged Brie", app.items[0].name)
        assertEquals(8, app.items[0].quality)
        assertEquals(-3, app.items[0].sellIn)

        //Elixir of the Mongoose
        assertEquals("Elixir of the Mongoose", app.items[1].name)
        assertEquals(2, app.items[1].quality)
        assertEquals(0, app.items[1].sellIn)

        //Sulfuras, Hand of Ragnaros
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name)
        assertEquals(80, app.items[2].quality)
        assertEquals(0, app.items[2].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name)
        assertEquals(25, app.items[3].quality)
        assertEquals(10, app.items[3].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name)
        assertEquals(50, app.items[4].quality)
        assertEquals(5, app.items[4].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[5].name)
        assertEquals(50, app.items[5].quality)
        assertEquals(0, app.items[5].sellIn)

        //Conjured Mana Cake
        assertEquals("Conjured Mana Cake", app.items[6].name)
        assertEquals(0, app.items[6].quality)
        assertEquals(-2, app.items[6].sellIn)
    }

    @Test
    fun test10Day() {
        val items = arrayOf(
            Item("Aged Brie", 2, 0),
            Item("Elixir of the Mongoose", 5, 7),
            Item("Sulfuras, Hand of Ragnaros", 0, 80),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            Item("Conjured Mana Cake", 3, 50)
        )
        val app = GildedRose(items)
        for (i in 1..10) {
            app.updateQuality()
        }
        //Aged Brie
        assertEquals("Aged Brie", app.items[0].name)
        assertEquals(18, app.items[0].quality)
        assertEquals(-8, app.items[0].sellIn)

        //Elixir of the Mongoose
        assertEquals("Elixir of the Mongoose", app.items[1].name)
        assertEquals(0, app.items[1].quality)
        assertEquals(-5, app.items[1].sellIn)

        //Sulfuras, Hand of Ragnaros
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name)
        assertEquals(80, app.items[2].quality)
        assertEquals(0, app.items[2].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name)
        assertEquals(35, app.items[3].quality)
        assertEquals(5, app.items[3].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name)
        assertEquals(50, app.items[4].quality)
        assertEquals(0, app.items[4].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[5].name)
        assertEquals(0, app.items[5].quality)
        assertEquals(-5, app.items[5].sellIn)

        //Conjured Mana Cake
        assertEquals("Conjured Mana Cake", app.items[6].name)
        assertEquals(16, app.items[6].quality)
        assertEquals(-7, app.items[6].sellIn)
    }

    @Test
    fun test15Day() {
        val items = arrayOf(
            Item("Aged Brie", 2, 0),
            Item("Elixir of the Mongoose", 5, 7),
            Item("Sulfuras, Hand of Ragnaros", 0, 80),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        )
        val app = GildedRose(items)
        for (i in 1..15) {
            app.updateQuality()
        }
        //Aged Brie
        assertEquals("Aged Brie", app.items[0].name)
        assertEquals(28, app.items[0].quality)
        assertEquals(-13, app.items[0].sellIn)

        //Elixir of the Mongoose
        assertEquals("Elixir of the Mongoose", app.items[1].name)
        assertEquals(0, app.items[1].quality)
        assertEquals(-10, app.items[1].sellIn)

        //Sulfuras, Hand of Ragnaros
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name)
        assertEquals(80, app.items[2].quality)
        assertEquals(0, app.items[2].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name)
        assertEquals(50, app.items[3].quality)
        assertEquals(0, app.items[3].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name)
        assertEquals(0, app.items[4].quality)
        assertEquals(-5, app.items[4].sellIn)

        //Backstage passes to a TAFKAL80ETC concert
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[5].name)
        assertEquals(0, app.items[5].quality)
        assertEquals(-10, app.items[5].sellIn)
    }

}


