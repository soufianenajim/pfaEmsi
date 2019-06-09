package com.cashPlus.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cashPlus.dao.AutreFawatirRepository;
import com.cashPlus.dao.UserRepository;
import com.cashPlus.dto.AutreFawatirDTO;
import com.cashPlus.model.AutreFawatir;
import com.cashPlus.model.User;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.AutreFawatirService;
import com.cashPlus.service.UserService;

@Service
public class AutreFawatirServiceImpl implements AutreFawatirService {
	@Autowired
	AutreFawatirRepository autreFawatirRepository;

	@Override
	public PartialList<AutreFawatirDTO> findByCriteres(Pageable page, String name) {
		Page<AutreFawatir> resultat;
		if (name.equals("") && name.length() == 0) {
			resultat = autreFawatirRepository.findAll(page);
		} else {
			resultat = autreFawatirRepository.findByCriters(page, name);
		}

		return convertToListDTO(new PartialList<>(resultat.getTotalElements(), resultat.getContent()));
	}

	@Override
	public AutreFawatir save(AutreFawatir autreFawatir) {

		return autreFawatirRepository.save(autreFawatir);
	}

	@Override
	public AutreFawatir findById(long idAutreFawatir) {

		return autreFawatirRepository.findById(idAutreFawatir).get();
	}

	@Override
	public void delete(AutreFawatir autreFawatir) {
		autreFawatirRepository.deleteById(autreFawatir.getId());
	}

	@Override
	public AutreFawatir convertDTOtoModel(AutreFawatirDTO autreFawatirDTO) {

		return new AutreFawatir(autreFawatirDTO.getBorderaux(), autreFawatirDTO.getDate(),
				autreFawatirDTO.getMontantTransfer(), convertDTOtoModel(autreFawatirDTO).getRefUser(),
				autreFawatirDTO.getFrais(), autreFawatirDTO.getRefPaiement());
	}

	@Override
	public PartialList<AutreFawatirDTO> convertToListDTO(PartialList<AutreFawatir> list) {

		return new PartialList<>(list.getCount(),
				list.getLignes().stream().map(e -> convertModelToDTO(e)).collect(Collectors.toList()));
	}

	@Override
	public AutreFawatirDTO convertModelToDTO(AutreFawatir autreFawatir) {
		return new AutreFawatirDTO(autreFawatir.getBorderaux(), autreFawatir.getDate(),
				autreFawatir.getMontantTransfer(), convertModelToDTO(autreFawatir).getRefUser(),
				autreFawatir.getFrais(), autreFawatir.getRefPaiement());
	}

}