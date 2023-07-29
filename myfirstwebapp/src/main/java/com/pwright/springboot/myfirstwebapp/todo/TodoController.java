package com.pwright.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	// list-todos
	@RequestMapping("list-todos")
	public String listAllTodos() {
		return "list-todos";
	}

}
