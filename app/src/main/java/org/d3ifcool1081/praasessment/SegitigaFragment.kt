package org.d3ifcool1081.praasessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool1081.praasessment.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {
    private var luas = 0.0
    private var keliling = 0.0
    private var sisiMiring = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(inflater,R.layout.fragment_segitiga, container, false)
        if (savedInstanceState != null) {
            luas = savedInstanceState.getDouble("luas2")
            keliling = savedInstanceState.getDouble("keliling2")
        }
        binding.btnHitungSegitiga.setOnClickListener {
            var alas = binding.etAlas.text.toString().toDouble()
            var tinggi = binding.etTinggi.text.toString().toDouble()
            luas = (alas * tinggi) / 2.0
            sisiMiring = Math.sqrt(Math.pow(alas,2.0) + Math.pow(tinggi,2.0))
            keliling = alas + tinggi + sisiMiring


            binding.tvHasilLuasSegitiga.text = luas.toString()
            binding.tvHasilKelilingSegitiga.text = keliling.toString()
        }
        binding.btnShareSegitiga.setOnClickListener {

        }

        binding.luas2 = luas
        binding.keliling2 = keliling
        return binding.root
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putDouble("luas2",luas)
        outState.putDouble("keliling2",keliling)
        super.onSaveInstanceState(outState)
    }
}
