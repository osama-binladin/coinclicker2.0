package com.example.coinclickergameict

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var counter = 0
    fun setup(view: View) {
        view.findViewById<TextView>(R.id.counter_coins).text = counter.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {





                // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        setup(view)
        view.findViewById<ImageButton>(R.id.imageButton6).setOnClickListener {



            counter = counter + 1
            view.findViewById<TextView>(R.id.counter_coins).text = counter.toString()


            if ( counter > 49 ) {
                view.findViewById<ImageView>(R.id.backround_coins)
                    .setImageResource(R.drawable.coins__drop)


                if (counter > 99) {
                    view.findViewById<ImageView>(R.id.imageView9)
                        .setImageResource(R.drawable.gold_bars_pallet)


                }

            }


        }

              view.findViewById<ImageButton>(R.id.settings). setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.settings)


        }


        if ( counter > 49 ) {
            view.findViewById<ImageView>(R.id.backround_coins)
                .setImageResource(R.drawable.coins__drop)


            if (counter > 99) {
                view.findViewById<ImageView>(R.id.imageView9)
                    .setImageResource(R.drawable.gold_bars_pallet)


            }

        }
        return view

    }
}