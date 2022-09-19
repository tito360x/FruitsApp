package com.example.recyleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview = findViewById(R.id.main_recycleview)
        val listOfCharacters = getListOfCharacters()
        val fruitadapter = FruitAdapter(listOfCharacters)
        recyclerview.adapter = fruitadapter
    }

    private fun getListOfCharacters(): List<Fruit> {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Apple", R.drawable.apple, "An apple is an edible fruit produced by an apple tree (Malus domestica)." +
                " Apple trees are cultivated worldwide and are the most " +
                "widely grown species in the genus Malus. The tree originated in Central Asia,"))
        fruits.add(Fruit("Banana", R.drawable.banana, "A banana is an elongated, edible fruit – botanically a berry[1][2] – produced by several kinds of large herbaceous flowering plants in the genus Musa."))
        fruits.add(Fruit("BlackBerry", R.drawable.blackberry, "The blackberry is an edible fruit produced by many species in the genus Rubus in the family Rosaceae, hybrids among these species within the subgenus Rubus, and hybrids between the subgenera Rubus and Idaeobatus"))
        fruits.add(Fruit("Coconut", R.drawable.coconut, "the term coconut (or the archaic can refer to the whole coconut palm, the seed, or the fruit, which botanically is a drupe, not a nut"))
        fruits.add(Fruit("DragonFruit", R.drawable.dragonfruit, "s the fruit of several different cactus species indigenous to the Americas.[1][2] Pitaya usually refers to fruit of the genus Stenocereus, while pitahaya or dragon fruit "))
        fruits.add(Fruit("Grapes", R.drawable.grapes, "A grape is a fruit, botanically a berry, of the deciduous woody vines of the flowering plant genus Vitis. Grapes are a non-climacteric type of fruit, generally occurring in clusters."))
        fruits.add(Fruit("Kiwi", R.drawable.kiwi1, "s the edible berry of several species of woody vines in the genus Actinidia."))
        fruits.add(Fruit("Mango", R.drawable.mango, "The blackberry is an edible fruit produced by many species in the genus Rubus in the family Rosaceae, hybrids among these species within the subgenus Rubus, and hybrids between the subgenera Rubus and Idaeobatus"))
        fruits.add(Fruit("Orange", R.drawable.orange, "An orange is a fruit of various citrus species in the family Rutaceae (see list of plants known as orange); it primarily refers to Citrus × sinensis,[1] which is also called sweet orange,"))
        fruits.add(Fruit("Peach", R.drawable.peach, "The peach (Prunus persica) is a deciduous tree first domesticated and cultivated in Zhejiang province of Eastern China.[3] It bears edible juicy fruits with various characteristics"))
        fruits.add(Fruit("Pear", R.drawable.pear, "Pears are fruits produced and consumed around the world, growing on a tree and harvested in the Northern Hemisphere in late summer into October"))
        fruits.add(Fruit("Pineapple", R.drawable.pinnable, "is a tropical plant with an edible fruit; it is the most economically significant plant in the family Bromeliaceae.["))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry, "is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries, which are cultivated worldwide for their fruit."))
        fruits.add(Fruit("Tangerine", R.drawable.tangerine, "The tangerine is a type of citrus fruit that is orange in color. Its scientific name varies. It has been treated as a separate species under the name Citrus tangerina or Citrus × tangerina,"))

        return fruits
    }
}