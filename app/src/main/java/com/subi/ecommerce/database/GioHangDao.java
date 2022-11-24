package com.subi.ecommerce.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.subi.ecommerce.GioHangActivity;
import com.subi.ecommerce.model.GioHangDomain;

import java.util.ArrayList;

public class GioHangDao {
    Database dtb;
    SQLiteDatabase db;

    public GioHangDao(Context context) {
        dtb = new Database(context);
        db = dtb.getWritableDatabase();
    }

    //Lấy toàn bộ list chấm bài
    public ArrayList<GioHangDomain> getAll() {
        ArrayList<GioHangDomain> list = new ArrayList<>();
        Cursor cs = db.rawQuery("SELECT * FROM giohang", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()) {
            Integer idSanPham = cs.getInt(0);
            String tenSanPham = cs.getString(1);
            String moTa = cs.getString(2);
            String giaSanPham = cs.getString(3);
            String loaiSanPham = cs.getString(4);
            Integer image = cs.getInt(5);
            Integer soLuong = cs.getInt(6);
            GioHangActivity.sum += soLuong * Integer.parseInt(giaSanPham);
            GioHangDomain gioHangDomain = new GioHangDomain(idSanPham, tenSanPham, moTa, giaSanPham, loaiSanPham, image, soLuong);
            list.add(gioHangDomain);
            cs.moveToNext();
        }
        cs.close();
        return list;
    }

    public GioHangDomain getGioHang(int id) {
        Cursor cs = db.rawQuery("SELECT * FROM giohang WHERE idSanPham ='" + id + "'", null);
        cs.moveToFirst();
        Integer idSanPham = cs.getInt(0);
        String tenSanPham = cs.getString(1);
        String moTa = cs.getString(2);
        String giaSanPham = cs.getString(3);
        String loaiSanPham = cs.getString(4);
        Integer image = cs.getInt(5);
        Integer soLuong = cs.getInt(6);
        GioHangDomain gioHangDomain = new GioHangDomain(idSanPham, tenSanPham, moTa, giaSanPham, loaiSanPham, image, soLuong);
        cs.close();
        return gioHangDomain;
    }

    //Thêm
    public boolean them(GioHangDomain gioHangDomain) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("idSanPham", gioHangDomain.getIdSanPham());
        contentValues.put("tenSanPham", gioHangDomain.getTenSanPham());
        contentValues.put("moTa", gioHangDomain.getMoTa());
        contentValues.put("giaSanPham", gioHangDomain.getGiaSanPham());
        contentValues.put("loaiSanPham", gioHangDomain.getLoaiSanPham());
        contentValues.put("image", gioHangDomain.getImage());
        contentValues.put("soLuong", gioHangDomain.getSoLuong());
        long r = db.insert("giohang", null, contentValues);
        if (r <= 0) {
            return false;
        }
        return true;
    }

    public void themSoluong(GioHangDomain gioHangDomain) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("soLuong", gioHangDomain.getSoLuong() + 1);
        db.update("giohang", contentValues, "idSanPham=?", new String[]{String.valueOf(gioHangDomain.getIdSanPham())});
    }

    //Xóa
    public boolean xoa(GioHangDomain gioHangDomain) {
        GioHangActivity.sum -= gioHangDomain.getSoLuong() * Integer.parseInt(gioHangDomain.getGiaSanPham());
        int r = db.delete("giohang", "idSanPham=?", new String[]{String.valueOf(gioHangDomain.getIdSanPham())});
        if (r <= 0) {
            return false;
        }
        return true;
    }
    public void delete() {
        db.execSQL("delete from giohang");
        db.close();
    }
}
