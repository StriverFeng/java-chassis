/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.serviceregistry.api.response;

import java.util.ArrayList;
import java.util.List;

import io.servicecomb.serviceregistry.api.registry.MicroserviceInstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @since Mar 14, 2017
 * @see 
 */
public class TestGetInstancesResponse {

    GetInstancesResponse oGetInstancesResponse = null;

    List<MicroserviceInstance> oListMicroserviceInstance = null;

    @Before
    public void setUp() throws Exception {
        oGetInstancesResponse = new GetInstancesResponse();
        oListMicroserviceInstance = new ArrayList<>();
        oListMicroserviceInstance.add(Mockito.mock(MicroserviceInstance.class));
    }

    @After
    public void tearDown() throws Exception {
        oGetInstancesResponse = null;
        oListMicroserviceInstance = null;
    }

    @Test
    public void testDefaultValues() {
        Assert.assertNull(oGetInstancesResponse.getInstances());
    }

    @Test
    public void testIntializedValues() {
        initFields(); //Initialize the Object
        Assert.assertEquals(1, oGetInstancesResponse.getInstances().size());
    }

    private void initFields() {
        oGetInstancesResponse.setInstances(oListMicroserviceInstance);
    }

}
