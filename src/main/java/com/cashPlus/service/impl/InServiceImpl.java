package com.cashPlus.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cashPlus.dao.InRepository;
import com.cashPlus.dto.InDTO;
import com.cashPlus.model.In;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.InService;

@Service
public class InServiceImpl implements InService {
	@Autowired
	InRepository inRepository;

	@Override
	public PartialList<InDTO> findByCriteres(Pageable page, String name) {
		Page<In> resultat;
		if (name.equals("") && name.length() == 0) {
			resultat = inRepository.findAll(page);
		} else {
			resultat = inRepository.findByCriters(page, name);
		}

		return convertToListDTO(new PartialList<>(resultat.getTotalElements(), resultat.getContent()));
	}

	@Override
	public In save(In in) {

		return inRepository.save(in);
	}

	@Override
	public In findById(long idIn) {

		return inRepository.findById(idIn).get();
	}

	@Override
	public void delete(In in) {
		inRepository.deleteById(in.getId());
	}

	@Override
	public In convertDTOtoModel(InDTO u) {
		
	return new In(u.getBorderaux(), u.getDate(), u.getMontantTransfer(), convertDTOtoModel(u).getRefUser(), u.getSms(), u.getFrais());
	}

	@Override
	public PartialList<InDTO> convertToListDTO(PartialList<In> list) {
		return new PartialList<>(list.getCount(),
				list.getLignes().stream().map(e -> convertModelToDTO(e)).collect(Collectors.toList()));
	}

	@Override
	public InDTO convertModelToDTO(In u) {
		
		return new InDTO(u.getBorderaux(), u.getDate(), u.getMontantTransfer(), convertModelToDTO(u).getRefUser(), u.getSms(), u.getFrais());
	}

}
