package cn.jinronga.sms.aspect;

import com.ydl.context.BaseContextHandler;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

@Component
@Aspect
@Slf4j
public class DefaultParamsAspect {


    @SneakyThrows
    @Before("@annotation(cn.jinronga.sms.annotation.DefaultParams)")
    public void beforeEvent(JoinPoint joinPoint) {
        //从threadlocal中获取Id
        Long userId = BaseContextHandler.getUserId();
        if (userId == null) {
            userId = 0L;
        }
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            Class<?> classes = args[i].getClass();

            Object id = null;
            Method method = getMethod(classes, "getId");
            if (method != null) {
                id = method.invoke(args[i]);
            }
            //请求操作的对象的id为空时，为创建操作
            if (id == null) {
                //
                method = getMethod(classes, "setCreateUser", String.class);
                if (null != method) {
                    method.invoke(args[i], userId.toString());
                }
                method = getMethod(classes, "setCreateTime", LocalDateTime.class);
                if (null != method) {
                    method.invoke(args[i], LocalDateTime.now());
                }
            }
            //新建修改更新
            method = getMethod(classes, "setUydlateUser", String.class);
            if (null != method) {
                method.invoke(args[i], userId.toString());
            }

            method = getMethod(classes, "setUydlateTime", LocalDateTime.class);

            if (null != method) {
                method.invoke(args[i], LocalDateTime.now());
            }
        }


    }

    private Method getMethod(Class<?> classes, String name, Class... types) {
        try {
            return classes.getMethod(name, types);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }


}
