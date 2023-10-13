package com.example.ud02_8_practica2_constraintlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var tasks : ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>

    private val TASKS_KEY = "tasks"

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putStringArrayList(TASKS_KEY, tasks)
        super.onSaveInstanceState(outState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tasks = if (savedInstanceState != null) {
            savedInstanceState.getStringArrayList(TASKS_KEY) as ArrayList<String>
        } else {
            ArrayList()
        }

        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tasks)

        val button: Button = findViewById(R.id.btnAddTask)
        val listTasks : ListView = findViewById(R.id.listTasks)
        listTasks.adapter = adapter

        button.setOnClickListener {
            val taskText: EditText = findViewById(R.id.textNewTask)
            if (taskText.text.isNotEmpty()) {
                tasks.add(taskText.text.toString())
                taskText.text.clear()
                adapter.notifyDataSetChanged()
            }
        }

    }
}