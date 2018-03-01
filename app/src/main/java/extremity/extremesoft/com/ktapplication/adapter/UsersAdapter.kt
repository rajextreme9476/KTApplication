package extremity.extremesoft.com.ktapplication.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

import extremity.extremesoft.com.ktapplication.R
import extremity.extremesoft.com.ktapplication.model.GetUserModel


class UsersAdapter(internal var context: Context, private val getUserList: List<GetUserModel.Datum>) : RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.inflate_user, viewGroup, false)
        return MyViewHolder(v)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text = getUserList[position].getFirstName()
        Picasso.with(context).load(getUserList[position].getAvatar()).into(holder.ivAvatar);
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return getUserList.size
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val ivAvatar: ImageView
        val tvName: TextView


        init {
            ivAvatar = view.findViewById<View>(R.id.ivAvatar) as ImageView
            tvName = view.findViewById<View>(R.id.tvName) as TextView

        }


    }


}