package com.example.dialogue

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
    import androidx.databinding.DataBindingUtil
import com.example.dialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        with(binding) {
            btn1.setOnClickListener {
                val builder1 = AlertDialog.Builder(this@MainActivity)
                builder1.setTitle("Are You Sure")
                builder1.setMessage("Do you want to close the App")
                builder1.setIcon(R.drawable.baseline_exit_to_app_24)
                builder1.setPositiveButton(
                    "Yes",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        //what section is performed when yes is clicked
                        finish()
                    })
                builder1.setNegativeButton(
                    "No",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        //what action is performed when No is clicked


                    })
                builder1.show()
            }
            btn2.setOnClickListener {
                val options = arrayOf("gulab jamun", "Rasmalai", "Rasgulla")
                val builder2 = AlertDialog.Builder(this@MainActivity)
                builder2.setTitle("which is your favourite sweets")
                builder2.setSingleChoiceItems(
                    options,
                    0,
                    DialogInterface.OnClickListener { dialog, which ->
                        //what action should be performed
                        Toast.makeText(
                            this@MainActivity,
                            "You clicked on ${options[which]}",
                            Toast.LENGTH_SHORT
                        ).show()
                    })
                builder2.setPositiveButton(
                    "Submit",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        //what section is performed when yes is clicked

                    })
                builder2.setNegativeButton(
                    "Declined",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        //what action is performed when No is clicked


                    })
                builder2.show()
            }
            btn3.setOnClickListener {
                val options = arrayOf("gulab jamun", "Rasmalai", "Rasgulla")
                val builder2 = AlertDialog.Builder(this@MainActivity)
                builder2.setTitle("which is your favourite sweets")
                builder2.setMultiChoiceItems(
                    options,
                    null,
                    DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                        Toast.makeText(
                            this@MainActivity,
                            "You clicked on ${options[which]}",
                            Toast.LENGTH_SHORT
                        ).show()

                    })
                builder2.setPositiveButton(
                    "Submit",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        //what section is performed when yes is clicked

                    })
                builder2.setNegativeButton(
                    "Declined",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        //what action is performed when No is clicked


                    })
                builder2.show()

            }

        }

    }
}