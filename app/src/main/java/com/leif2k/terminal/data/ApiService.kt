package com.leif2k.terminal.data

import retrofit2.http.GET

interface ApiService {

    @GET("v2/aggs/ticker/AAPL/range/1/hour/2024-11-19/2025-11-19?adjusted=true&sort=asc&limit=50000&apiKey=UhYmZlpcfIwoVO5rTt18bAi2RfoGtBqL")
    suspend fun loadBars(): Result
}