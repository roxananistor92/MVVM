package com.acme.tictactoe.databinding;
import com.acme.tictactoe.R;
import com.acme.tictactoe.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TictactoeBindingImpl extends TictactoeBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.buttonGrid, 12);
    }
    // views
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    @NonNull
    private final android.widget.Button mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    private final android.widget.Button mboundView8;
    @NonNull
    private final android.widget.Button mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TictactoeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private TictactoeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.GridLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            );
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.Button) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.Button) bindings[9];
        this.mboundView9.setTag(null);
        this.tictactoe.setTag(null);
        this.winnerPlayerLabel.setTag(null);
        this.winnerPlayerViewGroup.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback9 = new android.databinding.generated.callback.OnClickListener(this, 9);
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback8 = new android.databinding.generated.callback.OnClickListener(this, 8);
        mCallback7 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback5 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.acme.tictactoe.viewmodel.TicTacToeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.acme.tictactoe.viewmodel.TicTacToeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelWinner((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelCells((android.databinding.ObservableArrayMap<java.lang.String,java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWinner(android.databinding.ObservableField<java.lang.String> ViewModelWinner, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCells(android.databinding.ObservableArrayMap<java.lang.String,java.lang.String> ViewModelCells, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelCells01 = null;
        java.lang.String viewModelCells11 = null;
        java.lang.String viewModelCells22 = null;
        java.lang.String viewModelCells20 = null;
        int viewModelWinnerJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewModelCells02 = null;
        java.lang.String viewModelCells10 = null;
        java.lang.String viewModelCells00 = null;
        java.lang.String viewModelCells12 = null;
        boolean viewModelWinnerJavaLangObjectNull = false;
        android.databinding.ObservableField<java.lang.String> viewModelWinner = null;
        java.lang.String viewModelWinnerGet = null;
        java.lang.String viewModelCells21 = null;
        android.databinding.ObservableArrayMap<java.lang.String,java.lang.String> viewModelCells = null;
        com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.winner
                        viewModelWinner = viewModel.winner;
                    }
                    updateRegistration(0, viewModelWinner);


                    if (viewModelWinner != null) {
                        // read viewModel.winner.get()
                        viewModelWinnerGet = viewModelWinner.get();
                    }


                    // read viewModel.winner.get() != null
                    viewModelWinnerJavaLangObjectNull = (viewModelWinnerGet) != (null);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelWinnerJavaLangObjectNull) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.winner.get() != null ? View.VISIBLE : View.GONE
                    viewModelWinnerJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelWinnerJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cells
                        viewModelCells = viewModel.cells;
                    }
                    updateRegistration(1, viewModelCells);


                    if (viewModelCells != null) {
                        // read viewModel.cells["01"]
                        viewModelCells01 = viewModelCells.get("01");
                        // read viewModel.cells["11"]
                        viewModelCells11 = viewModelCells.get("11");
                        // read viewModel.cells["22"]
                        viewModelCells22 = viewModelCells.get("22");
                        // read viewModel.cells["20"]
                        viewModelCells20 = viewModelCells.get("20");
                        // read viewModel.cells["02"]
                        viewModelCells02 = viewModelCells.get("02");
                        // read viewModel.cells["10"]
                        viewModelCells10 = viewModelCells.get("10");
                        // read viewModel.cells["00"]
                        viewModelCells00 = viewModelCells.get("00");
                        // read viewModel.cells["12"]
                        viewModelCells12 = viewModelCells.get("12");
                        // read viewModel.cells["21"]
                        viewModelCells21 = viewModelCells.get("21");
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
            this.mboundView2.setOnClickListener(mCallback2);
            this.mboundView3.setOnClickListener(mCallback3);
            this.mboundView4.setOnClickListener(mCallback4);
            this.mboundView5.setOnClickListener(mCallback5);
            this.mboundView6.setOnClickListener(mCallback6);
            this.mboundView7.setOnClickListener(mCallback7);
            this.mboundView8.setOnClickListener(mCallback8);
            this.mboundView9.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelCells00);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelCells01);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelCells02);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelCells10);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelCells11);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelCells12);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelCells20);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelCells21);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelCells22);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.winnerPlayerLabel, viewModelWinnerGet);
            this.winnerPlayerViewGroup.setVisibility(viewModelWinnerJavaLangObjectNullViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(0, 1);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(2, 2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(0, 0);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(2, 1);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(2, 0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(1, 2);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(1, 1);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(1, 0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.acme.tictactoe.viewmodel.TicTacToeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onClickedCellAt(0, 2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.winner
        flag 1 (0x2L): viewModel.cells
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.winner.get() != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.winner.get() != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}