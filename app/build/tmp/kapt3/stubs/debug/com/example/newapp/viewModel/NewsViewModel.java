package com.example.newapp.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010>\u001a\u00020?H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J\u001a\u0010A\u001a\u00020B2\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007J\u0006\u0010D\u001a\u00020?J\u000e\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020\bJ\u0019\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010IJ\u000e\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u00020-J\u0006\u0010L\u001a\u00020?J\u000e\u0010M\u001a\u00020?2\u0006\u0010F\u001a\u00020\bR,\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR,\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR,\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR,\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR,\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR+\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\fR\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001b0;8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006N"}, d2 = {"Lcom/example/newapp/viewModel/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_newsListResponse", "Landroidx/compose/runtime/MutableState;", "", "Lcom/example/newapp/model/Article;", "get_newsListResponse", "()Landroidx/compose/runtime/MutableState;", "set_newsListResponse", "(Landroidx/compose/runtime/MutableState;)V", "_newsListResponse_france", "get_newsListResponse_france", "set_newsListResponse_france", "_newsListResponse_greece", "get_newsListResponse_greece", "set_newsListResponse_greece", "_newsListResponse_uk", "get_newsListResponse_uk", "set_newsListResponse_uk", "_newsListResponse_usa", "get_newsListResponse_usa", "set_newsListResponse_usa", "_savedNewsList", "Landroidx/lifecycle/MutableLiveData;", "", "country", "", "getCountry", "setCountry", "<set-?>", "errorMessage", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "errorMessage$delegate", "Landroidx/compose/runtime/MutableState;", "outletSelected", "Lcom/example/newapp/utils/OutletSealedClass;", "getOutletSelected", "setOutletSelected", "randIndex", "", "getRandIndex", "()I", "setRandIndex", "(I)V", "repository", "Lcom/example/newapp/repository/NewsRepository;", "response", "Lcom/example/newapp/model/NewsResponse;", "getResponse", "()Lcom/example/newapp/model/NewsResponse;", "setResponse", "(Lcom/example/newapp/model/NewsResponse;)V", "savedNewsList", "Landroidx/lifecycle/LiveData;", "getSavedNewsList", "()Landroidx/lifecycle/LiveData;", "actualiser", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apiCalledEmpy", "", "lstCategoriesAPiCall", "deleteAllArticles", "deleteArticle", "article", "getNewsByCategory", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextAPiKey", "currentAPiKeyIndex", "getSavedArticles", "saveArticle", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.String> country;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> _newsListResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> _newsListResponse_france;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> _newsListResponse_usa;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> _newsListResponse_uk;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> _newsListResponse_greece;
    public com.example.newapp.model.NewsResponse response;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<com.example.newapp.utils.OutletSealedClass> outletSelected;
    private final androidx.compose.runtime.MutableState errorMessage$delegate = null;
    private int randIndex = 0;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.newapp.model.Article>> _savedNewsList = null;
    private final com.example.newapp.repository.NewsRepository repository = null;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> get_newsListResponse() {
        return null;
    }
    
    public final void set_newsListResponse(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> get_newsListResponse_france() {
        return null;
    }
    
    public final void set_newsListResponse_france(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> get_newsListResponse_usa() {
        return null;
    }
    
    public final void set_newsListResponse_usa(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> get_newsListResponse_uk() {
        return null;
    }
    
    public final void set_newsListResponse_uk(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> get_newsListResponse_greece() {
        return null;
    }
    
    public final void set_newsListResponse_greece(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.util.List<java.util.List<com.example.newapp.model.Article>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.newapp.model.NewsResponse getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.newapp.utils.OutletSealedClass> getOutletSelected() {
        return null;
    }
    
    public final void setOutletSelected(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<com.example.newapp.utils.OutletSealedClass> p0) {
    }
    
    private final java.lang.String getErrorMessage() {
        return null;
    }
    
    private final void setErrorMessage(java.lang.String p0) {
    }
    
    public final int getRandIndex() {
        return 0;
    }
    
    public final void setRandIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.newapp.model.Article>> getSavedNewsList() {
        return null;
    }
    
    public final void saveArticle(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article) {
    }
    
    public final void getSavedArticles() {
    }
    
    public final void deleteAllArticles() {
    }
    
    public final void deleteArticle(@org.jetbrains.annotations.NotNull()
    com.example.newapp.model.Article article) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNewsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object actualiser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final int getNextAPiKey(int currentAPiKeyIndex) {
        return 0;
    }
    
    public final boolean apiCalledEmpy(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<com.example.newapp.model.Article>> lstCategoriesAPiCall) {
        return false;
    }
}