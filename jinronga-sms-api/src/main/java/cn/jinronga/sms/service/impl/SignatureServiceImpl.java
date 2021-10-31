package cn.jinronga.sms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jinronga.sms.entity.SignatureEntity;
import cn.jinronga.sms.mapper.SignatureMapper;
import cn.jinronga.sms.service.SignatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 短信签名
 *
 * @author IT李老师
 *
 */
@Service
public class SignatureServiceImpl extends ServiceImpl<SignatureMapper, SignatureEntity> implements SignatureService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public SignatureEntity getByCode(String signature) {
        ValueOperations<String, SignatureEntity> ops = redisTemplate.opsForValue();
        SignatureEntity signatureEntity = ops.get(signature);
        if (signatureEntity == null) {
            LambdaQueryWrapper<SignatureEntity> wrapper = new LambdaQueryWrapper();
            wrapper.eq(SignatureEntity::getCode, signature);
            signatureEntity = baseMapper.selectOne(wrapper);
            ops.set(signature, signatureEntity, 60, TimeUnit.SECONDS);
        }
        return signatureEntity;
    }
}
