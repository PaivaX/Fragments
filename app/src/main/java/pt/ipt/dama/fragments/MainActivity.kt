package pt.ipt.dama.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // create the objets of type 'fagment' to use
        lateinit var f1:MyFragment
        lateinit var f2:MyFragment
        lateinit var f3:MyFragment

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init the fragments
        f1= MyFragment.newInstance("fragment","one")
        f2= MyFragment.newInstance("Fragment","Two")
        f3= MyFragment.newInstance("FRAGMENT", "THREE")

        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment1, f1)
        fragmentTransaction.add(R.id.fragment2, f2)
        fragmentTransaction.add(R.id.fragment3, f3)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}