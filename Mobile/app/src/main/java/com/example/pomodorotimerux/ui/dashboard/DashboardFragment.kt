package com.example.pomodorotimerux.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.pomodorotimerux.R
import com.example.pomodorotimerux.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val dashboardViewModel =
          //  ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        //dashboardViewModel.text.observe(viewLifecycleOwner) {
          //  textView.text = it
        //}
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButton2Edit.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_dashboard_to_navigation_edit_timer)
        }
        binding.imageButton4EditFocus.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_dashboard_to_navigation_edit_focus)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}