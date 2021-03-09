/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.ProductoDAO;
import netb.mantenimiento.mantspringboot.model.DetallesAdicionales;
import netb.mantenimiento.mantspringboot.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    private ProductoDAO productoDAO;

    @Override
    @Transactional
    public Boolean guardarProducto(Producto producto) throws Exception {
        if (null != producto.getDetallesAdicionales() && producto.getDetallesAdicionales().size() > 0) {
               System.out.println("Detalles Adicionales: " + producto.getDetallesAdicionales());
               for(DetallesAdicionales da : producto.getDetallesAdicionales()){
                   da.toString();
                   da.setProducto(producto);
               }
        }
        productoDAO.save(producto);
        return true;

    }

    @Override
    public Boolean actualizarProducto(Producto producto) throws Exception {
        productoDAO.save(producto);
        return true;
    }

    @Override
    public Boolean eliminarProductoPorId(Long Id) throws Exception {
        productoDAO.deleteById(Id);
        return true;
    }

    @Override
    public List<Producto> listarTodos() throws Exception {
        List<Producto> listProductos = (List<Producto>) productoDAO.findAll();
        if (null != listProductos && listProductos.size() > 0) {
            return listProductos;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Existen Productos");
        }
    }

    @Override
    public List<Producto> productoPorParametros(Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        List<Producto> listProductos = productoDAO.productoPorParametros(busqueda, sortedById);
        if (null != listProductos && listProductos.size() > 0) {
            return listProductos;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Existen Productos");
        }
    }

}
