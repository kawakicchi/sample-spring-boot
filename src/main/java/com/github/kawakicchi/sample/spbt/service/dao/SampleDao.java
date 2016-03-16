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
package com.github.kawakicchi.sample.spbt.service.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.github.kawakicchi.sample.spbt.service.entity.SampleEntity;

/**
 * @author Kawakicchi
 *
 */
@Dao
@ConfigAutowireable
public interface SampleDao {

	@Select
	public SampleEntity get(final Integer id);
	
	@Select
	public List<SampleEntity> select(final SampleEntity bean);
	
	@Insert(sqlFile=true)
	public int insert(final SampleEntity bean);
	
	@Update(sqlFile=true)
	public int update(final SampleEntity bean);
}
