package go.id.kominfo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity


class FlashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen)

        Thread(Runnable{
            Thread.sleep(2000)
            startActivity<MainActivity>()
            this.finish()
        }).start()

    }


}
