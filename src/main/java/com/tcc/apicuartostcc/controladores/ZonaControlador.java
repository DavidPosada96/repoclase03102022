package com.tcc.apicuartostcc.controladores;


import com.tcc.apicuartostcc.entidades.Zona;
import com.tcc.apicuartostcc.servicios.implementaciones.ZonaServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("api/tcc/zonas")
public class ZonaControlador {

    @Autowired
    ZonaServicioImp zonaservicio;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Zona zona){

        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(zonaservicio.registrar(zona));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Mensaje:Revise su peticion.");

        }

    }


    @GetMapping
    public ResponseEntity<?> buscarTodos(@RequestBody Zona zona){

        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(zonaservicio.buscarTodos());

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Mensaje:Revise su peticion.");

        }

    }









}
