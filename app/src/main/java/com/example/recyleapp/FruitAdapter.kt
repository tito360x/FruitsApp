package com.example.recyleapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class FruitAdapter(private val FruitList: List<Fruit>) : Adapter<FruitAdapter.FruitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitsView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return FruitViewHolder(itemFruitsView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit = FruitList[position]
        holder.bindCharacter(currentFruit)
    }

    override fun getItemCount(): Int {
        return FruitList.size
    }


    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var fruitName: TextView
        private var fruitImage: ImageView

        init {

            fruitName = itemView.findViewById(R.id.fruit_name)
            fruitImage = itemView.findViewById(R.id.fruit_image)
            fruitImage.setOnClickListener {
                val currentFruit = FruitList[layoutPosition]
                val intent = Intent(itemView.context, FruitDetailsActivity :: class.java)
                intent.putExtra("Fruit" , currentFruit)
                itemView.context.startActivity(intent)
                Toast.makeText(itemView.context, currentFruit.fruitName, Toast.LENGTH_SHORT).show()
            }

        }

        fun bindCharacter(character: Fruit) {
            fruitName.text = character.fruitName
            fruitImage.setImageResource(character.fruitImage)



        }


    }
}

