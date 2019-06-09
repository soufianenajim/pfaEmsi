package com.cashPlus.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cashPlus.dao.CtmRepository;
import com.cashPlus.dto.CtmDTO;
import com.cashPlus.model.Ctm;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.CtmService;

@Service
public class CtmServiceImpl implements CtmService {
	@Autowired
	CtmRepository ctmRepository;

	@Override
	public PartialList<CtmDTO> findByCriteres(Pageable page, String name) {
		Page<Ctm> resultat;
		if (name.equals("") && name.length() == 0) {
			resultat = ctmRepository.findAll(page);
		} else {
			resultat = ctmRepository.findByCriters(page, name);
		}

		return convertToListDTO(new PartialList<>(resultat.getTotalElements(), resultat.getContent()));
	}

	@Override
	public Ctm save(Ctm ctm) {

		return ctmRepository.save(ctm);
	}

	@Override
	public Ctm findById(long idCtm) {

		return ctmRepository.findById(idCtm).get();
	}

	@Override
	public void delete(Ctm ctm) {
		ctmRepository.deleteById(ctm.getId());
	}

	@Override
	public Ctm convertDTOtoModel(CtmDTO u) {

		return new Ctm(u.getBorderaux(), u.getDate(), u.getMontantTransfer(), convertDTOtoModel(u).getRefUser(),
				u.getNumCtm());
	}

	@Override
	public PartialList<CtmDTO> convertToListDTO(PartialList<Ctm> list) {

		return new PartialList<>(list.getCount(),
				list.getLignes().stream().map(e -> convertModelToDTO(e)).collect(Collectors.toList()));
	}

	@Override
	public CtmDTO convertModelToDTO(Ctm u) {
		return new CtmDTO(u.getBorderaux(), u.getDate(), u.getMontantTransfer(), convertModelToDTO(u).getRefUser(),
				u.getNumCtm());

	}

}