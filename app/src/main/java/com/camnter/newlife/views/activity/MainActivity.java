package com.camnter.newlife.views.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.camnter.easyrecyclerview.adapter.EasyRecyclerViewAdapter;
import com.camnter.easyrecyclerview.holder.EasyRecyclerViewHolder;
import com.camnter.easyrecyclerview.widget.EasyRecyclerView;
import com.camnter.easyrecyclerview.widget.decorator.EasyDividerItemDecoration;
import com.camnter.newlife.R;
import com.camnter.newlife.core.BaseAppCompatActivity;
import com.camnter.newlife.framework.robotlegs.robotlegs4android.view.activity.Robotlegs4AndroidActivity;
import com.camnter.newlife.framework.rxandroid.RxAsyncActivity;
import com.camnter.newlife.framework.rxandroid.RxMapActivity;
import com.camnter.newlife.framework.rxandroid.RxSyncActivity;
import com.camnter.newlife.mvp.MvpActivity;
import com.camnter.newlife.views.activity.design.CoordinatorLayoutActivity;
import com.camnter.newlife.views.activity.design.FloatingActionButtonActivity;
import com.camnter.newlife.views.activity.design.NavigationViewActivity;
import com.camnter.newlife.views.activity.design.SnackbarActivity;
import com.camnter.newlife.views.activity.design.TextInputLayoutActivity;
import com.camnter.newlife.views.activity.design.tablayout.CustomViewTabLayoutActivity;
import com.camnter.newlife.views.activity.design.tablayout.ImageSpanTabLayoutActivity;
import com.camnter.newlife.views.activity.design.tablayout.NormalTabLayoutActivity;
import com.camnter.newlife.views.activity.design.tablayout.SetIconTabLayoutActivity;
import com.camnter.newlife.views.activity.easylikearea.EasyLikeAreaQZoneActivity;
import com.camnter.newlife.views.activity.easylikearea.EasyLikeAreaStyleActivity;
import com.camnter.newlife.views.activity.easylikearea.EasyLikeAreaTopicActivity;
import com.camnter.newlife.views.activity.easyrecyclerviewsidebar.CircleImageSectionActivity;
import com.camnter.newlife.views.activity.easyrecyclerviewsidebar.LetterSectionActivity;
import com.camnter.newlife.views.activity.easyrecyclerviewsidebar.RoundImageSectionActivity;
import com.camnter.newlife.views.activity.lrucache.LruCacheActivity;
import com.camnter.newlife.views.activity.singletask.LaunchModeActivity;
import com.camnter.newlife.views.activity.util.DateUtilActivity;
import com.camnter.newlife.views.activity.util.DeviceUtilActivity;
import com.camnter.newlife.views.activity.util.ReflectionUtilActivity;
import com.camnter.newlife.views.activity.util.ResourcesUtilActivity;
import com.camnter.xfermode.XfermodesActivity;
import java.util.ArrayList;
import me.drakeet.newlife.RxBusActivity;

public class MainActivity extends BaseAppCompatActivity {

    private EasyRecyclerView menuRV;
    private MainRecyclerViewAdapter adapter;
    public ArrayList<Class> classes;


    /**
     * Fill in layout id
     *
     * @return layout id
     */
    @Override protected int getLayoutId() {
        return R.layout.activity_main;
    }


    /**
     * Initialize the view in the layout
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override protected void initViews(Bundle savedInstanceState) {
        this.menuRV = this.findView(R.id.menu_rv);
        this.menuRV.addItemDecoration(
                new EasyDividerItemDecoration(this, EasyDividerItemDecoration.VERTICAL_LIST));
    }


    /**
     * Initialize the View of the listener
     */
    @Override protected void initListeners() {
        this.adapter.setOnItemClickListener(new EasyRecyclerViewHolder.OnItemClickListener() {
            @Override public void onItemClick(View view, int i) {
                Class c = MainActivity.this.classes.get(i);
                MainActivity.this.startActivity(new Intent(MainActivity.this, c));
            }
        });
    }


