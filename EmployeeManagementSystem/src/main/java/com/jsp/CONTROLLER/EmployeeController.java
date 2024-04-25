package com.jsp.CONTROLLER;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
//	API to insert employee object to DB
	@RequestMapping("/insert")
	public ModelAndView getEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("create.jsp");
		return mv;
	}
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		ModelAndView v=new ModelAndView();
		v.setViewName("Index.jsp");
		return v;
	}
//	API for searching an object in DB based on Id
	@RequestMapping("/search")
	public ModelAndView searchemployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("get.jsp");
		return mv;
	}
	@RequestMapping("/display")
	public ModelAndView findEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=dao.getEmployeeById(employee.getId());
		mv.addObject("employee", emp);
		mv.setViewName("display.jsp");
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("delete.jsp");
		return mv;
	}
	@RequestMapping("/remove")
	public String removeEmployee(@ModelAttribute Employee employee)
	{
	dao.deleteEmployee(employee.getId());
		 
		return "employee details removed successfully";
	}
	@RequestMapping("/update")
	public ModelAndView updateEmployee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("update.jsp");
		return mv;
		
	}
	
	@RequestMapping("/up")
	public ModelAndView update(@ModelAttribute Employee employee) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",dao.getEmployeeById(employee.getId()));
		mv.setViewName("updateform.jsp");
		return mv;
	}
//	API to get all employee object from DB
	@RequestMapping("/displayall")
	public ModelAndView getallEmployee()
	{
	ModelAndView mv=new ModelAndView ();
	List<Employee> employees=dao.getAllEmployee();
	mv.addObject("employeelist", employees);
	mv.setViewName("displayall.jsp");
	return mv;
	}
	
	@RequestMapping("/upp")
	public ModelAndView up(@ModelAttribute Employee employee) {
		ModelAndView mv=new ModelAndView();
		dao.updateEmployee(employee);
		mv.setViewName("Index.jsp");
		return mv;
	}

}
