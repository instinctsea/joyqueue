/**
 * Copyright 2019 The JoyQueue Authors.
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
package org.joyqueue.repository;

import org.joyqueue.model.Codeable;
import org.joyqueue.model.domain.Metric;
import org.joyqueue.model.query.QMetric;
import org.springframework.stereotype.Repository;

/**
 * 指标
 */
@Repository
public interface MetricRepository extends PageRepository<Metric, QMetric>, Codeable<Metric> {

    Metric findByAliasCode(String aliasCode);

}
