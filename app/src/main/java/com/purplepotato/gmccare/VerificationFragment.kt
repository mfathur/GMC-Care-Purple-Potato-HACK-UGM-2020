package com.purplepotato.gmccare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_verification.*

class VerificationFragment : Fragment(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_verification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnAddVerificationPhoto.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnAddVerificationPhoto -> {
                //code for open camera and save the result to firebase

                val action = VerificationFragmentDirections.fromVerificationToHomeFragment()
                Navigation.findNavController(btnAddVerificationPhoto).navigate(action)
            }
        }
    }

}