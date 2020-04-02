package com.nikitazinkevich.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nikitazinkevich.contactsapp.databinding.ItemContactsListBinding

class ContactsListAdapter : ListAdapter<User, ContactsListAdapter.ViewHolder>(ItemCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.fill(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder private constructor(private val binding: ItemContactsListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun fill(parent: ViewGroup): ViewHolder {
                val binding = ItemContactsListBinding.inflate(LayoutInflater.from(parent.context))
                return ViewHolder(binding)
            }
        }

        fun bind(item: User) {
            binding.userName.text = "${item.secondName} + ${item.firstName}"
            binding.userPhone.text = item.phoneNumber
        }

    }

    class ItemCallback : DiffUtil.ItemCallback<User>() {

        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem._id == newItem._id
        }

    }
}