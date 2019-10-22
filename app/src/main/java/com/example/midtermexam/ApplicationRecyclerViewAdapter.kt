package com.example.midtermexam

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApplicationRecyclerViewAdapter(private val app: List<App>) :
    RecyclerView.Adapter<ApplicationRecyclerViewAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_app, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(app[position])
    }

    override fun getItemCount(): Int = app.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvName: TextView = itemView.findViewById(R.id.tv_name)
        private val tvDescription: TextView = itemView.findViewById(R.id.tv_description)
        private val tvPower: TextView = itemView.findViewById(R.id.tv_power)
        private val ivPhoto: ImageView = itemView.findViewById(R.id.iv_photo)



        fun bind(app: App) {
            tvName.text = app.name
            ivPhoto.setImageResource(app.imgRes)
            tvDescription.text = app.description
            tvPower.text = app.power

            itemView.setOnClickListener {
                Intent(context, DetailActivity::class.java).also {
                    it.putExtra("app", app)
                    context.startActivity(it)
                }
            }
        }
    }
}