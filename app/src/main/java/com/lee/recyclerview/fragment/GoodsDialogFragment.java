package com.lee.recyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lee.recyclerview.R;

/**
 * 商品规格的对话框
 */
public class GoodsDialogFragment extends BaseDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //对话框底部对齐, 这句话不能写onCreate里(包括父类的)，在onCreate里执行getDialog()获取的值为null
        getDialog().getWindow().setGravity(Gravity.BOTTOM);
        return getActivity().getLayoutInflater().inflate(R.layout.dialog_goods, container);
    }
}
