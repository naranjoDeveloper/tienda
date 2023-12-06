package naran.store.controller;


import naran.store.model.Productos;
import naran.store.service.CategorieService;
import naran.store.service.ProductoService;
import naran.store.service.ProductoSizeService;
import naran.store.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductosController {

    @Autowired
    ProductoService productService;

    @Autowired
    CategorieService catService;

    @Autowired
    SizeService sizeService;

    @Autowired
    ProductoSizeService productoSizeService;


    @GetMapping
    private String get(Model model){
        model.addAttribute("categories" , catService.findAll());
        model.addAttribute("products" , productService.findAll());
        model.addAttribute("sizes" , sizeService.findAll());
        model.addAttribute("productSize" , productoSizeService.findAll());
        System.out.println(sizeService.findAll());
        return "products";
    }


    @PostMapping("/save")
    private String save(Productos producto){
        productService.save(producto);
       System.out.println(producto.toString());
       return "redirect:/products";
    }


}
