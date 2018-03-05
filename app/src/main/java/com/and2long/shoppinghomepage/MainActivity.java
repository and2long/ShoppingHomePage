package com.and2long.shoppinghomepage;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.zhy.adapter.recyclerview.wrapper.HeaderAndFooterWrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TopData.DataBean> mTopData = new ArrayList<>();
    private List<MData.DataBean.ContentBean> mHomeData = new ArrayList<>();
    //头教包装类
    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;
    private HomeAdapter mAdapter;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);

        //初始化轮播图
        View viewPager = View.inflate(this, R.layout.header_view_pager, null);
        //初始化top列表
        RecyclerView topList = new RecyclerView(this);
        topList.setLayoutManager(new GridLayoutManager(this, 5));
        TopAdapter topAdapter = new TopAdapter(this, mTopData);
        topList.setAdapter(topAdapter);
        //初始化中间部分
        View centerView = View.inflate(this, R.layout.header_center, null);

        //创建主要适配器
        mAdapter = new HomeAdapter(this, mHomeData);
        //包裹类。包裹一个适配器
        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(mAdapter);
        mHeaderAndFooterWrapper.addHeaderView(viewPager);
        mHeaderAndFooterWrapper.addHeaderView(topList);
        mHeaderAndFooterWrapper.addHeaderView(centerView);
        //初始化主要列表
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mHeaderAndFooterWrapper);
        mHeaderAndFooterWrapper.notifyDataSetChanged();

        //获取数据
        new GetTopDataTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        new GetHomeDataTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /**
     * 模拟获取top数据
     * todo 删除此方法，获取真实数据
     */
    private class GetTopDataTask extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            try {
                InputStreamReader inputStreamReader;
                inputStreamReader = new InputStreamReader(getAssets().open("data_top.json"), "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                StringBuilder stringBuilder = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                inputStreamReader.close();
                bufferedReader.close();
                return stringBuilder.toString();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(String regions) {
            if (regions != null) {
                TopData topData = new Gson().fromJson(regions, TopData.class);
                List<TopData.DataBean> dataBeans = topData.getData();
                mTopData.addAll(dataBeans);

                mHeaderAndFooterWrapper.notifyDataSetChanged();
            }
        }
    }


    /**
     * 模拟获取top数据
     * todo 删除此方法，获取真实数据
     */
    private class GetHomeDataTask extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            try {
                InputStreamReader inputStreamReader;
                inputStreamReader = new InputStreamReader(getAssets().open("data_home.json"), "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                StringBuilder stringBuilder = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                inputStreamReader.close();
                bufferedReader.close();
                return stringBuilder.toString();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(String regions) {
            if (regions != null) {
                MData mData = new Gson().fromJson(regions, MData.class);
                List<MData.DataBean.ContentBean> dataBeans = mData.getData().getContent();
                mHomeData.addAll(dataBeans);
                mHeaderAndFooterWrapper.notifyDataSetChanged();
                Log.i(TAG, "onPostExecute: ");
            }
        }
    }

}
