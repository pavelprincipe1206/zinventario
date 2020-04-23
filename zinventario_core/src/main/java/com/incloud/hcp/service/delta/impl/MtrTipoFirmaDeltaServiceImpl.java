/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntitydeltaDTOService.java.e.vm
 */
package com.incloud.hcp.service.delta.impl;

import com.incloud.hcp.domain.MtrTipoFirma;
import com.incloud.hcp.service.delta.MtrTipoFirmaDeltaService;
import com.incloud.hcp.service.impl.MtrTipoFirmaServiceImpl;
import com.incloud.hcp.service.support.PageRequestByExample;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * A simple DTO Facility for MtrTipoFirma.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrTipoFirmaDeltaServiceImpl extends MtrTipoFirmaServiceImpl implements MtrTipoFirmaDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "codigoTipoFirma"),
                new Sort.Order(Sort.Direction.ASC, "descripcion")
        );
        return sort;
    }

    protected Sort setFind(MtrTipoFirma req, ExampleMatcher matcher, Example<MtrTipoFirma> example, Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "codigoTipoFirma"),
                new Sort.Order(Sort.Direction.ASC, "descripcion")
        );
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrTipoFirma> req, ExampleMatcher matcher, Example<MtrTipoFirma> example) {
        return;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrTipoFirma bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrTipoFirma setCreate(MtrTipoFirma bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrTipoFirma dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrTipoFirma setUploadExcel(Cell currentCell, MtrTipoFirma mtrTipoFirma, int contador) throws Exception {
        mtrTipoFirma = super.setUploadExcel(currentCell, mtrTipoFirma, contador);
        return mtrTipoFirma;
    }

    protected String setSaveMasivo(MtrTipoFirma dto) throws Exception {
        return "";
    }

    protected List<MtrTipoFirma> setBeforeDeleteMasivo(List<MtrTipoFirma> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrTipoFirma bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
