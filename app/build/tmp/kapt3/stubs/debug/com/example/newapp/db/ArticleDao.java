package com.example.newapp.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/newapp/db/ArticleDao;", "", "deleteAllArticles", "", "deleteArticle", "article", "Lcom/example/newapp/model/Article;", "findArticleBySource", "Landroidx/lifecycle/LiveData;", "", "source", "", "getAllArticles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "saveAllArticles", "articles", "updateArticle", "(Lcom/example/newapp/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ArticleDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateArticle(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Delete()
    public abstract void deleteArticle(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM articles")
    public abstract java.lang.Object getAllArticles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.newapp.model.Article>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM articles  WHERE source LIKE :source")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.newapp.model.Article>> findArticleBySource(@org.jetbrains.annotations.NotNull()
    java.lang.String source);
    
    @androidx.room.Query(value = "Delete FROM articles")
    public abstract void deleteAllArticles();
    
    @kotlin.jvm.JvmSuppressWildcards()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveAllArticles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.newapp.model.Article> articles);
}