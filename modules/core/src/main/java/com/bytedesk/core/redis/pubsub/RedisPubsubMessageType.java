/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2024-08-28 14:45:30
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2024-08-30 16:42:34
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license.
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 *  联系：270580156@qq.com
 * Copyright (c) 2024 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.core.redis.pubsub;

public enum RedisPubsubMessageType {
    PARSE_FILE,
    PARSE_FILE_SUCCESS,
    PARSE_FILE_ERROR,
    //
    DELETE_FILE,
    DELETE_FILE_SUCCESS,
    DELETE_FILE_ERROR,
    //
    QUESTION,
    ANSWER,
    ANSWER_FINISHED,

    ;

    // 根据字符串查找对应的枚举常量
    public static RedisPubsubMessageType fromValue(String value) {
        for (RedisPubsubMessageType type : RedisPubsubMessageType.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No RedisPubsubMessageType constant with value: " + value);
    }

}
