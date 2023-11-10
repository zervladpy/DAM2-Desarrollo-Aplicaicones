package com.example.ud04_1_chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.DrawerLayoutUtils
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        val navHostController = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostController.navController

        // optional
        val builderApp = AppBarConfiguration.Builder(navController.graph)
        val configurationBuilder = builderApp.build()
        //

        toolbar.setupWithNavController(navController, configurationBuilder ) //

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomBar.setupWithNavController(navController)

        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        builderApp.setOpenableLayout(drawer)


        val navigationView = findViewById<NavigationView>(R.id.drawer_navigation_view)
        navigationView.setupWithNavController(navController)

        builderApp.build()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val navController = findNavController(R.id.nav_host_fragment)

        return NavigationUI.onNavDestinationSelected(item, navController) || super.onOptionsItemSelected(item)
    }

}