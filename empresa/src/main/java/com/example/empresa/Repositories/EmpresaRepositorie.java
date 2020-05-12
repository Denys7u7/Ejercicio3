package com.example.empresa.Repositories;

import com.example.empresa.Models.Empresa;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface EmpresaRepositorie extends JpaRepositoryImplementation<Empresa, Integer> {
}
