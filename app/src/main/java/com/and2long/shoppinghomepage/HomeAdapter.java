package com.and2long.shoppinghomepage;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by and2long on 2018/3/5.
 * 主列表适配器
 */

public class HomeAdapter extends CommonAdapter<MData.DataBean.ContentBean> {


    public HomeAdapter(Context context, List<MData.DataBean.ContentBean> datas) {
        super(context, R.layout.item_home, datas);
    }

    @Override
    protected void convert(ViewHolder holder, MData.DataBean.ContentBean bean, int position) {
        holder.setText(R.id.tv_title, bean.getArticle());
        holder.setText(R.id.tv_desc, bean.getQuanLink());

        //商品封面
        ImageView ivThumb = holder.getView(R.id.iv_thumb);
        RequestOptions options = new RequestOptions()
                .centerCrop();
        Glide.with(mContext)
                .load(R.mipmap.ic_launcher)
                .apply(options)
                .into(ivThumb);
    }
}
