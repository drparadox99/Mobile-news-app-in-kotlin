package com.example.newapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\u000f\u001a\u00020\u00062\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/newapp/api/NewsAPIInterface;", "", "getBreakingNews", "Lretrofit2/Response;", "Lcom/example/newapp/model/NewsResponse;", "categoryCode", "", "countryCode", "apiKey", "pageNumber", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBreakingNews2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "from", "sortedBy", "app_debug"})
public abstract interface NewsAPIInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/everything?q=tesla")
    public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "from")
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sortBy")
    java.lang.String sortedBy, @retrofit2.http.Query(value = "page")
    int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newapp.model.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/top-headlines")
    public abstract java.lang.Object getBreakingNews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "category")
    java.lang.String categoryCode, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @retrofit2.http.Query(value = "page")
    int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newapp.model.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://saurav.tech/NewsAPI/top-headlines/category/health/fr.json")
    public abstract java.lang.Object getBreakingNews2(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newapp.model.NewsResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}