package com.hb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.dao.EmployeeDao;
import com.hb.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;

	@RequestMapping(value="/empform")
	public String newEmpForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "newEmpForm";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee emp) {
		empDao.save(emp);
		System.out.println("Employee Saved Successfully..!!");
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value="/viewemp")
	public String listEmp(Model m) {
		List<Employee> listEmployee = empDao.getEmployees();
		m.addAttribute("listEmployee", listEmployee);
		return "viewemp";
	}
	
	@RequestMapping(value="/editemp/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee emp = empDao.getEmpById(id);
		m.addAttribute("editForm",emp);
		return "empEditForm";
	}
	
	 @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	 public String editSave(@ModelAttribute("emp") Employee emp) {
		 empDao.update(emp);
			System.out.println("Employee Updated Successfully..!!");
		 return "redirect:/viewemp";
	 }
	
	@RequestMapping(value="/deleteemp/{id}")
	public String delete(@PathVariable int id) {
		empDao.delete(id);
		System.out.println("Employee Deleted Successfully..!!");
		return "redirect:/viewemp";
	}
	
}
