package com.efssoftware.appcredimio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.efssoftware.appcredimio.databinding.FragmentContactoBinding



class ContactoFragment : Fragment() {

    private var _binding: FragmentContactoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentContactoBinding.inflate(inflater, container, false)
        return  binding.root
    }


}