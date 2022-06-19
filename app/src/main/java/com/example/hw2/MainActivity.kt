package com.example.hw2

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.widget.Toast
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.example.hw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var listURI: ArrayList<Uri> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shit()

        binding.btnGo.setOnClickListener {

            val url = Uri.parse(binding.etText.text.toString())

            if (URLUtil.isValidUrl(url.toString())) {

                Glide.with(this)
                    .load(url)
                    .into(binding.ivImage)
                listURI.add(Uri.parse(binding.etText.text.toString()))
                Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, getString(R.string.valid_url), Toast.LENGTH_SHORT).show()

            }
        }

        binding.btnRandom.setOnClickListener {

            val random = (0 until listURI.size).random()

            Glide.with(this)
                .load(listURI[random])
                .into(binding.ivImage)

        }
    }

    fun shit() {
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())
        listURI.add("https://cdn.publish0x.com/prod/fs/images/e6e3cf4d0bae5377893cc6f3566fc2a25c97326522cc6531db7aea15e9c699f0.jpeg".toUri())

    }
}