package com.efssoftware.appcredimio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.efssoftware.appcredimio.databinding.FragmentEmpresaBinding


class EmpresaFragment : Fragment() {

    private var _binding: FragmentEmpresaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEmpresaBinding.inflate(inflater, container, false)
        return  binding.root
    }


}