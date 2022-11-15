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
    public class DspRepository:IDspRepository
    {
        private FpolyDBContext _dbContext;

        public DspRepository()
        {
            _dbContext = new FpolyDBContext();
        }
        public bool Add(DongSp obj)
        {
            throw new NotImplementedException();
        }

        public bool Update(DongSp obj)
        {
            throw new NotImplementedException();
        }

        public bool Delete(DongSp obj)
        {
            throw new NotImplementedException();
        }

        public DongSp GetById(Guid id)
        {
            throw new NotImplementedException();
        }

        public List<DongSp> GetAll()
        {
            return _dbContext.DongSps.ToList();
        }
    }
}
