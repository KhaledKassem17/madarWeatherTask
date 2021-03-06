package medic.esy.es.madarweathertask.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitClient {

    public static Retrofit instance;

    public static Retrofit getInstance(){

        if(instance==null ){
            instance=new Retrofit.Builder()
                    .baseUrl("http://api.openweathermap.org/data/2.5/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            ;
        }
             return instance;
    }
}
