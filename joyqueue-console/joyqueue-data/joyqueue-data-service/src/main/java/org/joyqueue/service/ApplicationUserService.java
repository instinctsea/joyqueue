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
package org.joyqueue.service;

import org.joyqueue.model.Uniqueable;
import org.joyqueue.model.domain.ApplicationUser;
import org.joyqueue.model.query.QApplicationUser;

import java.util.List;

/**
 * 应用-用户关联关系 服务
 * Created by chenyanying on 2018-10-17.
 */
public interface ApplicationUserService extends PageService<ApplicationUser, QApplicationUser>, Uniqueable<ApplicationUser> {
    ApplicationUser findByUserApp(String user, String app);
    int deleteByAppId(long appId);
    List<ApplicationUser> findAppByUser(String user);
}