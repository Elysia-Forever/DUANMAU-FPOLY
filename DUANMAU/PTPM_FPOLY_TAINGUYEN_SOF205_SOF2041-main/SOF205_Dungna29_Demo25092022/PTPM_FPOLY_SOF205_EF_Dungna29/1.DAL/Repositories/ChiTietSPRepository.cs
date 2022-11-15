using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _1.DAL.Context;
using _1.DAL.DomainClass;
using _1.DAL.IRepositories;

namespace _1.DAL.Repositories
{
    public class ChiTietSPRepository:IChiTietSPRepository
    {
        private FpolyDBContext _dbContext;

        public ChiTietSPRepository()
        {
            _dbContext = new FpolyDBContext();
        }
        public bool Add(ChiTietSp obj)
        {
            if (obj == null) return false;
            obj.Id = Guid.NewGuid();//Tự động zen khóa chính
            _dbContext.ChiTietSps.Add(obj);
            _dbContext.SaveChanges();
            return true;
        }

        public bool Update(ChiTietSp obj)
        {
            if (obj == null) return false;
            var tempobj = _dbContext.ChiTietSps.FirstOrDefault(c => c.Id == obj.Id);
            tempobj.GiaBan = obj.GiaBan;
            tempobj.GiaNhap = obj.GiaNhap;
            tempobj.IdDongSp = obj.IdDongSp;
            tempobj.IdMauSac = obj.IdMauSac;
            tempobj.IdNsx = obj.IdNsx;
            //Còn bao nhiêu thuộc tính làm tương tự
            _dbContext.Update(tempobj);
            _dbContext.SaveChanges();
            return true;
        }

        public bool Delete(ChiTietSp obj)
        {
            if (obj == null) return false;
            var tempobj = _dbContext.ChiTietSps.FirstOrDefault(c => c.Id == obj.Id);

            _dbContext.Remove(tempobj);
            _dbContext.SaveChanges();
            return true;
        }

        public ChiTietSp GetById(Guid id)
        {
            if (id == Guid.Empty) return null;
            return _dbContext.ChiTietSps.FirstOrDefault(c => c.Id == id); ;
        }

        public List<ChiTietSp> GetAll()
        {
            return _dbContext.ChiTietSps.ToList();
        }
    }
}
