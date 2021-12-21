package com.example.cardview.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0015J\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00152\u0006\u0010\u0017\u001a\u00020\fJ\u0019\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/cardview/repository/Repository;", "", "tarefaDao", "Lcom/example/aplicationtestinglayout/data/TarefaDao;", "(Lcom/example/aplicationtestinglayout/data/TarefaDao;)V", "addTarefa", "Lretrofit2/Response;", "Lcom/example/aplicationtestinglayout/model/Tarefas;", "tarefas", "(Lcom/example/aplicationtestinglayout/model/Tarefas;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTarefa", "valor", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTarefaRoom", "", "insertTarefas", "listTarefas", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllTarefas", "Lkotlinx/coroutines/flow/Flow;", "queryById", "id", "updateRoom", "updateTarefa", "app_debug"})
public final class Repository {
    private final com.example.aplicationtestinglayout.data.TarefaDao tarefaDao = null;
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.data.TarefaDao tarefaDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object listTarefas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.aplicationtestinglayout.model.Tarefas>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addTarefa(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aplicationtestinglayout.model.Tarefas>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTarefa(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aplicationtestinglayout.model.Tarefas>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTarefa(int valor, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.aplicationtestinglayout.model.Tarefas>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.aplicationtestinglayout.model.Tarefas>> queryAllTarefas() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTarefas(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.aplicationtestinglayout.model.Tarefas> queryById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateRoom(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTarefaRoom(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}