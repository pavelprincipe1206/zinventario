/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/EntityResponse.java.e.vm
 */
package com.incloud.hcp.domain.response;

import com.incloud.hcp.domain.BaseResponseDomain;
import com.incloud.hcp.domain.Lote;
import com.incloud.hcp.domain.Producto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * Simple Interface for Lote.
 */
@Data
@ToString
@EqualsAndHashCode
public class LoteResponse extends BaseResponseDomain<Lote> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String stockCondicion;
    private String precioCondicion;
    //private String idProductoCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<Integer> stockList;
    private List<BigDecimal> precioList;
    private List<Producto> idProductoList;

}
