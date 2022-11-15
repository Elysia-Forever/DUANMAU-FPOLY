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
    public class NsxRepository:INsxRepository
    {
        private FpolyDBContext _dbContext;

        public NsxRepository()
        {
            _dbContext = new FpolyDBContext();
        }
        public bool Add(Nsx obj)
        {
            throw new NotImplementedException();
        }

        public bool Update(Nsx obj)
        {
            throw new NotImplementedException();
        }

        public bool Delete(Nsx obj)
        {
            throw new NotImplementedException();
        }

        public Nsx GetById(Guid id)
        {
            throw new NotImplementedException();
        }

        public List<Nsx> GetAll()
        {
            return _dbContext.Nsxes.ToList();
        }
    }
}
