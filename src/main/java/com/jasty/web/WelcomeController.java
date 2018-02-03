package com.jasty.web;

import org.springframework.stereotype.Controller;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by cppc on 2018-01-28.
 */
@Controller
public class WelcomeController {

    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("msg", "");
        return "index";
    }

    @RequestMapping(value="/high/error")
    public String highError(Model model) {
        model.addAttribute("msg", null);
        return "index";
    }

    @RequestMapping(value="/high/solve")
    public String highSolve(Model model) throws Exception {
        Map<String, Object> highData = new LinkedHashMap<>();
        highData.put("msg", null);

        model.addAttribute("high", template("high", highData));
        model.addAttribute("low", template("low", new LinkedHashMap<>()));
        return "index2";
    }

    private String template(String templateName, Map<String, Object> data) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
        cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
        try {
            Template template = cfg.getTemplate(templateName+".ftl");
            Writer out = new StringWriter();
            template.process(data, out);
            return out.toString();

        }catch (Exception e){
            return "";
        }
    }


    @RequestMapping(value = "/taglib")
    public String taglib(Model model) throws Exception {
        model.addAttribute("notNullValue", "Null이 아니에요");
        model.addAttribute("nullValue", null);
        model.addAttribute("taglib", new TagLibrary());
        return "taglib";
    }
}
