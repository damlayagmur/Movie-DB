package com.damlayagmur.moviedb.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.damlayagmur.moviedb.R
import com.damlayagmur.moviedb.databinding.ActivityHomeBinding
import com.damlayagmur.moviedb.utils.viewBinding

class HomeActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityHomeBinding::inflate)
    private var navController: NavController? = null
    private var navHostFragment: NavHostFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_container) as NavHostFragment?
        navController = navHostFragment!!.navController
        setupActionBarWithNavController(navController!!)
    }

    override fun onSupportNavigateUp(): Boolean {
        navHostFragment!!.navController
        return navController!!.navigateUp() || super.onSupportNavigateUp()
    }

}