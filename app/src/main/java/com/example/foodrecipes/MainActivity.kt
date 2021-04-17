package com.example.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.foodrecipes.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding?.root)

        //1.找到NavhostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.containerFragment)
                as NavHostFragment

        //2.找到NavController
        navController = navHostFragment.navController

        //3. BottomNavigationView和NavController关联
        //bottomNavigationView.setupWithNavController(navController)
        binding?.bottomNavigationView?.setupWithNavController(navController)

        //4. ActionBar和NavController关联
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipesFragment,
                R.id.favoritesFragment,
                R.id.jokeFragment
            )
        )
        setupActionBarWithNavController(navController,appBarConfiguration)
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}