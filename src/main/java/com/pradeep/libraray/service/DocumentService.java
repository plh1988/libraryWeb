package com.pradeep.libraray.service;

import com.pradeep.libraray.model.Document;

public interface DocumentService {
	Document save(Document documnet);
	Document fetch(Integer id);
}
