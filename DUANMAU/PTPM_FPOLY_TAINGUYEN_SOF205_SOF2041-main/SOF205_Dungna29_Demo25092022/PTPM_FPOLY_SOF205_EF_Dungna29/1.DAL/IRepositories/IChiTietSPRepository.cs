﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _1.DAL.DomainClass;

namespace _1.DAL.IRepositories
{
    public interface IChiTietSPRepository
    {
        bool Add(ChiTietSp obj);
        bool Update(ChiTietSp obj);
        bool Delete(ChiTietSp obj);
        ChiTietSp GetById(Guid id);//Phương thức tìm sản phẩm theo ID
        List<ChiTietSp> GetAll();
    }
}
