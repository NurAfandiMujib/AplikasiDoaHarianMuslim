package com.fandy.aplikasidoaharianmuslim.Services;

import com.fandy.aplikasidoaharianmuslim.Models.DaftarDzikirPagi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DaftarDzikirPagiService {
    @GET()
    Call<List<DaftarDzikirPagi>> getDzikirPagi();
}
