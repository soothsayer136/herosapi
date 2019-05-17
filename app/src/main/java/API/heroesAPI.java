package API;

import java.util.List;

import Model.Model;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface heroesAPI {

    @GET("heroes")
    Call<List<Model>> getheroes();

    @POST("heroes")
    Call<Void> registerHeroes(@Body Model Mod);
}
