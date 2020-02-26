package org.d3ifcool1081.praasessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import org.d3ifcool1081.praasessment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {
    private var luas = 0
    private var keliling = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(inflater,R.layout.fragment_persegi_panjang, container, false)
        if (savedInstanceState != null) {
            luas = savedInstanceState.getInt("luas1")
            keliling = savedInstanceState.getInt("keliling1")
        }

        binding.btnHitungPpanjang.setOnClickListener {
            var panjang = binding.etPanjang.text.toString().toInt()
            var lebar = binding.etLebar.text.toString().toInt()
            luas = panjang * lebar
            keliling = 2 * (panjang + lebar)
            binding.tvHasilLuasPpanjang.text = luas.toString()
            binding.tvHasilKelilingPpanjang.text = keliling.toString()
        }

        binding.btnSharePanjang.setOnClickListener {

        }
        binding.keliling1 = keliling
        binding.luas1 = luas
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("luas1",luas)
        outState.putInt("keliling1",keliling)
        super.onSaveInstanceState(outState)
    }


}
