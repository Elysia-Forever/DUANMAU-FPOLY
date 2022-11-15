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
    public class MauSacRepository:IMauSacRepository
    {
        private FpolyDBContext _dbContext;

        public MauSacRepository()
        {
            _dbContext = new FpolyDBContext();
        }
        public bool Add(MauSac obj)
        {
            throw new NotImplementedException();
        }

        public bool Update(MauSac obj)
        {
            throw new NotImplementedException();
        }

        public bool Delete(MauSac obj)
        {
            throw new NotImplementedException();
        }

        public MauSac GetById(Guid id)
        {
            throw new NotImplementedException();
        }

        public List<MauSac> GetAll()
        {
            return _dbContext.MauSacs.ToList();
        }
    }
}
