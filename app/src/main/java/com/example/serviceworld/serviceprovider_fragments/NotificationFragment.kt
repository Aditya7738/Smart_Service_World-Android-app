package com.example.serviceworld.serviceprovider_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.serviceworld.ServiceProviderBottomNavActivity
import com.example.serviceworld.databinding.FragmentNotificationBinding


class NotificationFragment(serviceProviderBottomNavActivity: ServiceProviderBottomNavActivity) : Fragment() {

    lateinit var binding: FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentNotificationBinding.inflate(inflater, container, false)


        return binding.root
    }

}