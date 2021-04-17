package com.example.foodrecipes.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodrecipes.R
import com.example.foodrecipes.databinding.FragmentRecipesBinding
import com.example.foodrecipes.ui.adapter.RecipesAdapter


class RecipesFragment : Fragment() {
    private var _binding:FragmentRecipesBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecipesBinding.inflate(inflater,container,false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView(){
        //binding.recyclerView.showShimmer()
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = RecipesAdapter()
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}