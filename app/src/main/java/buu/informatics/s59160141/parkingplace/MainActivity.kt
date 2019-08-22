package buu.informatics.s59160141.parkingplace

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160141.parkingplace.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val slot1: CarData = CarData("","","")
    private val slot2: CarData = CarData("","","")
    private val slot3: CarData = CarData("","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        hide()

        binding.apply {
            slot_1.setOnClickListener{
                click1()
            }
            slot_2.setOnClickListener{
                click2()
            }
            slot_3.setOnClickListener{
                click3()
            }
        }
    }

    private fun hide(){
        binding.apply{
            licensePlate.visibility = View.GONE
            carBrand.visibility = View.GONE
            name.visibility = View.GONE
            update_button.visibility = View.GONE
            delete_button.visibility = View.GONE
        }
    }

    private fun show(){
        binding.apply{
            licensePlate.visibility = View.VISIBLE
            carBrand.visibility = View.VISIBLE
            name.visibility = View.VISIBLE
            update_button.visibility = View.VISIBLE
            delete_button.visibility = View.VISIBLE
        }
    }

    private fun clickSlot(){
//        binding.apply {
//            slot_1.setOnClickListener{
//                click1()
//            }
//            slot_2.setOnClickListener{
//
//            }
//            slot_3.setOnClickListener{
//
//            }
//        }
    }

    private fun click1(){
        show()

        binding.licensePlate.setText(slot1.licensePlate)
        binding.carBrand.setText(slot1.carBrand)
        binding.name.setText(slot1.name)

        update_button.setOnClickListener{
            if(licensePlate.text.toString() != "" && carBrand.text.toString() != "" && name.text.toString() != ""){
                slot1.licensePlate = licensePlate.text.toString()
                slot1.carBrand = carBrand.text.toString()
                slot1.name = name.text.toString()
                slot_1.setBackgroundColor(Color.RED)
                hide()

            }
        }

        delete_button.setOnClickListener{
            binding.licensePlate.setText("")
            binding.carBrand.setText("")
            binding.name.setText("")
            slot1.licensePlate = licensePlate.text.toString()
            slot1.carBrand = carBrand.text.toString()
            slot1.name = name.text.toString()
            slot_1.setBackgroundResource(R.color.slot)
            hide()
        }
    }

    private fun click2(){
        show()

        binding.licensePlate.setText(slot2.licensePlate)
        binding.carBrand.setText(slot2.carBrand)
        binding.name.setText(slot2.name)

        update_button.setOnClickListener{
            if(licensePlate.text.toString() != "" && carBrand.text.toString() != "" && name.text.toString() != ""){
                slot2.licensePlate = licensePlate.text.toString()
                slot2.carBrand = carBrand.text.toString()
                slot2.name = name.text.toString()
                slot_2.setBackgroundColor(Color.RED)
                hide()

            }
        }

        delete_button.setOnClickListener{
            binding.licensePlate.setText("")
            binding.carBrand.setText("")
            binding.name.setText("")
            slot2.licensePlate = licensePlate.text.toString()
            slot2.carBrand = carBrand.text.toString()
            slot2.name = name.text.toString()
            slot_2.setBackgroundResource(R.color.slot)
            hide()
        }
    }

    private fun click3(){
        show()

        binding.licensePlate.setText(slot3.licensePlate)
        binding.carBrand.setText(slot3.carBrand)
        binding.name.setText(slot3.name)

        update_button.setOnClickListener{
            if(licensePlate.text.toString() != "" && carBrand.text.toString() != "" && name.text.toString() != ""){
                slot3.licensePlate = licensePlate.text.toString()
                slot3.carBrand = carBrand.text.toString()
                slot3.name = name.text.toString()
                slot_3.setBackgroundColor(Color.RED)
                hide()

            }
        }

        delete_button.setOnClickListener{
            binding.licensePlate.setText("")
            binding.carBrand.setText("")
            binding.name.setText("")
            slot3.licensePlate = licensePlate.text.toString()
            slot3.carBrand = carBrand.text.toString()
            slot3.name = name.text.toString()
            slot_3.setBackgroundResource(R.color.slot)
            hide()
        }
    }

}
