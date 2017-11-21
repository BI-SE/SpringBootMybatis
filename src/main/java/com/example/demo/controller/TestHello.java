package com.example.demo.controller;


import com.example.demo.entity.ggCodeEntity;
import com.example.demo.mapper.ggcodeMapper;
import com.example.demo.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * this is a test
 *
 * @author ROG
 * @create 2017-10-09-16:16
 */
@RestController
@RequestMapping("/users")
public class TestHello {

    static Map<Long,User> map;

    final static  private String SUCCESS = "操作成功！";

    @Resource
    private ggcodeMapper ggcodeMapper;

    static {
        map = Collections.synchronizedMap(new HashMap<>());
    }
    @ApiOperation(value = "获取用户列表" ,notes = "")
    @RequestMapping(value ="/getUserList.do",method = RequestMethod.GET)
    public List<User> getUser() {
        List<User> list = new ArrayList<>(map.values());
        return list;
    }

    @ApiOperation(value = "新增用户",notes = "根据User对象创建新用户")
    @ApiImplicitParam(name = "user",value = "用户实体对象",required =true,dataType = "User")
    @RequestMapping(value ="/addUser.do",method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        map.put(user.getId(),user);

        return SUCCESS;
    }

    @ApiOperation(value = "获取用户",notes = "根据url中的用户id获取用户信息")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long",paramType = "path")
    @RequestMapping(value ="/getUserById/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable Long id){
        return  map.get(id);
    }

    @ApiOperation(value = "更新用户",notes = "根据url中的用户id更新用户对象，并且根据传过来的用户对象更新信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "url中的用户id",required = true,dataType = "Long",paramType = "path"),
            @ApiImplicitParam(name = "user",value = "用户实体对象",required = true,dataType = "User")
    })
    @RequestMapping(value ="/updateUserById/{id}",method = RequestMethod.PUT)
    public String updateUserById(@PathVariable Long id,@ModelAttribute User user){
        User u = map.get(id);

        u.setAge(user.getAge());
        u.setName(user.getName());

        map.put(u.getId(),u);

        return  SUCCESS;

    }

    @ApiOperation(value = "根据用户id删除用户信息",notes = "")
    @ApiImplicitParam(name = "id",value = "url中的用户id",required = true,dataType = "Long",paramType = "path")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable Long id){
        map.remove(id);
        return  SUCCESS;
    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/gg")
    @ResponseBody
    public ggCodeEntity gg() throws Exception {

        ggCodeEntity ggCodeEntity = ggcodeMapper.getGgcode("110000","City");
       return  ggCodeEntity;
    }


}
