package com.store.controller;

import com.store.services.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyBookController {
    @Autowired
    private MyBookService myBookService ;

    @RequestMapping("/deleteMyList/{id}")
    public ModelAndView deleteMyList(@PathVariable("id") int id) {
        myBookService.deleteById(id);
        return new ModelAndView("redirect:/my_books") ;
    }
}
