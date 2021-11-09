package com.example.fragmentsphonesproducts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsphonesproducts.databinding.FragmentPurchaseBinding


/**
 * A simple [Fragment] subclass.
 * Use the [purchaseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class purchaseFragment : Fragment() {
    private var _binding: FragmentPurchaseBinding? = null
    private val binding get() = _binding!!
    private lateinit var buyId: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentPurchaseBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {

            binding.phoneImage.setImageResource(it.getInt("image"))
            binding.price.text =it.getString("price")
            binding.productName.text = it.getString("productName")

        }


}
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}