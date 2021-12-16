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
import android.R




class FragmentCommunity : Fragment() {
    lateinit var binding: FragmentCommunityBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCommunityBinding.inflate(inflater, container, false)
//        val vidAddress = "https://www.youtube.com/watch?v=B_hRf0J4RLc"
//        val vidUri = Uri.parse(vidAddress)
//        binding.videoView.setVideoURI(vidUri)
//        binding.videoView.start()
//        val mediaController = MediaController(context)
//        mediaController.setAnchorView(binding.videoView)
//        binding.videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=B_hRf0J4RLc"))
//        binding.videoView.setMediaController(mediaController)
//        binding.videoView.requestFocus()
//        binding.videoView.start()
        //binding.videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=B_hRf0J4RLc"))

//       val path = "android.resource://" + getPackageName() + "/" + R.raw.video
//        binding.videoView.setVideoURI(Uri.parse(path))
//        binding.btnPlay.setOnClickListener {
//            val isPlaying = binding.videoView.isPlaying
//            binding.btnPlay.setText(if (isPlaying) R.string.play else R.string.pause)
//
//            val msg = getString(if (isPlaying) R.string.paused else R.string.playing)
//            if (isPlaying) {
//                binding.videoView.pause()
//            } else {
//                binding.videoView.start()
//            }
//        }
//
//        binding.videoView.setOnCompletionListener {
//            binding.btnPlay.text = getString(R.string.play)
//        }

        return binding.root
    }
}