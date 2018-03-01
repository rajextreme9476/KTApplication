package extremity.extremesoft.com.ktapplication.rest;


import extremity.extremesoft.com.ktapplication.model.GetUserModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("users?page=2")
    Call<GetUserModel> getUserList();

}





