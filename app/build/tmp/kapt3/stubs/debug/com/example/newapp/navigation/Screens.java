package com.example.newapp.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0004\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/newapp/navigation/Screens;", "", "route", "", "title", "resource", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getResource", "()I", "getRoute", "()Ljava/lang/String;", "getTitle", "ArticleScreen", "BookmarkScreen", "HomeScreen", "SettingsScreen", "Lcom/example/newapp/navigation/Screens$HomeScreen;", "Lcom/example/newapp/navigation/Screens$ArticleScreen;", "Lcom/example/newapp/navigation/Screens$SettingsScreen;", "Lcom/example/newapp/navigation/Screens$BookmarkScreen;", "app_debug"})
public abstract class Screens {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int resource = 0;
    
    private Screens(java.lang.String route, java.lang.String title, int resource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getResource() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/newapp/navigation/Screens$HomeScreen;", "Lcom/example/newapp/navigation/Screens;", "()V", "app_debug"})
    public static final class HomeScreen extends com.example.newapp.navigation.Screens {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.newapp.navigation.Screens.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/newapp/navigation/Screens$ArticleScreen;", "Lcom/example/newapp/navigation/Screens;", "()V", "app_debug"})
    public static final class ArticleScreen extends com.example.newapp.navigation.Screens {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.newapp.navigation.Screens.ArticleScreen INSTANCE = null;
        
        private ArticleScreen() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/newapp/navigation/Screens$SettingsScreen;", "Lcom/example/newapp/navigation/Screens;", "()V", "app_debug"})
    public static final class SettingsScreen extends com.example.newapp.navigation.Screens {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.newapp.navigation.Screens.SettingsScreen INSTANCE = null;
        
        private SettingsScreen() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/newapp/navigation/Screens$BookmarkScreen;", "Lcom/example/newapp/navigation/Screens;", "()V", "app_debug"})
    public static final class BookmarkScreen extends com.example.newapp.navigation.Screens {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.newapp.navigation.Screens.BookmarkScreen INSTANCE = null;
        
        private BookmarkScreen() {
            super(null, null, 0);
        }
    }
}