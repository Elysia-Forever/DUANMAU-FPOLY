using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _1.DAL.IRepositories;
using _1.DAL.Repositories;
using _2.BUS.IServices;
using _2.BUS.ViewModels;

namespace _2.BUS.Services
{
    public class QLSanPhamService : IQLSanPhamService
    {
        private IChiTietSPRepository _iChiTietSpRepository;
        private INsxRepository _iNsxRepository;
        private ISanphamRepository _iSanphamRepository;
        private IMauSacRepository _iMauSacRepository;
        private IDspRepository _iDspRepository;

        public QLSanPhamService()
        {
            _iChiTietSpRepository = new ChiTietSPRepository();
            _iNsxRepository = new NsxRepository();
            _iSanphamRepository = new SanphamRepository();
            _iMauSacRepository = new MauSacRepository();
            _iDspRepository = new DspRepository();
        }
        public string Add(SanPhamView obj)
        {
            if (obj == null) return "Thêm không thành công";
            var chiTietSanPham = obj.ChiTietSp;
            if (_iChiTietSpRepository.Add(chiTietSanPham)) return "Thêm thành công";
            return "Thêm không thành công";

        }

        public string Update(SanPhamView obj)
        {
            if (obj == null) return "Sửa không thành công";
            var chiTietSanPham = obj.ChiTietSp;
            if (_iChiTietSpRepository.Update(chiTietSanPham)) return "Sửa thành công";
            return "Sửa không thành công";
        }

        public string Delete(SanPhamView obj)
        {
            if (obj == null) return "Xóa không thành công";
            var chiTietSanPham = obj.ChiTietSp;
            if (_iChiTietSpRepository.Delete(chiTietSanPham)) return "Xóa thành công";
            return "Xóa không thành công";
        }

        public List<SanPhamView> GetAll()
        {
            List<SanPhamView> lstPhamViews = new List<SanPhamView>();
            //Viết 1 câu LINQ để gán giá trị cho từng prop của SPView
            lstPhamViews =
                (from a in _iChiTietSpRepository.GetAll()
                 join b in _iMauSacRepository.GetAll() on a.IdMauSac equals b.Id
                 join c in _iSanphamRepository.GetAll() on a.IdSp equals c.Id
                 join d in _iDspRepository.GetAll() on a.IdDongSp equals d.Id
                 join e in _iNsxRepository.GetAll() on a.IdNsx equals e.Id
                 select new SanPhamView()
                 {
                     ChiTietSp = a,
                     MauSac = b,
                     SanPham = c,
                     Nsx = e,
                     DongSp = d
                 }).ToList();
            //Để hiển thị sản phẩm thì có càng nhiều bảng tham gia thì join vào càng nhiều

            return lstPhamViews;

        }
    }
}
