using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _1.DAL.Context;
using _1.DAL.DomainClass;
using _1.DAL.IRepositories;
using Microsoft.EntityFrameworkCore;

namespace _1.DAL.Repositories
{
    public class SanphamRepository:ISanphamRepository
    {
        private FpolyDBContext _dbContext;

        public SanphamRepository()
        {
            _dbContext = new FpolyDBContext();
        }
        public bool Add(SanPham obj)
        {
            throw new NotImplementedException();
        }

        public bool Update(SanPham obj)
        {
            throw new NotImplementedException();
        }

        public bool Delete(SanPham obj)
        {
            throw new NotImplementedException();
        }

        public SanPham GetById(Guid id)
        {
            throw new NotImplementedException();
        }

        public List<SanPham> GetAll()
        {
            return _dbContext.SanPhams.ToList();
        }
    }
}
