package com.example.weplantpractica

import android.os.Bundle
import android.net.Uri
import android.widget.MediaController
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.weplantpractica.databinding.FragmentCommunityBinding
import android.media.MediaPlayer

import android.media.MediaPlayer.OnVideoSizeChangedListener

import android.media.MediaPlayer.OnPreparedListener




class FragmentCommunity : Fragment() {
    lateinit var binding: FragmentCommunityBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCommunityBinding.inflate(inflater, container, false)
        val path = "android.resource://com.example.weplantpractica/" + R.raw.video
        binding.videoView.setVideoURI(Uri.parse(path))
        binding.videoView.setOnPreparedListener{ mp ->
            mp.setOnVideoSizeChangedListener { mp, width, height ->
                val mc = MediaController(context)
                binding.videoView.setMediaController(mc)
                mc.setAnchorView(binding.videoView)
            }
        }
        binding.videoView.start()
//        val mediaController = MediaController(context)
//        mediaController.setAnchorView(binding.videoView)
//        binding.videoView.setVideoURI(Uri.parse(path))
//        binding.videoView.setMediaController(mediaController)
//        binding.videoView.requestFocus()
//        binding.videoView.start()
//        mediaController.setPadding(0, 230, 0, 500)
        return binding.root
    }
}