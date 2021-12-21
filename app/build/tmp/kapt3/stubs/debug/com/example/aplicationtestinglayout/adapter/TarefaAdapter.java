package com.example.aplicationtestinglayout.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/aplicationtestinglayout/adapter/TarefaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/aplicationtestinglayout/adapter/TarefaAdapter$TarefaViewHolder;", "taskItemClickListener", "Lcom/example/aplicationtestinglayout/adapter/TaskItemClickListener;", "mainViewModel", "Lcom/example/aplicationtestinglayout/viewModel_remoteBD/MainViewModel;", "(Lcom/example/aplicationtestinglayout/adapter/TaskItemClickListener;Lcom/example/aplicationtestinglayout/viewModel_remoteBD/MainViewModel;)V", "listaTarefas", "", "Lcom/example/aplicationtestinglayout/model/Tarefas;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "tarefas", "TarefaViewHolder", "app_debug"})
public final class TarefaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.aplicationtestinglayout.adapter.TarefaAdapter.TarefaViewHolder> {
    private final com.example.aplicationtestinglayout.adapter.TaskItemClickListener taskItemClickListener = null;
    private final com.example.aplicationtestinglayout.viewModel_remoteBD.MainViewModel mainViewModel = null;
    private java.util.List<com.example.aplicationtestinglayout.model.Tarefas> listaTarefas;
    
    public TarefaAdapter(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.adapter.TaskItemClickListener taskItemClickListener, @org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.viewModel_remoteBD.MainViewModel mainViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.aplicationtestinglayout.adapter.TarefaAdapter.TarefaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.aplicationtestinglayout.adapter.TarefaAdapter.TarefaViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.aplicationtestinglayout.model.Tarefas> tarefas) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/example/aplicationtestinglayout/adapter/TarefaAdapter$TarefaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "ImageType", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImageType", "()Landroid/widget/ImageView;", "buttonDeletar", "Landroid/widget/Button;", "getButtonDeletar", "()Landroid/widget/Button;", "textData", "Landroid/widget/TextView;", "getTextData", "()Landroid/widget/TextView;", "textDesc", "getTextDesc", "textDono", "getTextDono", "textNome", "getTextNome", "textStatus", "getTextStatus", "typeImage", "getTypeImage", "app_debug"})
    public static final class TarefaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView textNome = null;
        private final android.widget.TextView textDesc = null;
        private final android.widget.TextView textData = null;
        private final android.widget.Button buttonDeletar = null;
        private final android.widget.TextView textDono = null;
        private final android.widget.TextView textStatus = null;
        private final android.widget.ImageView ImageType = null;
        private final android.widget.ImageView typeImage = null;
        
        public TarefaViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final android.widget.TextView getTextNome() {
            return null;
        }
        
        public final android.widget.TextView getTextDesc() {
            return null;
        }
        
        public final android.widget.TextView getTextData() {
            return null;
        }
        
        public final android.widget.Button getButtonDeletar() {
            return null;
        }
        
        public final android.widget.TextView getTextDono() {
            return null;
        }
        
        public final android.widget.TextView getTextStatus() {
            return null;
        }
        
        public final android.widget.ImageView getImageType() {
            return null;
        }
        
        public final android.widget.ImageView getTypeImage() {
            return null;
        }
    }
}