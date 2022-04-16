package com.kasra.marin

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.kasra.marinewebview.MarineWebView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<MarineWebView>(R.id.web_view)
        webView.loadUrl("www.google.com")
        val readButton = findViewById<AppCompatButton>(R.id.submit)
        readButton.setOnClickListener {
            webView.callFunction("javascript:read()")
        }
        webView.callback = { res ->

        }
    }
}