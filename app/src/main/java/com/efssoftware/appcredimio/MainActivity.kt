package com.efssoftware.appcredimio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.efssoftware.appcredimio.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var toogle: ActionBarDrawerToggle
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.Theme_AppCredimio)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toogle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer )
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, EmpresaFragment())
                        commit()
                    }
                }
                R.id.nav_clientes ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, ClientesFragment())
                        commit()
                    }
                }
                R.id.nav_contacto ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, ContactoFragment())
                        commit()
                    }
                }
            }

            binding.drawerLayout.closeDrawer(GravityCompat.START)

            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toogle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
