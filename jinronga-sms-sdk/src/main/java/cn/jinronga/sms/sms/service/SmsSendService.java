package cn.jinronga.sms.sms.service;

import cn.jinronga.sms.sms.dto.R;
import cn.jinronga.sms.sms.dto.SmsBatchParamsDTO;
import cn.jinronga.sms.sms.dto.SmsParamsDTO;

public interface SmsSendService {
    R sendSms(SmsParamsDTO smsParamsDTO);

    R batchSendSms(SmsBatchParamsDTO smsBatchParamsDTO);
}
