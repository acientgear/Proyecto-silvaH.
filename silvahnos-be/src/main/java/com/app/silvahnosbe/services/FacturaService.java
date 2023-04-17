package com.app.silvahnosbe.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.silvahnosbe.entities.FacturaEntity;
import com.app.silvahnosbe.repositories.FacturaRepository;

@Service
public class FacturaService {
    
    @Autowired
    FacturaRepository facturaRepository;

    public ArrayList<FacturaEntity> obtenerFacturas(){
        return (ArrayList<FacturaEntity>) facturaRepository.findAll();
    }

    public FacturaEntity obtenerFacturaPorId(Long id){
        return facturaRepository.findById(id).orElse(null);
    }

    public FacturaEntity guardarFactura(FacturaEntity factura){
        return facturaRepository.save(factura);
    }
}