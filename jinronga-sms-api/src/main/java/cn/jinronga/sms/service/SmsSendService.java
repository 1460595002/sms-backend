package cn.jinronga.sms.service;

import cn.jinronga.sms.dto.SmsBatchParamsDTO;
import cn.jinronga.sms.dto.SmsParamsDTO;

public interface SmsSendService {
    void send(SmsParamsDTO smsParamsDTO);

    void batchSend(SmsBatchParamsDTO smsBatchParamsDTO);
}
