package com.vit.isf.jcomponent.blockchain.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vit.isf.jcomponent.blockchain.model.Audit;

@Repository
public class BlockchainDaoImpl implements BlockchainDao {

	@Autowired
	private AuditRepository audirepository;

	@Override
	public void addBlockchain(Audit audit) {
		audirepository.insert(audit);
	}
	
	
}
