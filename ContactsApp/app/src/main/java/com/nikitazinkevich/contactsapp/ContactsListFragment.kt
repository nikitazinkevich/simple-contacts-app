package com.nikitazinkevich.contactsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nikitazinkevich.contactsapp.databinding.FragmentContactsListBinding

/**
 * A simple [Fragment] subclass.
 */
class ContactsListFragment : Fragment() {

    private lateinit var binding: FragmentContactsListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactsListBinding.inflate(inflater)
        binding.contactsListRecyclerview.adapter = ContactsListAdapter()

        return binding.root
    }

}
