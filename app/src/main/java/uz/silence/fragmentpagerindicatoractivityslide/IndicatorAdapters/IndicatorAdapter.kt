package uz.silence.fragmentpagerindicatoractivityslide.IndicatorAdapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import uz.silence.fragmentpagerindicatoractivityslide.ImageFragment

class IndicatorAdapter(var list:ArrayList<Int>,fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return ImageFragment.newInstance(list[position])
    }
}