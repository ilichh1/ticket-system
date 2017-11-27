/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TicketDAO;
import bean.Reporte;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ilich
 */
@Controller
@RequestMapping("/reportes")
public class ReportesRestController {
    
    @RequestMapping(value = "getReportes", method = RequestMethod.POST, produces="application/json")
    public @ResponseBody String getReportes() {
        List<Reporte> reportes = new TicketDAO().getAllReportes();
        HashMap<String, List<Reporte>> jsonMap = new HashMap<>();
        jsonMap.put("reportes", reportes);
        Gson gson = new Gson();
        return gson.toJson(jsonMap);
    }
    
    @RequestMapping(value = "getReportes", method = RequestMethod.GET, produces="application/json")
    public @ResponseBody String getReportesGet() {
        List<Reporte> reportes = new TicketDAO().getAllReportes();
        HashMap<String, List<Reporte>> jsonMap = new HashMap<>();
        jsonMap.put("reportes", reportes);
        Gson gson = new Gson();
        return gson.toJson(jsonMap);
    }
    
    @RequestMapping(value = "saveReporte", method = RequestMethod.POST, produces="application/json")
    public @ResponseBody String saveReporte() {
        
        return "";
    }
    
}
