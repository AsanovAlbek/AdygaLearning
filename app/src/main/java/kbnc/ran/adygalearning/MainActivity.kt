package kbnc.ran.adygalearning

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kbnc.ran.adygalearning.databinding.ActivityMainBinding

/**
 * Главная активити приложения
 */
class MainActivity : AppCompatActivity() {
    private lateinit var _mainBinding: ActivityMainBinding
    private val mainBinding get() = _mainBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        _mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val navHost = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        val navController = navHost.navController
    }
}