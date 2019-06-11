package com.cashPlus.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cashPlus.dto.OutDTO;
import com.cashPlus.model.Out;
import com.cashPlus.model.base.ConstantBase;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.OutService;

@RestController
@RequestMapping("/out")
public class OutResource {
	@Autowired
	OutService outService;

	@ResponseBody
	@GetMapping(ConstantBase.CRUD_REST_FIND_BY_CRITERE)
	public PartialList<OutDTO> find(@RequestParam int page, @RequestParam int size, @RequestParam String name) {
		return outService.findByCriteres(PageRequest.of(page, size), name);
	}

	/*
	 * // @ResponseBody // @ResponseStatus(value=HttpStatus.OK)
	 * // @PostMapping(ConstantBase.CRUD_REST_SAVE_OR_UPDATE)
	 */ 
	@RequestMapping(value = ConstantBase.CRUD_REST_SAVE_OR_UPDATE, method = RequestMethod.POST)
	public OutDTO save(@RequestBody OutDTO outDTO,@RequestParam String id) throws IOException {
		Out out = outService.convertDTOtoModel(outDTO);
		return outService.convertModelToDTO(out);
	}
	
	@DeleteMapping(value = ConstantBase.CRUD_REST_DELETE)
	public String delete(@RequestParam Long id) {
		Out out = outService.findById(id);
		if (out != null && out.getId() != null) {
			outService.delete(out);
		}

		return "deleted success";
	}
}
