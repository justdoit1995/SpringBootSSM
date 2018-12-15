package com.example.Controller;

import com.example.Dao.StudentMapper;
import com.example.models.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("value=StudentController|学生控制器")
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @ResponseBody
    @RequestMapping(value="/demo",method= RequestMethod.GET)
    @ApiOperation(value="获取学生信息")
    @ApiImplicitParam(paramType = "query",name="id",value="学生id",required = true,dataType = "Integer")
    public Student get(@RequestParam Integer id){
        Student student=studentMapper.getStudentByID(id);
        return  student;
    }


    @RequestMapping(value = "res")
    public String df(){
        return "Hello";
    }
}