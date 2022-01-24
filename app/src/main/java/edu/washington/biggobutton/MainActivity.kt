package edu.washington.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPush: Button = findViewById(R.id.button_push)
        buttonPush.setOnClickListener {
            buttonPushClicked(it as Button)
        }
    }

    private fun buttonPushClicked(button: Button) {
        clickCount++
        if (clickCount > 1) {
            button.text = getString(R.string.pushed_times, clickCount)
        } else {
            button.text = getString(R.string.pushed_one_time)
        }
    }
}