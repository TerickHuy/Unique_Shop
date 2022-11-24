package com.subi.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.subi.ecommerce.adapter.ShowDialog;
import com.subi.ecommerce.database.GioHangDao;
import com.subi.ecommerce.model.GioHangDomain;
import com.subi.ecommerce.model.SanPhamDomain;

public class DetailActivity extends AppCompatActivity {
    private SanPhamDomain sanPhamDomain;
    private ImageView imageView;
    private TextView name, price, mota;
    private Button add;
    private GioHangDao gioHangDao;
    private ShowDialog showDialog;
    private GioHangDomain gioHangDomain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        sanPhamDomain = (SanPhamDomain) getIntent().getSerializableExtra("sp");
        //Khai báo
        init();

        //Set tiêu đề
        setTitle("CHI TIẾT SẢN PHẨM");
        //set Data
        try {
            name.setText(sanPhamDomain.getTenSanPham());
            price.setText(sanPhamDomain.getGiaSanPham());
            mota.setText(sanPhamDomain.getMoTa());
            imageView.setImageResource(sanPhamDomain.getImage());
        } catch (Exception e) {

        }

        //Khi bấm nút để thêm vào giỏ hàng
        add.setOnClickListener(view -> {
            gioHangDomain = new GioHangDomain(sanPhamDomain.getId(), sanPhamDomain.getTenSanPham(), sanPhamDomain.getMoTa(), sanPhamDomain.getGiaSanPham(), sanPhamDomain.getLoaiSanPham(), sanPhamDomain.getImage(), 1);
            if (gioHangDao.them(gioHangDomain)) {
                showDialog.show("Thêm vào giỏ hàng thành công!");
            } else {
                gioHangDomain = gioHangDao.getGioHang(sanPhamDomain.getId());
                gioHangDao.themSoluong(gioHangDomain);
                showDialog.show("Thêm vào giỏ hàng thành công!");
            }
        });
    }

    private void init() {
        imageView = findViewById(R.id.ivNewsList);
        name = findViewById(R.id.one_name);
        price = findViewById(R.id.one_price);
        mota = findViewById(R.id.tv_mota);
        add = findViewById(R.id.btn_add);
        gioHangDao = new GioHangDao(this);
        showDialog = new ShowDialog(this);
    }

    //icon giỏ hàng
//Set menu cho action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_giohang, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.giohang:
                startActivity(new Intent(this, GioHangActivity.class));
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}