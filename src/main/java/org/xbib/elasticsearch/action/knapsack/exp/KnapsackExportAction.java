/*
 * Copyright (C) 2014 Jörg Prante
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xbib.elasticsearch.action.knapsack.exp;

import org.elasticsearch.action.admin.indices.IndicesAction;
import org.elasticsearch.client.IndicesAdminClient;

/**
 * The knapsack export action exports data to archive files
 */
public class KnapsackExportAction extends IndicesAction<KnapsackExportRequest, KnapsackExportResponse, KnapsackExportRequestBuilder> {

    public final static String NAME = "org.xbib.elasticsearch.knapsack.export";

    public final static KnapsackExportAction INSTANCE = new KnapsackExportAction(NAME);

    protected KnapsackExportAction(String name) {
        super(name);
    }

    @Override
    public KnapsackExportResponse newResponse() {
        return new KnapsackExportResponse();
    }

    @Override
    public KnapsackExportRequestBuilder newRequestBuilder(IndicesAdminClient client) {
        return new KnapsackExportRequestBuilder(client);
    }
}
