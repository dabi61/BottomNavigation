package com.example.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.activityViewModels
import com.example.bottomnavigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    val shareViewModel: ShareViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        //phục hồi text vàp edittext
        binding.tvHome.setText(shareViewModel.text)
        //cập nhật khi edittext thay đổi
        binding.tvHome.addTextChangedListener {
            shareViewModel.text = it.toString()
        }
        return binding.root
    }

}

// 2 them phuc hoi va cap nhat phai di chung voi nhau
// luc nay activity co the truy cap duoc tat ca du lieu trong fragment