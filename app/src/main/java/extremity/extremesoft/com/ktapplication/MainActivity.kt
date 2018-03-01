package extremity.extremesoft.com.ktapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import android.widget.Toast
import extremity.extremesoft.com.ktapplication.adapter.UsersAdapter
import extremity.extremesoft.com.ktapplication.model.GetUserModel
import extremity.extremesoft.com.ktapplication.rest.ApiClient
import extremity.extremesoft.com.ktapplication.rest.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi();
        initRecylerView()
    }

    private fun initRecylerView() {

    }

    private fun initUi() {
        Toast.makeText(this@MainActivity,"Hello ",Toast.LENGTH_LONG).show()
        val apiService : ApiInterface = ApiClient.getClient().create(ApiInterface::class.java)

        val call = apiService.getUserList()
        call.clone().enqueue(object : Callback<GetUserModel> {
            override fun onResponse(call: Call<GetUserModel>, response: Response<GetUserModel>) {

                Toast.makeText(this@MainActivity," "+response.body().getPage(),Toast.LENGTH_LONG).show()
                val adpater = UsersAdapter(this@MainActivity, response.body().getData()!!)

                val layoutManager : LinearLayoutManager = LinearLayoutManager(applicationContext)
                val recyclerView : RecyclerView = findViewById(R.id.rv)
                recyclerView.setItemAnimator(DefaultItemAnimator())
                recyclerView.setFitsSystemWindows(true)
                recyclerView.setLayoutManager(layoutManager)
                recyclerView.adapter = adpater;

            }

            override fun onFailure(call: Call<GetUserModel>, t: Throwable) {
                t.printStackTrace()
                // TODO: 08/11/16 handle failure
            }
        })
    }
}
