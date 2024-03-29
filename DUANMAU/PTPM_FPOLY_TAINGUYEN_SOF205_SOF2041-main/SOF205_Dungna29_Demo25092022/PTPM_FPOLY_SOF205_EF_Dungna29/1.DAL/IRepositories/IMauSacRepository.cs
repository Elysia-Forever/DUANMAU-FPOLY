﻿using _1.DAL.DomainClass;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1.DAL.IRepositories
{
    public interface IMauSacRepository
    {
        bool Add(MauSac obj);
        bool Update(MauSac obj);
        bool Delete(MauSac obj);
        MauSac GetById(Guid id);//Phương thức tìm sản phẩm theo ID
        List<MauSac> GetAll();
    }
}
