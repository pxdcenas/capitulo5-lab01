package edu.cibertec.capitulo5.lab01.repository;

import edu.cibertec.capitulo5.lab01.model.Departamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {

}
