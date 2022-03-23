package com.pedidos.pedidos.controller;

import com.pedidos.pedidos.entity.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @GetMapping("/all")
    List<Producto> all(){
        return Arrays.asList(
                new Producto(1, "maquinita de afeitar", "Gillete")
        );
    }

    @PostMapping("/nuevoProducto")
    Producto save(@RequestBody Producto producto){
        return save(producto);
    }
}
