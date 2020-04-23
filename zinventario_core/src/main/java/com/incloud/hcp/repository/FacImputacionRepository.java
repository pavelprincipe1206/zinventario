/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/repository/EntityRepository.java.e.vm
 */
package com.incloud.hcp.repository;

import com.incloud.hcp.domain.FacFactura;
import com.incloud.hcp.domain.FacImputacion;
import com.incloud.hcp.domain.FacImputacion_;
import com.incloud.hcp.domain.MtrCuentaImputacion;
import com.incloud.hcp.repository._framework.JPACustomRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

@NoRepositoryBean
public interface FacImputacionRepository extends JPACustomRepository<FacImputacion, Integer> {

    default List<FacImputacion> findCompletePaginated(String query, int maxResults) {
        FacImputacion probe = new FacImputacion();
        //probe.setEstado(query);
        probe.setEstado(null);
        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(FacImputacion_.estado.getName(), match -> match.ignoreCase().startsWith());

        Page<FacImputacion> page = this.findAll(Example.of(probe, matcher), PageRequest.of(0, maxResults));
        return page.getContent();
    }

    Long countByMtrCuentaImputacion(@Param("mtrCuentaImputacion") MtrCuentaImputacion mtrCuentaImputacion);

    Long countByFacFactura(@Param("facFactura") FacFactura facFactura);

}
