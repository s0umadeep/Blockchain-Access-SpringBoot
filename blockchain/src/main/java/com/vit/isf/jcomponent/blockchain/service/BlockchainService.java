package com.vit.isf.jcomponent.blockchain.service;

import org.springframework.stereotype.Service;

import com.vit.isf.jcomponent.blockchain.model.Audit;

@Service
public interface BlockchainService{

	public Audit createAudit(int id);

	public String createBlockchain(String name);
}
