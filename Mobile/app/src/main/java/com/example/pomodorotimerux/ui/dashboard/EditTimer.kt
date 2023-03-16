package com.example.pomodorotimerux.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.pomodorotimerux.R
import com.example.pomodorotimerux.databinding.FragmentEditTimerBinding

class EditTimer : Fragment() {
    private var _binding: FragmentEditTimerBinding? = null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(EditTimerViewModel::class.java)

        _binding = FragmentEditTimerBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEditTimer
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imagebuttonAccept2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_edit_timer_to_navigation_dashboard)
        }
        binding.imagebuttondecline2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_edit_timer_to_navigation_dashboard)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}