    /**
     * Initialize the Activity data
     */
    @Override protected void initData() {
        this.classes = new ArrayList<>();
        this.classes.add(ImageScaleTypesActivity.class);
        this.classes.add(AsyncTaskActivity.class);
        this.classes.add(TextInputLayoutActivity.class);
        this.classes.add(RefreshUIActivity.class);
        this.classes.add(LaunchModeActivity.class);
        this.classes.add(NavigationViewActivity.class);
        this.classes.add(DeviceUtilActivity.class);
        this.classes.add(FloatingActionButtonActivity.class);
        this.classes.add(SnackbarActivity.class);
        this.classes.add(DateUtilActivity.class);
        this.classes.add(EasySlidingTabsActivity.class);
        this.classes.add(AutoAdjustSizeEditTextActivity.class);
        this.classes.add(AutoAdjustSizeTextViewActivity.class);
        this.classes.add(DownloadImageToGalleryActivity.class);
        this.classes.add(EasyRecyclerViewActivity.class);
        this.classes.add(NormalTabLayoutActivity.class);
        this.classes.add(SetIconTabLayoutActivity.class);
        this.classes.add(ImageSpanTabLayoutActivity.class);
        this.classes.add(CustomViewTabLayoutActivity.class);
        this.classes.add(CoordinatorLayoutActivity.class);
        this.classes.add(SensorManagerActivity.class);
        this.classes.add(MvpActivity.class);
        this.classes.add(SQLiteActivity.class);
        this.classes.add(Robotlegs4AndroidActivity.class);
        this.classes.add(CustomContentProviderActivity.class);
        this.classes.add(DownloadServiceActivity.class);
        this.classes.add(AIDLActivity.class);
        this.classes.add(ReflectionUtilActivity.class);
        this.classes.add(StaticReceiverActivity.class);
        this.classes.add(DynamicReceiverActivity.class);
        this.classes.add(DownloadReceiverActivity.class);
        this.classes.add(ResourcesUtilActivity.class);
        this.classes.add(LocationManagerActivity.class);
        this.classes.add(RxSyncActivity.class);
        this.classes.add(RxAsyncActivity.class);
        this.classes.add(RxMapActivity.class);
        this.classes.add(DialogActivity.class);
        this.classes.add(PopupWindowActivity.class);
        this.classes.add(TagTextViewActivity.class);
        this.classes.add(EasyFlowLayoutActivity.class);
        this.classes.add(SpanActivity.class);
        this.classes.add(OttoActivity.class);
        this.classes.add(AnimatorActivity.class);
        this.classes.add(CanvasClipViewActivity.class);
        this.classes.add(RoundImageViewActivity.class);
        this.classes.add(XfermodesActivity.class);
        this.classes.add(EasyArcLoadingActivity.class);
        this.classes.add(RxBusActivity.class);
        this.classes.add(EasyLikeAreaTopicActivity.class);
        this.classes.add(EasyLikeAreaQZoneActivity.class);
        this.classes.add(EasyLikeAreaStyleActivity.class);
        this.classes.add(LetterSectionActivity.class);
        this.classes.add(CircleImageSectionActivity.class);
        this.classes.add(RoundImageSectionActivity.class);
        this.classes.add(LruCacheActivity.class);
        this.classes.add(VolleyActivity.class);

        this.adapter = new MainRecyclerViewAdapter();
        this.adapter.setList(classes);

        this.menuRV.setAdapter(adapter);
        //        setSupportActionBar(toolbar);
    }


    public class MainRecyclerViewAdapter extends EasyRecyclerViewAdapter {

        public final int camnterColor = 0xffC04F90;
        public final int drakeetColor = 0xff5B64AF;


        @Override public int[] getItemLayouts() {
            return new int[] { R.layout.item_main };
        }


        @SuppressLint("SetTextI18n") @Override
        public void onBindRecycleViewHolder(EasyRecyclerViewHolder easyRecyclerViewHolder, int i) {
            Class c = (Class) this.getList().get(i);
            if (c == null) return;
            TextView content = easyRecyclerViewHolder.findViewById(R.id.main_item_tv);
            TextView type = easyRecyclerViewHolder.findViewById(R.id.main_item_type);

            content.setText(c.getSimpleName());
            if (c.getName().contains("drakeet")) {
                type.setText("drakeet");
                type.setTextColor(drakeetColor);
                type.setBackgroundResource(R.drawable.bg_main_item_type_drakeet);
            } else {
                type.setText("CaMnter");
                type.setTextColor(camnterColor);
                type.setBackgroundResource(R.drawable.bg_main_item_type_camnter);
            }
        }


        @Override public int getRecycleViewItemType(int i) {
            return 0;
        }
    }
}
