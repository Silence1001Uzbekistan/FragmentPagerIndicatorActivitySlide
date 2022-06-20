package uz.silence.fragmentpagerindicatoractivityslide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.fragmentpagerindicatoractivityslide.IndicatorAdapters.IndicatorAdapter
import uz.silence.fragmentpagerindicatoractivityslide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var list:ArrayList<Int>
    lateinit var indicatorAdapter: IndicatorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add(R.drawable.oneimage)
        list.add(R.drawable.twoimage)
        list.add(R.drawable.threeimage)
        list.add(R.drawable.fourimage)

        indicatorAdapter = IndicatorAdapter(list,supportFragmentManager)
        binding.viewPager.adapter = indicatorAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

    }
}