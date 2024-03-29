package buu.informatics.s59160141.parkingplace


import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160141.parkingplace.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


class Login : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login,container,false)

        binding.alertText.visibility = View.GONE

        binding.btnLogin.setOnClickListener { view ->
            if(username.text.toString() == "username" && password.text.toString() == "password"){
                view.findNavController().navigate(R.id.action_login_to_parking)
            }else{
                binding.alertText.visibility = View.VISIBLE
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }

//menu
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.option_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
