package com.vit.isf.jcomponent.blockchain.dao;

import org.springframework.stereotype.Repository;

import com.vit.isf.jcomponent.blockchain.model.Audit;

@Repository
public interface BlockchainDao {

	public void addBlockchain(Audit audit);
}
