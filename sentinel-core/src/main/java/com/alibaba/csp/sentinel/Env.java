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
package com.alibaba.csp.sentinel;

import com.alibaba.csp.sentinel.init.InitExecutor;

/**
 * Sentinel Env. This class will trigger all initialization for Sentinel.
 *
 * <p>
 * NOTE: to prevent deadlocks, other classes' static code block or static field should
 * NEVER refer to this class.
 * </p>
 *
 * @author jialiang.linjl
 */
public class Env {

    public static final Sph sph = new CtSph();

    //第一次调用Env.sph.entryWithType方法，Env初始化阶段执行静态代码块
    static {
        //通过SPI机制加载Sentinel相关依赖包下META-INFO/services/下的所有InitFunc实例类,然后调用其init方法
        InitExecutor.doInit();
    }

}
