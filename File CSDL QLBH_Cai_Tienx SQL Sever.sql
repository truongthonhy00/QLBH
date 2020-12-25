CREATE DATABASE QLBH_Cai_Tienx
USE QLBH_Cai_Tienx



CREATE TABLE ACCOUNT(
	acc varchar(20),
	pass varchar(20),
	role varchar(5) default 'User',
	MaNVHT int primary key,
	TrangThaiAcc bit default 0
	)

INSERT ACCOUNT
VALUES ('admin', '123', 'Admin', 0, default),
		('user1', '123', 'User', 1, default),
		('user2', '123', 'User', 2, default)






CREATE TABLE MATHANG(
	SttMH int identity(1,1),
	MaMH varchar (15) primary key,
	TenMH nvarchar(50),
	LoaiMH nvarchar(15),
	HangSX nvarchar(20),
	SoLuong int,
	DonGia int,
	)

INSERT MATHANG 
VALUES
('R5-4', N'Realme 5 4GB', N'Điện thoại', 'Realme', 8, 535000),
('V60-ThinQ', N'LG V60 ThinQ', N'Điện thoại', 'LG', 6, 8800000),
('A50s', N'Samsung Galaxy A50s', N'Điện thoại', 'Sam Sung', 15, 6990000),
('Y11', N'Vivo Y11', N'Điện thoại', 'Vivo', 10, 4990000),
('Reno2F', N'OPPO Reno2F', N'Điện thoại', 'OPPO', 11, 7990000),
('Note8-128', N'Xiaomi Redmi Note 8 128GB', N'Điện thoại', 'Xiaomi', 8, 6900000),

('KCRV9VK', N'Điều hòa Inverter Aqua AQA-KCRV9VKS', N'Điều hòa', 'Aqua', 22,  6390000),
('V10ENP', N'Điều hòa Inverter LG V10ENP', N'Điều hòa', 'LG', 16, 8900000),
('VU9SKH', N'Điều hòah Inverter Panasonic CU/CS-VU9SKH-8', N'Điều hòa', 'Panasonic', 10, 10390000),
('RKQ35SAVMV', N'Điều hòa Daikin FTKQ35SAVMV/RKQ35SAVMV', N'Điều hòa', 'Daikin', 9, 10790000),

('WW80J52G0KW/SV', N'Samsung WW80J52G0KW/SV 8kg', N'Máy giặt', 'Samsung', 14, 6890000),
('AW-A800SV', N'Máy giặtToshiba AW-A800SV 7kg', N'Máy giặt', 'Toshiba', 20, 3950000),
('FC1408S4W2', N'Máy giặt LG FC1408S4W2 8kg', N'Máy giặt', 'LG', 17, 8290000),
('EWF80743', N'Máy giặt Electrolux EWF80743 7kg', N'Máy giặt', 'Electrolux', 15, 690000),

('KDL-40R350E', N'Ti vi Sony 40 inch KDL-40R350E', N'Ti vi', 'Sony', 9, 10900000),
('KDL-40W650D', N'Tivi Sony 40 inch KDL-40W650D', N'Ti vi', 'Sony', 7, ​9800000),
('43L5650VN', N'Smart Tivi LED Toshiba 43 Inch 43L5650VN', N'Ti vi', 'Toshiba ', 17, 7590000),
('UA43MU6100KXXV', N'Smart Tivi Samsung 43 inch 4K UA43MU6100KXXV', N'Ti vi', 'Samsung ', 12, 9890000),
('HDR', N'Smart Tivi Xiaomi TV4A 55 inch 4K HDR', N'Ti vi', 'Xiaomi ', 6, 15.490000),
('UA49MU610', N'Smart Tivi Samsung 49 inch 4K UHD UA49MU6103', N'Ti vi', 'Samsung ', 11, 11590000),
('KD-43X8000E', N'Android Tivi 4K Sony 43 inch KD-43X8000E', N'Ti vi', 'Sony ', 9, 12990000),
('UA55MU6500', N'Smart Tivi Cong Samsung 55 inch UA55MU6500', N'Ti vi', 'Samsung ', 5, 23590000),

('SJ-X201E-DS', N'Tủ Lạnh SHARP Inverter 196 Lít SJ-X201E-DS', N'Tủ lạnh', 'SHARP', 14, 5490000),
('GR-WG66VDAZ', N'Tủ Lạnh TOSHIBA Inverter 600 Lít GR-WG66VDAZ', N'Tủ lạnh', 'TOSHIBA', 8, 19390000),
('R-M700GPGV', N'Tủ Lạnh HITACHI Inverter 584 Lít R-M700GPGV2', N'Tủ lạnh', 'Hitachi', 5, 57490000),
('GN-L205S', N'Tủ Lạnh LG Inverter 187 Lít GN-L205S', N'Tủ lạnh', 'LG', 10, 4390000)


 






CREATE TABLE NHANVIEN(
    MaNV int identity(1,1) primary key,
	HoTen nvarchar(30),
	NgaySinh date, 
	DiaChi nvarchar(50),
	GioiTinh nvarchar(5),
	SDT int,
	NgayCong float(1),
	heSoLuong float(1), 
	Luong float(3)
)

INSERT NHANVIEN
VALUES (N'Trần Bảo Trọng', '1995/12/14', N'Hà Giang', N'Nam', '0985837294', 19, 1, 4000000),
		(N'Lê Thùy Dương', '1997/05/12', N'Hà Nội', N'Nữ', '0385928294', 20, 1.1, 5000000),
		(N'Trần Phương Thảo', '1996/03/30', N'Quảng Ninh', N'Nam', '0938592729', 18, 1.2, 6000000),
		(N'Lê Trường An', '1995/11/20', N'Ninh Bình', N'Nam', '0396471849', 21, 1.2, 5000000),
		(N'Phạm Thị Hương Giang', '1999/02/21', N'Hòa Bình', N'Nữ', '0918385927', 22, 1.2, 6000000),
		(N'Trần Anh Bảo', '1995/12/14', N'Hà Giang', N'Nam', '0319485729', 19, 1.4, 4000000),
		(N'Lê Thùy Dung', '1997/05/12', N'Hà Nội', N'Nữ', '0927495027', 20, 1.5, 4000000),
		(N'Phạm Trung Tính', '1996/03/30', N'Quảng Ninh', N'Nam', '0948294829',18, 1, 3000000),
		(N'Lê An Hải', '1995/11/20', N'Ninh Bình', N'Nam', '0319495739', 21, 1.2, 5000000),
		(N'Phạm Thị Giang Hương','1999/02/21', N'Hòa Bình', N'Nữ', '0958291049', 20, 1.2, 5000000)








CREATE TABLE KHACHHANG(
	MaKH int identity(1,1) primary key,
	HoTen nvarchar(30),
	DiaChi nvarchar(50),
	SDT int,
	MaSoThue varchar(15),
	TongHD int,
	TrangThaiKH bit default 1
)







Create table GIOHANG(
Stt int identity(1,1),
TenMHGH nvarchar(50),
DonGiaGH int,
SoLuongMua int,
ThanhTien int)









CREATE TABLE HOADON(
	MaHD int identity(1,1),
	MaKH int,
	MaMH varchar (15),
	SoLuongMua int,
	ThanhTien int,
	NgayTao date default getdate(),
	constraint RB_KhoaHD primary key (MaHD,MaKH,MaMH)
	)


Alter Table HOADON
Add
Constraint HD1 foreign key (MaKH) References KHACHHANG(MaKH)

Alter Table HOADON
Add
Constraint HD2 foreign key (MaMH) References MATHANG(MaMH)




