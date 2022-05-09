package com.myait.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myait.Model.User;

import com.myait.Service.UserService;
import com.myait.View.UserView;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/* to get record by AIT id right way */
	@GetMapping("/getEmployeeByAit_id/{id}")
	public UserView getUserById11(@PathVariable String id) {
		UserView user = userService.findByAit_id11(id);
		return user;
	}

	/* to get all Employee Right method */
	@GetMapping(value = "/getAllEmployee")
	public List<UserView> getAll1() {

		List<User> list = null;
		List<UserView> list1 = new ArrayList<>();

		list = userService.showAll();

		list.forEach(e -> {
			list1.add(new UserView(e.getFirst_name(), e.getLast_name(), e.getDesignation(), e.getAit_email(),
					e.getContact_number()));
		});

		return list1;
	}

	/* to get one record Right method */
	@GetMapping(value = "/getEmployeeByUserId/{user_id}")
	public Optional<User> getEmployeeById1(@PathVariable("user_id") int user_id) {
		return userService.getEmployeeById(user_id);
	}

	@PostMapping(value = "/save")
	public User saveEmployee(@RequestBody User user) {
		return userService.saveEmployee(user);
	}

	@PutMapping(value = "/update")
	public User updateEmployee(@RequestBody User user) {
		return userService.saveEmployee(user);

	}



}
