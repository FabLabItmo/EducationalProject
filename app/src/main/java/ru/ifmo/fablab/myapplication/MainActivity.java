package ru.ifmo.fablab.myapplication;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ru.ifmo.fablab.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ItemSelectionListener, AddClickListener{
    @BindingConversion
    public static int convertBooleanToVisibility(boolean b){
        return b ? View.VISIBLE : View.INVISIBLE;
    }

    @BindingAdapter({"app:url"})
    public static void bindImageUrl(ImageView imageView, String url){
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final ViewModel vm = new ViewModel(this,this);
        binding.setVm(vm);
    }

    @Override
    public void onItemSelected(ItemModel item) {
        showDetails(item);
    }

    @Override
    public void onAddClick() {
       new AddPictureDialogFragment().show(getSupportFragmentManager(),"Add dialog");
    }

    public void showDetails(ItemModel itemModel){
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("URL",itemModel.url);
        startActivity(intent);
    }
}
