package buu.informatics.s59160141.parkingplace


import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import buu.informatics.s59160141.parkingplace.databinding.FragmentLoginBinding



class Login : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login,container,false)
        binding.btnLogin.setOnClickListener { view ->
            if(true){
                view.findNavController().navigate(R.id.action_login_to_parking)
            }else{

            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }

//menu
}