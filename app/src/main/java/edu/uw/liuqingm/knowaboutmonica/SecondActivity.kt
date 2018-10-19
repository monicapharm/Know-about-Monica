package edu.uw.liuqingm.knowaboutmonica

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class SecondActivity : AppCompatActivity() {

    //private lateinit var adapter: ArrayAdapter<ProjectData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val projectContent = findViewById<TextView>(R.id.text_view)
        projectContent!!.setMovementMethod(ScrollingMovementMethod())

        //generateData()

        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Email to me...TODO", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
//
//    private fun generateData() {
//        val arrayOfData = arrayListOf<ProjectData>()
//        var projectData1 = ProjectData(R.drawable.carpool, "123")
//        arrayOfData.add(projectData1)
//
//        var projectData2 = ProjectData(R.drawable.twitter, "234")
//        arrayOfData.add(projectData2)
//
//        var projectData3 = ProjectData(R.drawable.nfl, "345")
//        arrayOfData.add(projectData3)
//
//        adapter = ProjectAdapter(this, arrayOfData)
//
//        val listView = findViewById(R.id.list_view) as ListView
//        listView.adapter = adapter
//    }
//
//    class ProjectData(var icon : Int, var content: String) {
////        companion object {
////            val projects: ArrayList<ProjectData>
////                get() {
////                    val users = ArrayList<ProjectData>()
////                    projects.add(ProjectData("Harry", "San Diego"))
////                    projects.add(ProjectData("Marla", "San Francisco"))
////                    projects.add(ProjectData("Marla", "San Francisco"))
////                    projects.add(ProjectData("Marla", "San Francisco"))
////                    return projects
////                }
////        }
//    }
//
//    class ProjectAdapter(context: Context, data: ArrayList<SecondActivity.ProjectData>) : ArrayAdapter<SecondActivity.ProjectData>(context, 0, data) {
//        override fun getView(position: Int, convertView: View?, parent: ViewGroup) : View {
//            var convertView = convertView
//            val data = getItem(position)
//            if (convertView == null) {
//                convertView = LayoutInflater.from(context).inflate(R.layout.project_item, parent, false)
//            }
//
//            val tvName = convertView!!.findViewById(R.id.icon) as ImageView
//            val tvHome = convertView!!.findViewById(R.id.text) as TextView
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                tvName.setImageDrawable(context.getDrawable(data.icon))
//            }
//            tvHome.setText(data.content)
//
//            return convertView
//        }
//    }
}
