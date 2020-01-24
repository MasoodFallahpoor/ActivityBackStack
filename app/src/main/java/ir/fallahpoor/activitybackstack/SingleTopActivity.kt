package ir.fallahpoor.activitybackstack

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_single_top.*

class SingleTopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)

        Logger.logMessage(SingleTopActivity::class.java.simpleName + ": onCreate")

        launchStandardActivityButton.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }

        launchSingleTopActivityButton.setOnClickListener {
            startActivity(Intent(this, SingleTopActivity::class.java))
        }

        launchSingleTaskActivityButton.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }

        launchSingleInstanceActivityButton.setOnClickListener {
            startActivity(Intent(this, SingleInstanceActivity::class.java))
        }

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Logger.logMessage(SingleTopActivity::class.java.simpleName + ": onNewIntent")
    }

}
