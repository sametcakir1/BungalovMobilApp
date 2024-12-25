package com.example.bungalovrehberi2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Button btnGetTime;
    private TextView txtInfo;
    private TextView txtInfo2;
    private TextView txtInfo3;
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageViewKahvalti1;
    private ImageView imageViewKahvalti2;
    private ImageView imageViewKahvalti3;
    private TextView textViewFiyat;
    private TextView textViewFiyat2;
    private TextView textViewFiyat3;
    private TextView textViewPerson1;
    private TextView textViewPerson2;
    private TextView textViewPerson3;
    private TextView textViewBed1;
    private TextView textViewBed2;
    private TextView textViewBed3;
    private TextView textViewKahvalti1;
    private TextView textViewKahvalti2;
    private TextView textViewKahvalti3;

    private String addUrl = "https://bungalovrehberi.com/resize?w=700&webp=1&img=storage/";
    private String kisi =" kisi";
    private String cift =" cift";
    private String tek =" tek";
    private Retrofit retrofit;
    private ApiService apiService;
    private Call<BungalovList> bungalovListCall;
    private String baseurl = "https://bungalovrehberi.com/api/";
    private BungalovList bungalovList;

    private NestedScrollView nestedScrollView;
    private RecyclerView recyclerView;
    private BungalovAdapter adapter;
    private List<BungalovList.Ev> bungalowList = new ArrayList<>();
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int currentPage = 1;
    private int totalPages = 13;
    private String nextPageUrl = "";


    private void init(){
        btnGetTime = findViewById(R.id.main_activity_btnGetTime);
        btnGetTime.setBackgroundResource(R.drawable.button);
        txtInfo= findViewById(R.id.main_activity_txtInfo);
        txtInfo2= findViewById(R.id.main_activity_txtInfo2);
        txtInfo3= findViewById(R.id.main_activity_txtInfo3);
        imageView = findViewById(R.id.main_activity_imageView);
        imageView2 = findViewById(R.id.main_activity_imageView2);
        imageView3 = findViewById(R.id.main_activity_imageView3);
        textViewFiyat = findViewById(R.id.textViewFiyat);
        textViewFiyat2 = findViewById(R.id.textViewFiyat2);
        textViewFiyat3 = findViewById(R.id.textViewFiyat3);
        textViewPerson1 = findViewById(R.id.textViewPerson1);
        textViewPerson2 = findViewById(R.id.textViewPerson2);
        textViewPerson3 = findViewById(R.id.textViewPerson3);
        recyclerView = findViewById(R.id.recyclerView);
        textViewBed1 = findViewById(R.id.textViewBed1);
        textViewBed2 = findViewById(R.id.textViewBed2);
        textViewBed3 = findViewById(R.id.textViewBed3);
        textViewKahvalti1 = findViewById(R.id.textViewKahvalti1);
        textViewKahvalti2 = findViewById(R.id.textViewKahvalti2);
        textViewKahvalti3 = findViewById(R.id.textViewKahvalti3);
        imageViewKahvalti3 = findViewById(R.id.imageViewKahvalti1);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();
        setRetrofitSettings();


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BungalovAdapter(bungalowList);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!isLoading && layoutManager != null && layoutManager.findLastCompletelyVisibleItemPosition() == bungalowList.size() - 1) {
                    if (currentPage < totalPages) {
                        loadNextPage();
                    }
                }
            }
        });
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        private final ImageView imageView;

        public DownloadImageTask(ImageView imageView) {
            this.imageView = imageView;
        }

        @Override
        protected Bitmap doInBackground(String... urls) {
            String urlDisplay = urls[0];
            Bitmap bitmap = null;
            try {
                URL url = new URL(urlDisplay);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                bitmap = BitmapFactory.decodeStream(input);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            if (result != null && imageView != null) {
                imageView.setImageBitmap(result);
            }
        }
    }

    private void setRetrofitSettings() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BungalowService apiService = retrofit.create(BungalowService.class);
        Call<BungalovList> bungalovListCall = apiService.getBungalows();

        SecondApiService SecondApiService = retrofit.create(SecondApiService.class);
        Call<BungalovDetail> bungalovDetailCall = SecondApiService.getBungalovDetail();


        bungalovListCall.enqueue(new Callback<BungalovList>() {
            @Override
            public void onResponse(Call<BungalovList> call, Response<BungalovList> response) {
                if (response.isSuccessful() && response.body() != null) {
                    BungalovList bungalovList = response.body();
                    List<BungalovList.Ev> evList = bungalovList.getData().getEvler().getData();

                    if (!evList.isEmpty()) {

                        for (BungalovList.Ev ev : evList) {
                            int evId = ev.getId();

                            Log.d("MainActivity", "Ev ID'si: " + evId);
                        }
                        setUpInitialViews(evList);
                    } else {
                        textViewFiyat.setText("Ev bulunamadı.");
                    }
                }
            }

            @Override
            public void onFailure(Call<BungalovList> call, Throwable t) {
                Log.e("MainActivity", "API çağrısı başarısız: " + t.getMessage());
            }
        });
    }
    private void setUpInitialViews(List<BungalovList.Ev> evList) {
        BungalovList.Ev firstEv = evList.get(0);
        BungalovList.Ev secondEv = evList.get(1);
        BungalovList.Ev thirdEv = evList.get(2);

        txtInfo.setText(firstEv.getIsim());
        txtInfo2.setText(secondEv.getIsim());
        txtInfo3.setText(thirdEv.getIsim());

        String baseString = "TL / Gecelik Fiyat";

        String firstPrice = String.valueOf(firstEv.getHafta_ici_fiyat()) + baseString;
        SpannableString spannableString1 = new SpannableString(firstPrice);
        spannableString1.setSpan(new ForegroundColorSpan(Color.RED), 0,  String.valueOf(firstEv.getHafta_ici_fiyat()).length() + 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewFiyat.setText(spannableString1);

        String secondPrice = String.valueOf(secondEv.getHafta_ici_fiyat()) + baseString;
        SpannableString spannableString2 = new SpannableString(secondPrice);
        spannableString2.setSpan(new ForegroundColorSpan(Color.RED), 0, String.valueOf(secondEv.getHafta_ici_fiyat()).length() + 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewFiyat2.setText(spannableString2);

        String thirdPrice = String.valueOf(thirdEv.getHafta_ici_fiyat()) + baseString;
        SpannableString spannableString3 = new SpannableString(thirdPrice);
        spannableString3.setSpan(new ForegroundColorSpan(Color.RED), 0, String.valueOf(thirdEv.getHafta_ici_fiyat()).length() + 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewFiyat3.setText(spannableString3);

        textViewBed1.setText(firstEv.getTek_yatak() + tek +" + "+firstEv.getCift_yatak() + cift);
        textViewBed2.setText(secondEv.getTek_yatak() + tek +" + "+firstEv.getCift_yatak() + cift);
        textViewBed3.setText(thirdEv.getTek_yatak() + tek +" + "+firstEv.getCift_yatak() + cift);

        textViewPerson1.setText(firstEv.getMax_kisi() + kisi);
        textViewPerson2.setText(secondEv.getMax_kisi() + kisi);
        textViewPerson3.setText(thirdEv.getMax_kisi() + kisi);

        new DownloadImageTask(imageView).execute(addUrl + firstEv.getFile());
        new DownloadImageTask(imageView2).execute(addUrl + secondEv.getFile());
        new DownloadImageTask(imageView3).execute(addUrl + thirdEv.getFile());

    }

    private void loadNextPage() {
        if (isLoading || isLastPage) {
            return;
        }

        isLoading = true;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BungalowService service = retrofit.create(BungalowService.class);
        Call<BungalovList> call = service.getBungalows(nextPageUrl.isEmpty() ? "" : nextPageUrl);

        call.enqueue(new Callback<BungalovList>() {
            @Override
            public void onResponse(Call<BungalovList> call, Response<BungalovList> response) {
                if (response.isSuccessful() && response.body() != null) {
                    BungalovList bungalovList = response.body();
                    List<BungalovList.Ev> newBungalows = bungalovList.getData().getEvler().getData();

                    if (newBungalows != null && !newBungalows.isEmpty()) {
                        bungalowList.addAll(newBungalows);
                        adapter.notifyDataSetChanged();

                        nextPageUrl = bungalovList.getData().getEvler().getNext_page_url();
                        currentPage++;

                        if (nextPageUrl == null || nextPageUrl.isEmpty()) {
                            isLastPage = true;
                        }
                    }
                } else {
                    isLastPage = true;
                }
                isLoading = false;
            }

            @Override
            public void onFailure(Call<BungalovList> call, Throwable t) {
                Log.e("MainActivity", "Veri çekme hatası: " + t.getMessage());
                isLoading = false;
            }
        });
    }



}