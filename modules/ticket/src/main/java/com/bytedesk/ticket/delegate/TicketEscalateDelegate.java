/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2025-01-28 13:33:23
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2025-01-28 13:35:52
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license. 
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 * 
 * Copyright (c) 2025 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.ticket.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TicketEscalateDelegate implements JavaDelegate {
    
    @Override
    public void execute(DelegateExecution execution) {
        log.info("Escalating ticket for process: {}", execution.getProcessInstanceId());
        // TODO: 实现工单升级逻辑
    }
} 