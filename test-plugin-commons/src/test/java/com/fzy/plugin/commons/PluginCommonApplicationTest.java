package com.fzy.plugin.commons;

import com.fzy.plugin.commons.model.PcUser;
import com.fzy.plugin.commons.model.UcUser;
import io.github.fengzaiyao.plugin.common.util.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PluginCommonApplicationTest {

    @Test
    public void TestBeanUtil() {
        UcUser ucUser = ObtainUser();
        PcUser pcUser = BeanUtil.copyBean(ucUser, PcUser.class);
        System.out.println(pcUser);
    }

    @Test
    public void TestJsonUtil() {
        UcUser ucUser = ObtainUser();
        String json = JsonUtil.toJson(ucUser);
        System.out.println(json);
    }

    @Test
    public void TestReflectionsUtil() {
        System.out.println(ReflectionsUtil.convert(UcUser::getAge));
        System.out.println(ReflectionsUtil.convert(UcUser::getEmail));
    }

    @Test
    public void TestStringCaseUtil() {
        System.out.println(StringCaseUtil.toLine("myIsHaHa"));
        System.out.println(StringCaseUtil.lowerFirstCase("NiHao"));
    }

    @Test
    public void TestTimeUtil() {
        System.out.println(TimeUtil.getBeforeDailyEndTime(2, System.currentTimeMillis(), "GMT+8:00"));
    }

    private UcUser ObtainUser() {
        UcUser ucUser = new UcUser();
        ucUser.setAge(666);
        ucUser.setUsername("年年岁岁");
        ucUser.setPassword("fzy12134");
        ucUser.setEmail("2677176483@qq.com");
        return ucUser;
    }
}
