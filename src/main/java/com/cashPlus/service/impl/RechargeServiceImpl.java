package com.cashPlus.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cashPlus.dao.RechargeRepository;
import com.cashPlus.dto.RechargeDTO;
import com.cashPlus.model.Recharge;
import com.cashPlus.model.base.PartialList;
import com.cashPlus.service.RechargeService;

@Service
public class RechargeServiceImpl implements RechargeService {
	@Autowired
	RechargeRepository rechargeRepository;

	@Override
	public PartialList<RechargeDTO> findByCriteres(Pageable page, String name) {
		Page<Recharge> resultat;
		if (name.equals("") && name.length() == 0) {
			resultat = rechargeRepository.findAll(page);
		} else {
			resultat = rechargeRepository.findByCriters(page, name);
		}

		return convertToListDTO(new PartialList<>(resultat.getTotalElements(), resultat.getContent()));
	}

	@Override
	public Recharge save(Recharge neoSurfExpress) {

		return rechargeRepository.save(neoSurfExpress);
	}

	@Override
	public Recharge findById(long idRecharge) {

		return rechargeRepository.findById(idRecharge).get();
	}

	@Override
	public void delete(Recharge t) {
		rechargeRepository.deleteById(t.getId());

	}

	@Override
	public Recharge convertDTOtoModel(RechargeDTO u) {
		return new Recharge(u.getBorderaux(), u.getDate(), u.getMontantTransfer(), convertDTOtoModel(u).getRefUser(), u.getFrais(), u.getNumTelephone());
	}

	@Override
	public PartialList<RechargeDTO> convertToListDTO(PartialList<Recharge> list) {
		return new PartialList<>(list.getCount(),
				list.getLignes().stream().map(e -> convertModelToDTO(e)).collect(Collectors.toList()));
	}

	@Override
	public RechargeDTO convertModelToDTO(Recharge u) {
		
		return new RechargeDTO(u.getBorderaux(), u.getDate(), u.getMontantTransfer(), convertModelToDTO(u).getRefUser(), u.getFrais(), u.getNumTelephone());
	}

}
