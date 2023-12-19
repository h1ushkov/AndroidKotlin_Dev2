// NewtabFragment.kt
package com.app.lab2.ui.custom.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.app.lab2.MainActivity
import com.app.lab2.R

class NewtabFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_newtab, container, false)

        // Find the "Back" button by its ID
        val btnBack: Button = view.findViewById(R.id.btnBack)

        // Set an OnClickListener for the "Back" button
        btnBack.setOnClickListener {
            // Create an Intent to navigate back to the previous activity
            val intent = Intent(activity, MainActivity::class.java)

            // You can add any data you want to pass back to the previous activity using intent extras
            // intent.putExtra("key", "value")

            // Start the previous activity
            startActivity(intent)
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: Int): NewtabFragment {
            return NewtabFragment().apply {
                arguments = Bundle().apply {
                    // If you need to pass any arguments to the fragment, you can do it here.
                    putInt(ARG_PARAM1, param1)
                }
            }
        }

        private const val ARG_PARAM1 = "param1"
    }
}