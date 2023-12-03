package com.example.hand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.hand.databinding.ActivityNaviBinding

private const val TAG_LUCK = "luck_fragment"
private const val TAG_HOME = "home_fragment"
private const val TAG_MY = "my_fragment"
private const val TAG_WEATHER = "weather_fragment"
class NaviActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNaviBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the FragmentManager
        val fragmentManager = supportFragmentManager

        // Add the MyFragment only if it hasn't been added before
        if (fragmentManager.findFragmentByTag(TAG_MY) == null) {
            val myFragment = MyFragment.newInstance()
            fragmentManager.beginTransaction()
                .add(R.id.mainFrameLayout, myFragment, TAG_MY)
                .commit()
        }

        // Set the default selected item in the bottom navigation to HomeFragment
        binding.navigationView.selectedItemId = R.id.MyFragment


        binding.navigationView.setOnItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.HomeFragment -> setFragment(TAG_HOME, HomeFragment())
                R.id.LuckFragment -> setFragment(TAG_LUCK, LuckFragment())
                R.id.MyFragment -> setFragment(TAG_MY, MyFragment.newInstance())
                R.id.WeatherFragment -> setFragment(TAG_WEATHER, WeatherFragment())
            }
            true
        }
    }

    private fun setFragment(tag: String, fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val fragTransaction = manager.beginTransaction()

        if (manager.findFragmentByTag(tag) == null){
            fragTransaction.add(R.id.mainFrameLayout, fragment, tag)
        }

        val luck = manager.findFragmentByTag(TAG_LUCK)
        val home = manager.findFragmentByTag(TAG_HOME)
        val my = manager.findFragmentByTag(TAG_MY)
        val weather = manager.findFragmentByTag(TAG_WEATHER)
        if (luck != null){
            fragTransaction.hide(luck)
        }

        if (home != null){
            fragTransaction.hide(home)
        }

        if (my != null) {
            fragTransaction.hide(my)
        }
        if(weather != null){
            fragTransaction.hide(weather)
        }

        if (tag == TAG_MY) {
            if (my != null){
                fragTransaction.show(my)
            }
        }
        else if (tag == TAG_HOME) {
            if (home != null) {
                fragTransaction.show(home)
            }
        }

        else if (tag == TAG_LUCK){
            if (luck!=null){
                fragTransaction.show(luck)
            }
        }
        else if (tag == TAG_WEATHER){
            if (weather != null){
                fragTransaction.show(weather)
            }
        }
        fragTransaction.commitAllowingStateLoss()
    }
}
