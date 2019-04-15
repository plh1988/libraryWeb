package com.pradeep.libraray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.libraray.model.Document;
import com.pradeep.libraray.service.DocumentService;

@RestController
@RequestMapping(value = "/library")
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	@RequestMapping(value = "document",method = RequestMethod.POST)
	public Document save(@RequestBody Document document) {
		return documentService.save(document);
	}
	
}
