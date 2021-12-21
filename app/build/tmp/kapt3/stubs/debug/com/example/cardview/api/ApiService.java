package com.example.cardview.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cardview/api/ApiService;", "", "addTarefa", "Lretrofit2/Response;", "Lcom/example/aplicationtestinglayout/model/Tarefas;", "tarefas", "(Lcom/example/aplicationtestinglayout/model/Tarefas;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTarefa", "valor", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listTasks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTarefa", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/todo")
    public abstract java.lang.Object listTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.aplicationtestinglayout.model.Tarefas>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/todo")
    public abstract java.lang.Object addTarefa(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aplicationtestinglayout.model.Tarefas>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "api/todo")
    public abstract java.lang.Object updateTarefa(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aplicationtestinglayout.model.Tarefas>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "api/todo/{tarefa}")
    public abstract java.lang.Object deleteTarefa(@retrofit2.http.Path(value = "tarefa")
    int valor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aplicationtestinglayout.model.Tarefas>> continuation);
}