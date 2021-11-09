package com.example.fragmentsphonesproducts.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsphonesproducts.PhonesFragment
import com.example.fragmentsphonesproducts.PhonesFragmentDirections
import com.example.fragmentsphonesproducts.R
import com.example.fragmentsphonesproducts.data.DataSource
import com.example.fragmentsphonesproducts.model.Product


class PhonesProductsAdapter(
    private val context: Context,
    private val productSet: List<Product> =  DataSource.products) : RecyclerView.Adapter<PhonesProductsAdapter.PhonesProductViewHolder>() {


    class PhonesProductViewHolder( val view: View?) : RecyclerView.ViewHolder(view!!) {
        val imageView: ImageView? = view?.findViewById(R.id.phoneImage)
        val textViewName: TextView? = view?.findViewById(R.id.productName)
        val textViewPrice: TextView? = view?.findViewById(R.id.price)
        val vipImage: ImageView? = view?.findViewById(R.id.vipMark)
        val buttonpressView: Button? = view?.findViewById(R.id.buyButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhonesProductViewHolder {
        val adpterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return PhonesProductViewHolder(adpterLayout)
    }



    override fun onBindViewHolder(holder: PhonesProductViewHolder, position: Int) {
        val item = productSet[position]
        holder.imageView!!.setImageResource(item.imageResourceId)
        holder.textViewName!!.text = item.productName
        holder.textViewPrice!!.text = item.productPrice
        holder.vipImage!!.isVisible = item.isVip
        holder.buttonpressView!!.setOnClickListener {

           if (item.quantityNumber > 0) {
                Toast.makeText(context, "the item ", Toast.LENGTH_LONG).show()
             val action = PhonesFragmentDirections.actionPhonesFragmentToPurchaseFragment(
                    image = item.imageResourceId,
                    productName = item.productName,
                    price = item.productPrice
                )

//                val intent = Intent(context, MainActivityActuial::class.java )
//                intent.putExtra("phoneImage", item.imageResourceId )
//                intent.putExtra("productName", item.productName )
//                intent.putExtra("price", item.productPrice )
//                it?.context?.startActivity(intent)
               holder.view?.findNavController()?.navigate(action)
            } else {
                Toast.makeText(context, "the item is not available", Toast.LENGTH_LONG).show()
            }
}

    }

        override fun getItemCount(): Int {
            return productSet.size

        }


}