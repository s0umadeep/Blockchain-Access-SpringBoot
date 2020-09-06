/**
 * 
 */
package com.vit.isf.jcomponent.blockchain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vit.isf.jcomponent.blockchain.model.Audit;
import com.vit.isf.jcomponent.blockchain.service.BlockchainService;

/**
 * @author soumadeepdhar
 *
 */

@RestController
public class BlockchainController {
	
	@Autowired
	BlockchainService blockchainservice;
	
	@GetMapping("/Blockchain/accessBlockchain")
	public Audit BlockchainAccess(@RequestParam("id") Integer id) {
		return blockchainservice.createAudit(id);
	}

	@PostMapping("/Blockchain/createBlockchain")
	public String createBlockchain(@RequestParam("name") String name) {
		return 	blockchainservice.createBlockchain(name);
	}
}
