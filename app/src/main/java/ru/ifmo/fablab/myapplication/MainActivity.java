package ru.ifmo.fablab.myapplication;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ru.ifmo.fablab.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @BindingAdapter({"app:url"})
    public static void bindImageUrl(ImageView imageView, String url){
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setVm(new ViewModel("https://vignette.wikia.nocookie.net/fantendo/images/f/fa/Mario_NASASR.png"));
    }
}
