using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _2.BUS.ViewModels;

namespace _2.BUS.IServices
{
    public interface IQLSanPhamService
    {
        string Add(SanPhamView obj);
        string Update(SanPhamView obj);
        string Delete(SanPhamView obj);
        List<SanPhamView> GetAll();
    }
}
