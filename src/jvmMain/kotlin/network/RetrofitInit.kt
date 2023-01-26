package network

import models.Movie
import okhttp3.ResponseBody
import retrofit2.Callback
import retrofit2.Retrofit

class RetrofitInit {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://imdb-api.com/en/API/Top250Movies/")
        .build()

    //instance of API Interface
    val movieService: MovieService
        get() = retrofit.create(MovieService::class.java)
}
