package com.example.aplicationtestinglayout.viewModel_remoteBD;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eJ\u0006\u0010!\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006#"}, d2 = {"Lcom/example/aplicationtestinglayout/viewModel_remoteBD/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/cardview/repository/Repository;", "(Lcom/example/cardview/repository/Repository;)V", "contador", "", "getContador", "()I", "setContador", "(I)V", "myQueryResponse", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/aplicationtestinglayout/model/Tarefas;", "getMyQueryResponse", "()Lkotlinx/coroutines/flow/Flow;", "setMyQueryResponse", "(Lkotlinx/coroutines/flow/Flow;)V", "selectedDateLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getSelectedDateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "tarefaSelecionada", "getTarefaSelecionada", "()Lcom/example/aplicationtestinglayout/model/Tarefas;", "setTarefaSelecionada", "(Lcom/example/aplicationtestinglayout/model/Tarefas;)V", "addTarefa", "", "tarefas", "deleteTarefa", "listTarefas", "updateTarefa", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.cardview.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> selectedDateLiveData = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.aplicationtestinglayout.model.Tarefas tarefaSelecionada;
    private int contador = 0;
    public kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.aplicationtestinglayout.model.Tarefas>> myQueryResponse;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.cardview.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedDateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aplicationtestinglayout.model.Tarefas getTarefaSelecionada() {
        return null;
    }
    
    public final void setTarefaSelecionada(@org.jetbrains.annotations.Nullable()
    com.example.aplicationtestinglayout.model.Tarefas p0) {
    }
    
    public final int getContador() {
        return 0;
    }
    
    public final void setContador(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.aplicationtestinglayout.model.Tarefas>> getMyQueryResponse() {
        return null;
    }
    
    public final void setMyQueryResponse(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.aplicationtestinglayout.model.Tarefas>> p0) {
    }
    
    public final void listTarefas() {
    }
    
    public final void addTarefa(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas) {
    }
    
    public final void updateTarefa(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas) {
    }
    
    public final void deleteTarefa(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.model.Tarefas tarefas) {
    }
}