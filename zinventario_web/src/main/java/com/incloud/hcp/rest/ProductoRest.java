/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/rest/EntityResource.java.e.vm
 */
package com.incloud.hcp.rest;

import com.incloud.hcp.domain.Producto;
import com.incloud.hcp.domain.response.ProductoResponse;
import com.incloud.hcp.repository.delta.ProductoDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ProductoRest extends JPACustomRest<ProductoResponse, Producto, Integer> {

    @Autowired
    protected ProductoDeltaRepository productoDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "Producto";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final Producto createInstance() {
        Producto producto = new Producto();
        return producto;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
