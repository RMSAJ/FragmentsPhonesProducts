package com.example.fragmentsphonesproducts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsphonesproducts.adapter.PhonesProductsAdapter
import com.example.fragmentsphonesproducts.data.DataSource
import com.example.fragmentsphonesproducts.databinding.FragmentPhonesBinding



/**
 * A simple [Fragment] subclass.
 * Use the [PhonesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PhonesFragment : Fragment() {

    private var _binding: FragmentPhonesBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPhonesBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


      binding.recyclerView.adapter = PhonesProductsAdapter(this.requireContext() )
        binding.recyclerView.setHasFixedSize(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}