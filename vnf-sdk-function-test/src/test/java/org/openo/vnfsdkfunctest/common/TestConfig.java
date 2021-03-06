/*
 * Copyright 2017 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.vnfsdkfunctest.common;

import org.junit.Before;
import org.junit.Test;
import org.openo.vnfsdk.functest.VnfSdkFuncTestAppConfiguration;

import io.dropwizard.db.DataSourceFactory;

import org.openo.vnfsdk.functest.common.Config;

import static org.junit.Assert.assertNotNull;

public class TestConfig {
	
	private VnfSdkFuncTestAppConfiguration vnfSdkBean;
	
	@Before
	public void setUp() {
		vnfSdkBean = new VnfSdkFuncTestAppConfiguration();		
	}
	
	@Test
	public void testVnfSdkConfigBean() {
		vnfSdkBean.setTemplate( "" );
        vnfSdkBean.setMsbServerAddr( "127.0.0.1" );
        vnfSdkBean.setServiceIp( "127.0.0.1" );
        vnfSdkBean.setDataSourceFactory( new DataSourceFactory() );
        
        Config.setConfigration( vnfSdkBean );
        assertNotNull( Config.getConfigration() );
	}	
}
