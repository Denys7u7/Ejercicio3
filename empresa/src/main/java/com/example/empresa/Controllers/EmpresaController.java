package com.example.empresa.Controllers;

import com.example.empresa.Models.Empresa;
import com.example.empresa.Repositories.EmpresaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaRepositorie er;

    @GetMapping("/get")
    public List<Empresa> obtenerTodas(){
        return er.findAll();
    }

    @GetMapping("/get/{id}")
    public Empresa obtenerUna(@PathVariable ("id") int id){
        return er.getOne(id);
    }

    @PostMapping("/post")
    public void insertar(@RequestBody Empresa e){
        er.save(e);
    }

    @PutMapping("/put")
    public void actualizar(@RequestBody Empresa e){
        er.save(e);
    }

    @DeleteMapping("/del/{id}")
    public void borrarPorId(@PathVariable ("id") int id){
        er.deleteById(id);
    }

    @DeleteMapping("/del")
    public void borrarEmpresa(@RequestBody Empresa e){
        er.delete(e);
    }
}
