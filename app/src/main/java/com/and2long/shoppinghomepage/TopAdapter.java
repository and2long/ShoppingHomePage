package com.and2long.shoppinghomepage;

import android.content.Context;
import android.widget.ImageView;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by and2long on 2018/3/5.
 * 顶部适配器
 */

public class TopAdapter extends CommonAdapter<TopData.DataBean> {


    public TopAdapter(Context context, List<TopData.DataBean> datas) {
        super(context, R.layout.item1, datas);
    }

    @Override
    protected void convert(ViewHolder holder, TopData.DataBean dataBean, int position) {
        holder.setText(R.id.tv_desc_item1, dataBean.getCate_name());
        ImageView image = holder.getView(R.id.iv_item1);

    }
}

