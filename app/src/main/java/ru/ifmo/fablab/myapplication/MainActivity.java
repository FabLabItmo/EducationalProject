package ru.ifmo.fablab.myapplication;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
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
        final ViewModel vm = new ViewModel();
        binding.setVm(vm);
        RecyclerView rv = findViewById(R.id.recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter<VH>() {
            @Override
            public VH onCreateViewHolder(ViewGroup parent, int viewType) {
                return new VH(getLayoutInflater().inflate(R.layout.item_layout,parent,false));
            }

            @Override
            public void onBindViewHolder(VH holder, int position) {
                bindImageUrl(holder.imageView,vm.models.get(position).url);
            }

            @Override
            public int getItemCount() {
                return vm.models.size();
            }
        });
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView imageView;

        public VH(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
        }
    }

}
