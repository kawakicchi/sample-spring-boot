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
package com.github.kawakicchi.sample.spbt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.kawakicchi.sample.spbt.service.SampleService;
import com.github.kawakicchi.sample.spbt.service.entity.SampleEntity;

/**
 * @author Kawakicchi
 *
 */
@RestController
public class SampleController {

	@Autowired
	SampleService service;

	@RequestMapping(value = "/rest/test")
	public String test() {
		SampleEntity entity = new SampleEntity();
		entity.setId(2);
		entity.setName("NAME");
		entity.setDate(new Date());
		service.regist(entity);
		return "regist";
	}
}
