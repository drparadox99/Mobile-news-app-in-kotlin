package com.example.newapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u001a\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/newapp/repository/NewsRepository;", "", "db", "Lcom/example/newapp/db/ArticleDatabase;", "(Lcom/example/newapp/db/ArticleDatabase;)V", "deleteArticle", "", "article", "Lcom/example/newapp/model/Article;", "deleteArticles", "findArticleBySource", "Landroidx/lifecycle/LiveData;", "", "source", "", "getAllArticles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBreakingNews", "Lretrofit2/Response;", "Lcom/example/newapp/model/NewsResponse;", "category", "country", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "saveAllArticles", "search", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateArticle", "(Lcom/example/newapp/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsRepository {
    private final com.example.newapp.db.ArticleDatabase db = null;
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.newapp.db.ArticleDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newapp.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newapp.model.NewsResponse>> continuation) {
        return null;
    }
    
    public final long insert(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateArticle(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.newapp.model.Article>> findArticleBySource(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllArticles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.newapp.model.Article>> continuation) {
        return null;
    }
    
    public final void deleteArticle(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article) {
    }
    
    public final void deleteArticles() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveAllArticles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}