/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
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
package com.alibaba.csp.sentinel.slots.statistic;

/**
 * @author Eric Zhao
 */
public enum MetricEvent {

    /**
     * Normal pass.
     */
    PASS,//代表通过所有校验规则
    /**
     * Normal block.
     */
    BLOCK,//没有通过校验规则，抛出BlockException的调用
    EXCEPTION,//发生了正常业务异常的调用
    SUCCESS,//调用完成的情况,不管是否跑异常了
    RT,//所有的success调用耗费的总时间

    /**
     * Passed in future quota (pre-occupied, since 1.5.0).
     */
    OCCUPIED_PASS
}
