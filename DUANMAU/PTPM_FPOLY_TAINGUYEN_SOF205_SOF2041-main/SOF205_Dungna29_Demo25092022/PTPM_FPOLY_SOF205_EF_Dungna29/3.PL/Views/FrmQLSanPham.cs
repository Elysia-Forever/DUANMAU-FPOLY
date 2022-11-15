using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using _1.DAL.DomainClass;
using _2.BUS.IServices;
using _2.BUS.Services;
using _2.BUS.ViewModels;

namespace _3.PL.Views
{
    public partial class FrmQLSanPham : Form
    {
        private IQLSanPhamService _iQlSanPhamService;


        public FrmQLSanPham()
        {
            InitializeComponent();
            _iQlSanPhamService = new QLSanPhamService();
            //Cần chức năng gì thì gọi ra thông Service
            LoadDGriSP();
        }
        private void LoadDGriSP()
        {
            int stt = 1;
            Type type = typeof(CuaHang);
            dataGridView1.ColumnCount = 8;//Hiển thị bao nhiểu cột tự cấu hình
            dataGridView1.Columns[0].Name = "STT";
            dataGridView1.Columns[1].Name = "Id";
            dataGridView1.Columns[2].Name = "Tên SP";
            dataGridView1.Columns[3].Name = "Tên Mầu";
            dataGridView1.Columns[4].Name = "Tên NSX";
            dataGridView1.Columns[5].Name = "Tên Dòng SP";
            dataGridView1.Columns[6].Name = "Năm BH";
            dataGridView1.Columns[7].Name = "Mô tả";
            dataGridView1.Rows.Clear();

            foreach (var x in _iQlSanPhamService.GetAll())
            {
                dataGridView1.Rows.Add(stt++, x.ChiTietSp.Id, x.SanPham.Ten, x.MauSac.Ten, x.Nsx.Ten, x.DongSp.Ten,x.ChiTietSp.NamBh,x.ChiTietSp.MoTa);
            }
        }
        private SanPhamView GetDataFromGui()
        {
            SanPhamView spv = new SanPhamView();
            spv.ChiTietSp= new ChiTietSp()
            {
                IdSp = Guid.Parse("6C519155-C6C6-4E78-830D-D035001541FA"),
                IdDongSp = Guid.Parse("4FD32F54-93EE-4749-8A1A-E0A3B3E6A22E"),
                IdMauSac = Guid.Parse("BF1707F4-69AC-497C-962E-2E9AFA571985"),
                MoTa = "Sản phẩm add tay"
            };//Gán các control từ giao diện vào chỗ này

            //spv.MauSac = đối tượng mầu sắc trên control mà tìm được
            return spv;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            _iQlSanPhamService.Add(GetDataFromGui());
            LoadDGriSP();

        }
    }
}
