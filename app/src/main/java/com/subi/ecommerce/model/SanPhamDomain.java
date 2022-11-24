package com.subi.ecommerce.model;

import com.subi.ecommerce.R;

import java.io.Serializable;
import java.util.ArrayList;

public class SanPhamDomain implements Serializable {
    private int id;
    private String tenSanPham, moTa, giaSanPham, loaiSanPham;
    private int image;

    public SanPhamDomain() {
    }

    public SanPhamDomain(int id, String tenSanPham, String moTa, String giaSanPham, String loaiSanPham, int image) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.giaSanPham = giaSanPham;
        this.loaiSanPham = loaiSanPham;
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(String giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public ArrayList getAll() {
        ArrayList<SanPhamDomain> list = new ArrayList<>();
        list.add(new SanPhamDomain(1, "SIÊU GIẢM GIÁ GIỎ HÀNG OFFICETEL VÀ CĂN HỘ SUNRISE RIVERSIDE TỪ NOVALAND. TỪ 1.9 TỶ - 4 TỶ / CĂN",
                "- Chương trình cam kết thuê lại:\n" +
                        "+ Dưới 40m² 10 triệu/tháng (cam kết thuê 12 tháng).\n" +
                        "+ Trên 40m² 15 triệu/tháng (cam kết thuê 12 tháng).\n" +
                        "- Đặc biệt: Ưu đãi 5% cho khách đăng ký ngay hôm nay.\n" +
                        "\n" +
                        "* Loại hình:\n" +
                        "+ Căn hộ văn phòng (smart officetel) diện tích:\n" +
                        "- 30 - 50 m²: Từ 1.9 tỷ đến 2,7 tỷ / căn (full nội thất, có ban công).\n" +
                        "+ Căn hộ tháp H diện tích:\n" +
                        "- 1PN 50m² giá 2.3 tỷ / căn (full nội thất, có ban công).\n" +
                        "- 2PN 63 - 86 m² giá từ 2,7 tỷ - 4 tỷ / căn (full nội thất, có ban công).\n" +
                        "- 3PN 90,82 giá 3.3 tỷ - 4 tỷ / căn (full nội thất, có ban công)."+
                "- Đem lại sự thoải mái tiện lợi nhất cho người mặc", "590000000", "ao", R.drawable.bds_1));
        list.add(new SanPhamDomain(2, "SIÊU GIẢM GIÁ GIỎ HÀNG OFFICETEL VÀ CĂN HỘ SUNRISE RIVERSIDE TỪ NOVALAND. TỪ 1.9 TỶ - 4 TỶ / CĂN",
                "- Chương trình cam kết thuê lại:\n" +
                        "+ Dưới 40m² 10 triệu/tháng (cam kết thuê 12 tháng).\n" +
                        "+ Trên 40m² 15 triệu/tháng (cam kết thuê 12 tháng).\n" +
                        "- Đặc biệt: Ưu đãi 5% cho khách đăng ký ngay hôm nay.\n" +
                        "\n" +
                        "* Loại hình:\n" +
                        "+ Căn hộ văn phòng (smart officetel) diện tích:\n" +
                        "- 30 - 50 m²: Từ 1.9 tỷ đến 2,7 tỷ / căn (full nội thất, có ban công).\n" +
                        "+ Căn hộ tháp H diện tích:\n" +
                        "- 1PN 50m² giá 2.3 tỷ / căn (full nội thất, có ban công).\n" +
                        "- 2PN 63 - 86 m² giá từ 2,7 tỷ - 4 tỷ / căn (full nội thất, có ban công).\n" +
                        "- 3PN 90,82 giá 3.3 tỷ - 4 tỷ / căn (full nội thất, có ban công)."+
                        "- Đem lại sự thoải mái tiện lợi nhất cho người mặc", "490000000","ao", R.drawable.bds_2));
        list.add(new SanPhamDomain(3, "BÁN CĂN HỘ 1702 3PN PENTHOUSE-DISCOVERY CENTRAL, TẶNG GÓI THIẾT KẾ NỘI THẤT 70TR POINT SOLUTION",
                "- Chương trình cam kết thuê lại:\n" +
                        "+ Dưới 40m² 10 triệu/tháng (cam kết thuê 12 tháng).\n" +
                        "+ Trên 40m² 15 triệu/tháng (cam kết thuê 12 tháng).\n" +
                        "- Đặc biệt: Ưu đãi 5% cho khách đăng ký ngay hôm nay.\n" +
                        "\n" +
                        "* Loại hình:\n" +
                        "+ Căn hộ văn phòng (smart officetel) diện tích:\n" +
                        "- 30 - 50 m²: Từ 1.9 tỷ đến 2,7 tỷ / căn (full nội thất, có ban công).\n" +
                        "+ Căn hộ tháp H diện tích:\n" +
                        "- 1PN 50m² giá 2.3 tỷ / căn (full nội thất, có ban công).\n" +
                        "- 2PN 63 - 86 m² giá từ 2,7 tỷ - 4 tỷ / căn (full nội thất, có ban công).\n" +
                        "- 3PN 90,82 giá 3.3 tỷ - 4 tỷ / căn (full nội thất, có ban công)."+
                        "- Đem lại sự thoải mái tiện lợi nhất cho người mặc", "500000000","ao", R.drawable.bds_3));
        list.add(new SanPhamDomain(4, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","ao", R.drawable.bds_4));
        list.add(new SanPhamDomain(5, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","700000000","ao", R.drawable.bds_5));
        list.add(new SanPhamDomain(6, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","300000000","ao", R.drawable.bds_6));
        list.add(new SanPhamDomain(7, "Áo Thun Cổ Trụ Đơn Giản J01","Chất liệu: Cotton 4 Chiều\n"+
                "Thành phần: 95% cotton 5% Spandex\n"+
                "- Co giãn tốt\n"+
                "- Độ bền cao","150000","ao", R.drawable.bds_7));
        list.add(new SanPhamDomain(8, "Sơ Mi Tay Dài Đơn Giản M01","Chất liệu: Kate\n"+
                "Thành phần: 88% superfine 12% modal\n"+
                "- Ít Nhăn & Dễ ủi\n"+
                "- Nhanh Khô & Thoáng mát","255000","ao", R.drawable.bds_8));
        list.add(new SanPhamDomain(9, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","ao", R.drawable.bds_9));
        list.add(new SanPhamDomain(10, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","100000000","ao", R.drawable.bds_10));
        list.add(new SanPhamDomain(11, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_2));
        list.add(new SanPhamDomain(12, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","900000000","quan", R.drawable.bds_4));
        list.add(new SanPhamDomain(13, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","250000000","quan", R.drawable.bds_3));
        list.add(new SanPhamDomain(14, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","160000000","quan", R.drawable.bds_10));
        list.add(new SanPhamDomain(15, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","495000000","quan", R.drawable.bds_1));
        list.add(new SanPhamDomain(16, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_4));
        list.add(new SanPhamDomain(17, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","979000000","quan", R.drawable.bds_1));
        list.add(new SanPhamDomain(18, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_10));
        list.add(new SanPhamDomain(19, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","129000000","quan", R.drawable.bds_2));
        list.add(new SanPhamDomain(20, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_9));
        list.add(new SanPhamDomain(21, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_8));
        list.add(new SanPhamDomain(22, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","120000000","quan", R.drawable.bds_7));
        list.add(new SanPhamDomain(23, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_3));
        list.add(new SanPhamDomain(24, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","900000000","quan", R.drawable.bds_4));
        list.add(new SanPhamDomain(25, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_5));
        list.add(new SanPhamDomain(26, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","100000000","quan", R.drawable.bds_6));
        list.add(new SanPhamDomain(27, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","600000000","quan", R.drawable.bds_7));
        list.add(new SanPhamDomain(28, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","890000000","quan", R.drawable.bds_9));
        list.add(new SanPhamDomain(29, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","728000000","quan", R.drawable.bds_8));
        list.add(new SanPhamDomain(30, "QUỸ CĂN CHUYỂN NHƯỢNG MỚI NHẤT THÁNG 11 CẮT LỖ TỪ 300TR TẠI VHOCP CÁC CĂN TỪ 1PN-2-3PN MIỄN PHÍ MG","* Studio: DT 28 - 36m², nhận nhà ngay giá chỉ từ 900 triệu.\n" +
                "* 1PN + 1: DT 48m², nhận nhà ngay từ 1.25 tỷ.\n" +
                "* 2PN + 1, 1WC đa năng: DT 59.1m², đã có sổ và nhận nhà ngay giá từ 1.53 tỷ.\n" +
                "* 2PN + 1 + 2WC: DT 69m², đã có sổ và nhận nhà ngay giá từ 1.8 tỷ.\n" +
                "* 3PN, 2WC: DT 80 - 82m² đã có sổ và nhận nhà ngay giá từ 2.29 tỷ.\n" +
                "- Giá cam kết rẻ nhất thị trường..\n" +
                "- Xem nhà trực tiếp 24/7, làm việc với chủ nhà.\n" +
                "- Có ưu đãi cho khách hàng đặt cọc trước.\n" +
                "(Cam kết giá tốt nhất thị trường).\n" +
                "- Hỗ trợ thủ tục nhanh gọn, pháp lý rõ ràng. Sang tên sổ đỏ chính chủ.","789200000","quan", R.drawable.bds_10));
        return list;
    }
}
