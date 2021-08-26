package com.efssoftware.appcredimio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.efssoftware.appcredimio.databinding.FragmentClientesBinding


class ClientesFragment : Fragment() {



    private var _binding: FragmentClientesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{


        _binding = FragmentClientesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       val myWebView: WebView = binding.webView
        myWebView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true

            }
        }

        myWebView.loadUrl("https://credimiosas.com.co/wsiafscoring/" )
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true
        myWebView.settings.javaScriptCanOpenWindowsAutomatically = true
        myWebView.settings.loadsImagesAutomatically = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}