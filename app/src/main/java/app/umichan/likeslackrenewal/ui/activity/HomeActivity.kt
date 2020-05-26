package app.umichan.likeslackrenewal.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import app.umichan.likeslackrenewal.R
import app.umichan.likeslackrenewal.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =
            DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)

        setupBottomNavigation(binding)
    }

    private fun setupBottomNavigation(binding: ActivityHomeBinding) {
        val navController = findNavController(R.id.navigation_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home,
                R.id.nav_dm,
                R.id.nav_mention,
                R.id.nav_profile
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bottomNavigation.setupWithNavController(navController)
    }
}
