package com.cashPlus.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cashPlus.dto.UserDTO;
import com.cashPlus.model.User;
import com.cashPlus.model.base.ConstantBase;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.UserService;

@RestController
@RequestMapping("/user")
public class UserResource {
	@Autowired
	UserService userService;

	
	@ResponseBody
	@GetMapping(ConstantBase.CRUD_REST_FIND_BY_CRITERE)
	public PartialList<UserDTO> find(@RequestParam int page, @RequestParam int size, @RequestParam String name) {
		return userService.findByCriteres(PageRequest.of(page, size), name);
	}
	
	@ResponseBody
	@GetMapping(ConstantBase.CRUD_REST_FIND_BY_ID)
	public User findById(@RequestParam Long id) {
		
		return userService.findById(id);
	}

	/*
	 * // @ResponseBody // @ResponseStatus(value=HttpStatus.OK)
	 * // @PostMapping(ConstantBase.CRUD_REST_SAVE_OR_UPDATE)
	 */
	@PostMapping(value = ConstantBase.CRUD_REST_SAVE_OR_UPDATE)
	public UserDTO save(@RequestBody UserDTO userDTO) throws IOException {
		User user = userService.convertDTOtoModel(userDTO);
		return userService.convertModelToDTO(user);
	}

	@DeleteMapping(value = ConstantBase.CRUD_REST_DELETE)
	public String delete(@RequestParam Long id) {
		User user = userService.findById(id);
		if (user != null && user.getId() != null) {
			userService.delete(user);
		}

		return "deleted success";
	}

}
