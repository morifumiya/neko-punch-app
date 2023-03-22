package rob.myappcompany.nekopunchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // 1) 画面タッチ
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        va l iv: ImageView = findViewById(R.id.iv)

        when(event?.action) {
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.thum02)
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.thum03)
            MotionEvent.ACTION_UP -> iv.setImageResource(R.drawable.thum01)
        }

        return super.onTouchEvent(event)
    }
}
