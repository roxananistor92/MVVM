package com.acme.tictactoe.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class TictactoeBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.GridLayout buttonGrid;
    @NonNull
    public final android.widget.LinearLayout tictactoe;
    @NonNull
    public final android.widget.TextView winnerPlayerLabel;
    @NonNull
    public final android.widget.LinearLayout winnerPlayerViewGroup;
    // variables
    protected com.acme.tictactoe.viewmodel.TicTacToeViewModel mViewModel;
    protected TictactoeBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.GridLayout buttonGrid1
        , android.widget.LinearLayout tictactoe1
        , android.widget.TextView winnerPlayerLabel1
        , android.widget.LinearLayout winnerPlayerViewGroup1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.buttonGrid = buttonGrid1;
        this.tictactoe = tictactoe1;
        this.winnerPlayerLabel = winnerPlayerLabel1;
        this.winnerPlayerViewGroup = winnerPlayerViewGroup1;
    }
    //getters and abstract setters
    public abstract void setViewModel(@Nullable com.acme.tictactoe.viewmodel.TicTacToeViewModel ViewModel);
    @Nullable
    public com.acme.tictactoe.viewmodel.TicTacToeViewModel getViewModel() {
        return mViewModel;
    }
    @NonNull
    public static TictactoeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TictactoeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TictactoeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TictactoeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<TictactoeBinding>inflate(inflater, com.acme.tictactoe.R.layout.tictactoe, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static TictactoeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<TictactoeBinding>inflate(inflater, com.acme.tictactoe.R.layout.tictactoe, null, false, bindingComponent);
    }
    @NonNull
    public static TictactoeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (TictactoeBinding)bind(bindingComponent, view, com.acme.tictactoe.R.layout.tictactoe);
    }
}