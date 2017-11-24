/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Auto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author heltonsmith
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {

    //siempre los métodos deben retornar String
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model) {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String recibir(
            @RequestParam("pregunta1") String preg1,
            @RequestParam("pregunta2") String preg2,
            @RequestParam("pregunta3") String preg3,
            @RequestParam("pregunta4") String preg4,
            @RequestParam("pregunta5") String preg5,
            Model model) {
        
        System.out.print(""+preg1+""+preg2+""+preg3+""+preg4+""+preg5);

        if (preg1.trim().equals("si") && preg2.trim().equals("si") && preg3.trim().equals("si") && preg4.trim().equals("si")&& preg5.trim().equals("si") ) {

            model.addAttribute("respuesta1", preg1);
            model.addAttribute("respuesta2", preg2);
            model.addAttribute("respuesta3", preg3);
            model.addAttribute("respuesta4", preg4);
            model.addAttribute("respuesta5", preg5);
            return "exito";

        } else {

            String a = "NO TIENES ESTRES FELICIDADES";
            model.addAttribute("err", a);
            model.addAttribute("respuesta1", preg1);
            model.addAttribute("respuesta2", preg2);
            model.addAttribute("respuesta3", preg3);
            model.addAttribute("respuesta4", preg4);
            model.addAttribute("respuesta5", preg5);
            return "error";
        }
    }

}
