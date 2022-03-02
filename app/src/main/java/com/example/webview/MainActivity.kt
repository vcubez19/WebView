package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUp()
    }


    private fun setUp() {
        val webView = findViewById<WebView>(R.id.web_view)
        webView.webViewClient = WebViewClient()


        webView.apply {
            loadUrl("https://www.apple.com")
        }


    }


    override fun onBackPressed() {
        super.onBackPressed()
        val webView = findViewById<WebView>(R.id.web_view)
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }


}

