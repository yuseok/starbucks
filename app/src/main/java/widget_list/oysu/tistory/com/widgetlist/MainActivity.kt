package widget_list.oysu.tistory.com.widgetlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity(){

    lateinit var mainRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainRecyclerView = findViewById(R.id.rvMain)

        mainRecyclerView.adapter = adapter
    }

    val adapter = MainRecyclerAdapter()

    class MainRecyclerAdapter : RecyclerView.Adapter<>{
        override fun onBindViewHolder(holder: ?, position: Int) {

        }

        override fun getItemCount(): Int {
            return 0
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): {

        }

    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }
}
