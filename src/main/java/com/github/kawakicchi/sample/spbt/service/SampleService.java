/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.kawakicchi.sample.spbt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.kawakicchi.sample.spbt.service.dao.SampleDao;
import com.github.kawakicchi.sample.spbt.service.entity.SampleEntity;

/**
 * @author Kawakicchi
 *
 */
@Service
public class SampleService {

	@Autowired
	SampleDao dao;

	public SampleEntity get(final int id) {		
		SampleEntity entity = dao.get(id);
		return entity;
	}
	
	public List<SampleEntity> search(final String name) {
		SampleEntity entity = new SampleEntity();
		entity.setName(name);
		List<SampleEntity> list = dao.select(entity);
		return list;
	}
	
	public void regist(final SampleEntity entity) {
		dao.insert(entity);
	}
	
	public void update(final SampleEntity entity) {
		dao.update(entity);
	}
}
